package pl.edu.pg;

import pl.edu.pg.model.*;


import java.util.InputMismatchException;
import java.util.List;

public class AnimalsInTheGarden {
    private static final int size = 10;


    public void start() {

        // Loading list from files animals.txt
        List<Owner> owners = null;
        List<Animal> animals = null;
        try {
            ListOfTheOwners listOfTheOwners = new ListOfTheOwners();
            owners = listOfTheOwners.readListOfTheOwnersFromFile();
            Owner.setOwnerCount(owners.get(owners.size() - 1).getId());

            ListOfAnimals listOfAnimals = new ListOfAnimals();
            animals = listOfAnimals.readListOfTheAnimalsFromFile(owners);
            Owner.setOwnerCount(owners.get(owners.size() - 1).getId());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is a problem. Continue the program....");
        }

        //Program starts here
        while (true) {
            MainManu mainManu = new MainManu();
            try {
                int selectedOption = mainManu.startMainManu();
                if (selectedOption == 0) {
                    System.out.println("Exiting program...");
                    break;
                } else {
                    if (selectedOption == 1) {
                        AddNewOwner newOwner = new AddNewOwner();
                        Saveable newObject = newOwner.addNewOwner(owners);
                        if (newObject != null) {
                            SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
                            saveObjectToFile.saveObject(newObject, true);
                            owners.add((Owner) newObject);
                        }
                    } else if (selectedOption == 2) {
                        DeleteTheOwner deleteOwner = new DeleteTheOwner();
                        deleteOwner.deleteOwner(owners);
                    } else if (selectedOption == 3) {
                        for (Owner owner : owners) {
                            owner.info();
                        }
                    } else if (selectedOption == 4) {
                        AddNewAnimal addNewAnimal = new AddNewAnimal();
                        Saveable newObject = addNewAnimal.addNewAnimal(owners, animals);
                        SaveObjectToFile saveObjectToFile = new SaveObjectToFile();
                        saveObjectToFile.saveObject(newObject, true);
                        animals.add((Animal) newObject);
                    } else if (selectedOption == 5) {
                        DeleteTheAnimal deleteTheAnimal = new DeleteTheAnimal();
                        deleteTheAnimal.deleteAnimal(animals);
                    } else if (selectedOption == 6) {
                        for (Animal animal : animals) {
                            animal.info();
                        }
                    } else if (selectedOption == 7) {
                        FeedATurtle feedATurtle = new FeedATurtle();
                        feedATurtle.feedTheTurtle(animals);
                    }else if (selectedOption == 8) {
                        MoveTheAnimal moveTheAnimal = new MoveTheAnimal();
                        moveTheAnimal.moveAnimal(animals, size);
                    }else if (selectedOption == 9) {
                        GenerateVisualisation generateVisualisation = new GenerateVisualisation();
                        generateVisualisation.visualisation(animals, size);
                    }  else {
                        System.out.println("You typed the wrong number, please try again");
                    }
                }
            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("You must type a number, please try again");
            }
        }
    }
}
