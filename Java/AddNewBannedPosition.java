package pl.edu.pg;

import pl.edu.pg.model.BannedPosition;

import java.util.Scanner;

public class AddNewBannedPosition {

    public Saveable addPosition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X: ");
        String X = scanner.next();

        System.out.println("Enter Y: ");
        String Y = scanner.next();

        BannedPosition newObject = new BannedPosition(X, Y);

        return newObject;
    }
}
