package pl.edu.pg;

import pl.edu.pg.model.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddNewAnimal {

    public Saveable addNewAnimal(List<Owner> listOfOwners, List<Animal> listOfAnimals) {
        /*
        Method adds new animal to the list of animals and saves new object in file animals.txt
         */


        // Getting information about new object
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Adding new Animal.\nEnter type of animal (type: \"dog\", \"cat\", \"turtle\"): ");
            String enteredTypeOfAnimal = scanner.next();

            System.out.println("Enter name: ");
            String newName = scanner.next();

            System.out.println("Enter age: ");
            int newAge = scanner.nextInt();

            System.out.println("Enter sex (type \"male\" or \"female\"): ");
            String newSex = scanner.next();

            // Changes information into value acceptable by program
            Owner.Sex sexForCreationObject;
            if (newSex.equals("male")) {
                sexForCreationObject = Owner.Sex.MALE;
            } else if (newSex.equals("female")) {
                sexForCreationObject = Owner.Sex.FEMALE;
            } else {
                sexForCreationObject = Owner.Sex.UNDEFINED;
            }

            //Finds object Owner and connects it to the new animal
            System.out.println("Enter ID of owner, who is responsible for this animal: ");
            int newOwnerID = scanner.nextInt();
            Owner petOwner = null;
            for (Owner owner : listOfOwners) {
                if (newOwnerID == owner.getId()) {
                    petOwner = owner;
                }
            }

            String newRace = null;
            if (enteredTypeOfAnimal.equals("dog") || enteredTypeOfAnimal.equals("cat")) {
                System.out.println("Enter race: ");
                newRace = scanner.next();
            }

            switch (enteredTypeOfAnimal) {
                /*
                * IntelliJ IDEA suggested this solution :)
                * Creates objects depends on type of animal
                * */
                case "dog" -> {
                    Dog newObject = new Dog(newName, newAge, petOwner, newRace, "dog");
                    newObject.setSex(sexForCreationObject);
                    return newObject;
                }
                case "cat" -> {
                    Cat newObject = new Cat(newName, newAge, petOwner, newRace, "cat");
                    newObject.setSex(sexForCreationObject);
                    return newObject;
                }
                case "turtle" -> {
                    Turtle newObject = new Turtle(newName, newAge, petOwner, Turtle.Status.ACTIVE, "turtle");
                    newObject.setSex(sexForCreationObject);
                    System.out.println("Status of created turtle is \"ACTIVE\"");
                    return newObject;
                }
                default -> throw new InputMismatchException();
            }

        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("You entered wrong data, please try again");
        }



        return null;
    }
}
