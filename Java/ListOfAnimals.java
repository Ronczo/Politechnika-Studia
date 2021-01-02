package pl.edu.pg;

import pl.edu.pg.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfAnimals {

    public List<Animal> readListOfTheAnimalsFromFile(List<Owner> listOfOwners) {
        /*
        Create list of animals from the file animals.txt
         */
        File file = new File("animals.txt");
        List<Animal> readAnimals = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String animalType = scanner.nextLine();
                int id = Integer.parseInt(scanner.nextLine());
                String firstName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String sex = scanner.nextLine();
                int positionX = Integer.parseInt(scanner.nextLine());
                int positionY = Integer.parseInt(scanner.nextLine());
                int petsOwnerID = Integer.parseInt(scanner.nextLine());
                String raceOrStatus = scanner.nextLine();

                Turtle.Status turtleStatus = null;
                if (animalType.equals("turtle")) {
                    if (raceOrStatus.equals("active")) {
                        turtleStatus = Turtle.Status.ACTIVE;
                    } else if (raceOrStatus.equals("hidden in shell")) {
                        turtleStatus = Turtle.Status.HIDDEN;
                    } else {
                        turtleStatus = Turtle.Status.UNKNOWN;
                    }
                }

                Owner petOwner = null;
                for (Owner owner : listOfOwners) {
                    if (owner.getId() == petsOwnerID) {
                        petOwner = owner;
                    }
                }

                Animal.Sex sexForCreationObject;
                if (sex.equals("male")) {
                    sexForCreationObject = Animal.Sex.MALE;
                } else if (sex.equals("female")) {
                    sexForCreationObject = Animal.Sex.FEMALE;
                } else {
                    sexForCreationObject = Animal.Sex.UNDEFINED;
                }
                Animal newAnimal = null;
                if (animalType.equals("turtle")) {
                    newAnimal = new Turtle(firstName, age, id, positionX, positionY, petOwner, turtleStatus, animalType);
                    newAnimal.setSex(sexForCreationObject);
                } else if (animalType.equals("dog")) {
                    newAnimal = new Dog(id, firstName, age, petOwner, positionX, positionY, raceOrStatus, animalType);
                    newAnimal.setSex(sexForCreationObject);
                } else if (animalType.equals("cat")) {
                    newAnimal = new Cat(id, firstName, age, petOwner, positionX, positionY, raceOrStatus, animalType);
                    newAnimal.setSex(sexForCreationObject);
                }
                readAnimals.add(newAnimal);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readAnimals;
    }
}