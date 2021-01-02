package pl.edu.pg.model;

import pl.edu.pg.Saveable;

public class Owner extends Creature implements Saveable {

    private static int ownerCount = 0;

    private int id;
    private String surname;

    public Owner(String firstName, int age, String surname) {
        super(firstName, age);
        this.id = ++ownerCount;
        this.surname = surname;
    }

    public Owner(int id, String firstName, int age, String surname) {
        super(firstName, age);
        ++ownerCount;
        this.id = id;
        this.surname = surname;
    }

    @Override
    public void info() {
        System.out.println("\tOwner" + " ID: " + this.id);
        System.out.println("  Surname:            " + this.surname);
        showBasicInfo();
    }

    @Override
    public String getFileNameToSave() {
        return "users.txt";
    }

    @Override
    public String getDataToSave() {
        return this.id + "\n"
                + this.firstName + "\n"
                + this.age + "\n"
                + this.sex.getValue() + "\n"
                + this.surname + "\n";
    }

    ////////////////////////////////////////////////// GETTERS AND SETTERS /////////////////////////////////////////////

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static int getOwnerCount() {
        return ownerCount;
    }

    public static void setOwnerCount(int ownerCount) {
        Owner.ownerCount = ownerCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



