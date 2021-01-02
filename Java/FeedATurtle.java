package pl.edu.pg;

import pl.edu.pg.model.Animal;
import pl.edu.pg.model.Turtle;

import java.util.List;
import java.util.Scanner;

public class FeedATurtle {

    public void feedTheTurtle(List<Animal> animalList) {
        /*
        Method allows to feed the turtle. Fed turtle can move!
         */

        System.out.println("Feeding the turtle.\nEnter ID of turtle, which you want to feed: ");
        Scanner scanner = new Scanner(System.in);
        int turtleID = scanner.nextInt();

        for(int i = 0; i < animalList.size(); i++){
            Turtle currentAnimal = (Turtle) animalList.get(i);
            if (currentAnimal.getId() == turtleID) {
                currentAnimal.setStatus(Turtle.Status.ACTIVE);
            }
        }

        // Saving changes
        boolean append = false;

        for(int i = 0; i < animalList.size(); i++) {
            Animal animalToSave = animalList.get(i);
            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
            saveObjectToFile.saveObject(animalToSave, append);
            append = true;
        }
    }
}
