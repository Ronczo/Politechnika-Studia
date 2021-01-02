package pl.edu.pg.model;

public abstract class PureberdAnimals extends Animal {

    protected String race;

    public PureberdAnimals(String firstName, int age, Owner petsOwner, String race, String animalType) {
        super(firstName, age, petsOwner, animalType);
        this.race = race;
        this.animalType = animalType;
    }

    public void showPureberdAnimalInfo(String type) {
        showAnimalsInfo(type);
        System.out.println("  Race:               " + this.race);
    }

    ////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////////////////////////////////

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
