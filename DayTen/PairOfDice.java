package DayTen;

public class PairOfDice {

    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        die1.setDieFace(1);
        die2.setDieFace(5);

        int firstDie = die1.getDieFace();
        int secondDie = die2.getDieFace();

        System.out.println("First Die: " + firstDie + "\t Second Die: " + secondDie);

        int firstDieRoll = die1.rollDie();
        int secondDieRoll = die2.rollDie();

        System.out.println("Results after dice roll");

        System.out.println("First Die: " + firstDieRoll + "\t Second Die: " + secondDieRoll);

    }

}
