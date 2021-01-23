package pl.edu.pg;

import pl.edu.pg.model.Animal;
import pl.edu.pg.model.Owner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BecomeOlder {
    public void CreatureBecomeOlder(List<Animal> animalList, List<Owner> ownerList) {

        //animals

        for (Animal animal : animalList) {
            int oldAge = animal.getAge();
            animal.setAge(1 + oldAge);
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter("animals.txt");
            fw.write("");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        animalList.removeIf(animalToDelete -> animalToDelete.getAge() > 20  && !animalToDelete.getAnimalType().equals("turtle"));

        for (Animal animal : animalList) {
            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
            saveObjectToFile.saveObject(animal, true);
        }

        //Owners

        for (Owner owner : ownerList) {
            int oldAge = owner.getAge();
            owner.setAge(oldAge + 1);
        }

        FileWriter fw2 = null;
        try {
            fw2 = new FileWriter("users.txt");
            fw2.write("");
            fw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Owner owner : ownerList) {
            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
            saveObjectToFile.saveObject(owner, true);
        }
    }
}
