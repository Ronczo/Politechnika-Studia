package pl.edu.pg;


import pl.edu.pg.model.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DeleteTheAnimal {

    public void deleteAnimal(List<Animal> list) {
        /*
        Method deletes animal from the list of animals and from file animals.txt
         */
        System.out.println("Enter ID of Animal you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        int inputID = scanner.nextInt();

        FileWriter fw = null;
        try {
            fw = new FileWriter("animals.txt");
            fw.write("");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.removeIf(owner -> owner.getId() == inputID); //IntelliJ IDEA suggested this one :)
        for (Animal animal : list) {
            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
            saveObjectToFile.saveObject(animal, true);
        }

    }
}