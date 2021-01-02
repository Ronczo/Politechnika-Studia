package pl.edu.pg.model;

public class Turtle extends Animal{

    private String animalType = "turtle";

    public enum Status {
        ACTIVE("active"), HIDDEN("hidden in shell"), UNKNOWN("unknown");

        protected String value;

        Status(String value) {
            this.value = value;
        }

        //////// getters //////////

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private Status status;

    public Turtle(String firstName, int age, Owner petsOwner, Status status, String animalType) {
        super(firstName, age, petsOwner, animalType);
        this.status = status;
    }

    public Turtle(String firstName, int age, int id, int actualPositionX, int actualPositionY, Owner petsOwner, Status status,
                  String animalType) {
        super(firstName, age, petsOwner, animalType);
        this.id = id;
        this.actualPositionX = actualPositionX;
        this.actualPositionY = actualPositionY;
        this.status = status;
        this.animalType = animalType;
    }


    @Override
    public void info() {
        showAnimalsInfo("Turtle");
        System.out.println("  Status:           " + this.status.getValue());
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
                + this.status.getValue() + "\n";
    }

    ////////////////////////////////////////////// GETTERS AND SETTERS /////////////////////////////////////////////////

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
