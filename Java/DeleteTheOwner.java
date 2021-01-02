package pl.edu.pg;

import pl.edu.pg.model.Owner;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DeleteTheOwner {

    public void deleteOwner(List<Owner> list) {
        /*
        Deletes owner from the list of owners and from file users.txt
         */
        System.out.println("Enter ID of Owner you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        int inputID = scanner.nextInt();

        FileWriter fw = null;
        try {
            fw = new FileWriter("users.txt");
            fw.write("");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.removeIf(owner -> owner.getId() == inputID); //IntelliJ IDEA suggested this solution :)
        for (Owner owner : list) {
            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
            saveObjectToFile.saveObject(owner, true);
        }
    }
}
