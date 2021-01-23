package pl.edu.pg;

import pl.edu.pg.model.BannedPosition;
import pl.edu.pg.model.Owner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadBannedPositions {

    public List<BannedPosition> readPositions(){

        File file = new File("bannedpositions.txt");
        List<BannedPosition> readPositions = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String X = scanner.nextLine();
                String Y = scanner.nextLine();

                BannedPosition newPositon = new BannedPosition(X, Y);

                readPositions.add(newPositon);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readPositions;

    }
}
