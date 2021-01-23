package pl.edu.pg;

import pl.edu.pg.model.Animal;
import pl.edu.pg.model.BannedPosition;

import java.util.List;

public class GenerateVisualisation {

    public void visualisation(List<Animal> listOfAnimals, int size, List<BannedPosition> listOfBannedPositions){
        /*
        * This method generates a visualisation of the garden and shows localisation of the animals
         */

        // Generate edges (top and bottom) of stage
        String edge = "";
        for (int i = 0; i< size; i++) {
            edge = edge + "___";
        }


        //Creates stage, including positions of animals
        System.out.println(edge);
        for (int i = 1; i <= size; ++i) {
            String middle = "|";
            for (int j = 1; j <= size; ++j) {
                String stringToAdd = "__|";
                for (BannedPosition bannedPosition : listOfBannedPositions) {
                    if (i == Integer.parseInt(bannedPosition.getPositionX()) && j == Integer.parseInt(bannedPosition.getPositionY())){
                        stringToAdd = "B_|";
                    }
                }
                for (Animal animal : listOfAnimals) {
                    if (animal.getActualPositionY() == i && animal.getActualPositionX() == j) {
                        stringToAdd = animal.getAnimalType().charAt(0) + "_|";
                    }
                }
                middle = middle + stringToAdd;
            }
            System.out.println(middle);
        }
        System.out.println(edge);
    }
}
