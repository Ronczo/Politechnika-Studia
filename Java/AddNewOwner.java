package pl.edu.pg;

import pl.edu.pg.model.Owner;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddNewOwner {

    public Saveable addNewOwner(List<Owner> list) {
        /*
        Adds new objects and saves it in file users.txt
         */

        // Getting information about new object
        try {
            System.out.println("Adding new Owner.\nEnter name: ");

            Scanner scanner = new Scanner(System.in);
            String newName = scanner.next();

            System.out.println("Enter surname: ");
            String newSurname = scanner.next();

            System.out.println("Enter sex (type \"male\" or \"female\"): ");
            String newSex = scanner.next();

            System.out.println("Enter age: ");
            int newAge = scanner.nextInt();

            // transforms inforamtion into data acceptable by program
            Owner.Sex sexForCreationObject;
            if (newSex.equals("male")) {
                sexForCreationObject = Owner.Sex.MALE;
            } else if (newSex.equals("female")) {
                sexForCreationObject = Owner.Sex.FEMALE;
            } else {
                sexForCreationObject = Owner.Sex.UNDEFINED;
            }

            Owner newOwner = new Owner(newName, newAge, newSurname);
            newOwner.setSex(sexForCreationObject);

            //Sets ID of Owner
            for (Owner owner : list) {
                if (owner.getId() >= newOwner.getId()) {
                    newOwner.setId(owner.getId() + 1);
                }
            }

            return newOwner;

        } catch (InputMismatchException e) {
            System.out.println("You entered wrong data, please try again");
        }
        return null;
    }
}
