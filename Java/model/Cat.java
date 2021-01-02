package pl.edu.pg.model;

public class Cat extends PureberdAnimals {


    public Cat(String firstName, int age, Owner petsOwner, String race, String animalType) {
        super(firstName, age, petsOwner, race, animalType);
    }

    public Cat(int id, String firstName, int age, Owner petsOwner, int positionX, int positionY, String race, String animalType) {
        super(firstName, age, petsOwner, race, animalType);
        this.id = id;
        this.actualPositionX = positionX;
        this.actualPositionY = positionY;
    }

    @Override
    public void info(){
        showPureberdAnimalInfo("Cat");
    }

    @Override
    public String getDataToSave() {
        return  this.animalType + "\n"
                + this.id + "\n"
                + this.firstName + "\n"
                + this.age + "\n"
                + this.sex.getValue() + "\n"
                + this.actualPositionX + "\n"
                + this.actualPositionY + "\n"
                + this.petOwners.getId() + "\n"
                + this.race + "\n";
    }
}
