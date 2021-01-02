package pl.edu.pg;

import pl.edu.pg.model.Animal;
import pl.edu.pg.model.Turtle;


import java.util.List;
import java.util.Scanner;

public class MoveTheAnimal {

    public void moveAnimal(List<Animal> animalList, int gardenSize) {
        /*
        The method moves an animal and saves changes in file animals.txt
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Moving a animal.\nEnter ID of animal, which you want to move: ");
        int animalID = scanner.nextInt();

        System.out.println("Where do you want to move the animal? Write \"up\", \"down\", \"left\" or \"right\" ");
        String moveAnimalTo = scanner.next();


        for (Animal animal : animalList) {

            if (animalID == animal.getId()) {
                if (animal.getAnimalType().equals("turtle")) {
                    Turtle currentAnimal = (Turtle) animal;
                    if (currentAnimal.getStatus() == Turtle.Status.HIDDEN) {
                        System.out.println("The turtle is hungry! Feed him if you want to move him!");
                        break;
                    }else {
                        currentAnimal.setStatus(Turtle.Status.HIDDEN);
                    }
                }
                if (moveAnimalTo.equals("right")) {
                    if (animal.getActualPositionX() < gardenSize) {
                        animal.setActualPositionX(animal.getActualPositionX() + 1);
                    } else {
                        System.out.println("You can't move animal outside the Garden!");
                    }
                }else if (moveAnimalTo.equals("left")) {
                    if (animal.getActualPositionX() > 1) {
                        animal.setActualPositionX(animal.getActualPositionX() - 1);
                    } else {
                        System.out.println("You can't move animal outside the Garden!");
                    }
                }else if (moveAnimalTo.equals("up")) {
                    if (animal.getActualPositionY() > 1) {
                        animal.setActualPositionY(animal.getActualPositionY() - 1);
                    } else {
                        System.out.println("You can't move animal outside the Garden!");
                    }
                }else if (moveAnimalTo.equals("down")) {
                    if (animal.getActualPositionY() < gardenSize) {
                        animal.setActualPositionY(animal.getActualPositionY() + 1);
                    } else {
                        System.out.println("You can't move animal outside the Garden!");
                    }
                }else {
                    System.out.println("You entered wrong destination. Try again.");
                }


                boolean append = false;

                for (Animal object : animalList) {
                    SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
                    saveObjectToFile.saveObject(object, append);
                    append = true;
                }
            }
        }
    }
}
