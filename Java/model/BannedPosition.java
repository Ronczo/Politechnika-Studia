package pl.edu.pg.model;

import pl.edu.pg.Saveable;

public class BannedPosition implements Saveable {

    private String positionX;
    private String positionY;

    public BannedPosition(String positionX, String positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void showInfo(){
        System.out.println("X: " + this.positionX);
        System.out.println("Y: " + this.positionY);
    }
    @Override
    public String getFileNameToSave() {
        return "bannedpositions.txt";
    }

    @Override
    public String getDataToSave() {
        return this.positionX + "\n"
                + this.positionY + "\n";
    }

    ////////////////// GETTERS AND SETTERS /////////////////


    public String getPositionX() {
        return positionX;
    }

    public void setPositionX(String positionX) {
        this.positionX = positionX;
    }

    public String getPositionY() {
        return positionY;
    }

    public void setPositionY(String positionY) {
        this.positionY = positionY;
    }
}
