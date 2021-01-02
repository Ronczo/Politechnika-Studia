package pl.edu.pg;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveObjectToFile {
    /*
    The method saves object in file *.txt
     */

    public void saveObject(Saveable objectToSave, boolean append) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(objectToSave.getFileNameToSave(), append);
            bw = new BufferedWriter(fw);
            bw.write(objectToSave.getDataToSave());
        } catch (IOException e) {
            System.out.println("Error! Saving to the file " + objectToSave.getFileNameToSave() + " failed");
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error! Saving to the file " + objectToSave.getFileNameToSave() + " failed");
                    e.printStackTrace();
                }
            }
        }
    }
}
