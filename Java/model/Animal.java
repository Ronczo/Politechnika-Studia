package pl.edu.pg.model;

import pl.edu.pg.Saveable;

public abstract class Animal extends Creature implements Saveable {

    private static int animalCount = 0;

    protected int id;
    protected int actualPositionX;
    protected int actualPositionY;
    protected Owner petOwners;
    protected String animalType;


    public Animal(String firstName, int age, Owner petsOwner, String animalType) {
        super(firstName, age);
        this.id = ++animalCount;
        this.actualPositionX = 1;
        this.actualPositionY = 1;
        this.petOwners = petsOwner;
        this.animalType = animalType;
    }

    protected void showAnimalsInfo(String type) {
        System.out.println("\t" + type + " ID:   " + this.id);
        showBasicInfo();
        System.out.println("  Pet's Owner:        " + this.petOwners.getFirstName() + " " + this.petOwners.getSurname());
        System.out.println("  Actual position X:  " + this.actualPositionX);
        System.out.println("  Actual position Y:  " + this.actualPositionY);
    }

    @Override
    public String getFileNameToSave() {
        return "animals.txt";
    }

    public abstract String getDataToSave();


    ///////////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////////////////////


    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActualPositionX() {
        return actualPositionX;
    }

    public void setActualPositionX(int actualPositionX) {
        this.actualPositionX = actualPositionX;
    }

    public int getActualPositionY() {
        return actualPositionY;
    }

    public void setActualPositionY(int actualPositionY) {
        this.actualPositionY = actualPositionY;
    }

    public Owner getPetOwners() {
        return petOwners;
    }

    public void setPetOwners(Owner petOwners) {
        this.petOwners = petOwners;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
