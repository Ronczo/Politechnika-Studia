package pl.edu.pg;


import pl.edu.pg.model.Owner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListOfTheOwners {

    public List<Owner> readListOfTheOwnersFromFile() {
        /*
        Creates list of owners from the file users.txt
         */
        File file = new File("users.txt");
        List<Owner> readOwners = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int id = Integer.parseInt(scanner.nextLine());
                String firstName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String sex = scanner.nextLine();
                String surname = scanner.nextLine();

                Owner.Sex sexForCreationObject;
                if (sex.equals("male")) {
                    sexForCreationObject = Owner.Sex.MALE;
                } else if (sex.equals("female")) {
                    sexForCreationObject = Owner.Sex.FEMALE;
                } else {
                    sexForCreationObject = Owner.Sex.UNDEFINED;
                }

                Owner newOwner = new Owner(id, firstName, age, surname);
                newOwner.setSex(sexForCreationObject);

                readOwners.add(newOwner);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readOwners;

    }
}
