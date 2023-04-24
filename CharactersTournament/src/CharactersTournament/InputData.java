package CharactersTournament;

import java.util.Scanner;

public class InputData {
    Scanner scanner = null;
    private static int startingCount;
    private static int pickResult;

    public InputData(){
        scanner = new Scanner(System.in);
    }

    public void setStartingCount() {
        startingCount = scanner.nextInt();
    }

    public void setPickResult() {
        pickResult = scanner.nextInt();
    }

    public int getStartingCount() {
        return startingCount;
    }

    public int getPickResult() {
        return pickResult;
    }
}
