package pl.edu.pg;

import java.util.Scanner;

public class MainManu {

    public int startMainManu() {
        /*
        Shows main manu of the program
         */
        System.out.println("Main manu of \"Magic Garden\"");
        System.out.println("Please select an option by typing a number assigned to the option:");
        System.out.println("1 - Add an owner");
        System.out.println("2 - Delete the owner");
        System.out.println("3 - Display list of the owners");
        System.out.println("4 - Add an animal");
        System.out.println("5 - Delete the animal");
        System.out.println("6 - Display list of the animals");
        System.out.println("7 - Feed a turtle");
        System.out.println("8 - Move an animal");
        System.out.println("9 - Visualisation of the garden");

        System.out.println("0 - Exit program");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
