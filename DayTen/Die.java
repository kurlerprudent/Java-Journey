package DayTen;

import java.util.Random;

public class Die {
    private int maxDieFace = 6;
    private int currentDieFace;

    public Die() {
        rollDie();
    }

    public int getDieFace() {
        return currentDieFace;
    }

    public void setDieFace(int dieFace) {
        if (dieFace >= 1 && dieFace <= 6) {
            this.currentDieFace = dieFace;
        } else {
            throw new IllegalArgumentException("Value must be from 1 - 6");
        }
    }

    public int rollDie() {
        Random rand = new Random();
        currentDieFace = rand.nextInt(maxDieFace) + 1;
        return currentDieFace;
    }

}
