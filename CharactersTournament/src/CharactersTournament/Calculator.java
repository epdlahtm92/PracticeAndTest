package CharactersTournament;

import java.util.ArrayList;

public class Calculator {
    private InputData ipDt = null;
    private static int randomFirst;
    private static int randomSecond;
    private static ArrayList<String> gameMembers = new ArrayList<>();
    private static ArrayList<Integer> winLoses = new ArrayList<>();
    public InputData(){
        ipDt = new InputData();
    }

    public static int getRandomFirst() {
        return randomFirst;
    }

    public static int getRandomSecond() {
        return randomSecond;
    }

    public void setRandomFirst() {
        do {
            randomFirst = (int) (Math.random() * ipDt.getStartingCount());
            randomSecond = (int) (Math.random() * ipDt.getStartingCount());
        }while (randomFirst == randomSecond || winLoses.get(randomFirst) != 0);
    }

    public static void setRandomSecond() {
        Calculator.randomSecond = randomSecond;
    }

    public void setWinLoses() {
        for(int index =0; index < ipDt.getStartingCount(); index++){
            if (winLoses.get(index) == null || winLoses.get(index) == 1){
                winLoses.set(index, 0);
            }
        }
    }
}
