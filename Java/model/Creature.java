package pl.edu.pg.model;

public abstract class Creature {

    public enum Sex {
        MALE("male"), FEMALE("female"), UNDEFINED("Undefined");

        protected String value;

        Sex(String value) {
            this.value = value;
        }

        //////// getters //////////

        public String getValue() {
            return value;
        }
    }

    protected String firstName;
    protected int age;
    protected Sex sex;

    public Creature(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public abstract void info();

    public abstract String getFileNameToSave();


    protected void showBasicInfo() {
        /*
         The method show basic info about the object. I decided to not include type of object, beacuse it would't look
         well
         */
        System.out.println("  Name:               " + this.firstName);
        System.out.println("  Age:                " + this.age);
        System.out.println("  Sex:                " + (this.sex == null ? "-" : this.sex.getValue()));
    }

    ////////////////////////////////////////////// GETTERS AND SETTERS ////////////////////////////////////////////////


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

