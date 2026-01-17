package DayTwo;

import java.util.Scanner;

public class Grade {

    public static void GradePredicter() {
        String grade;
        int score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Score: ");
        score = scanner.nextInt();

        if (score <= 39) {
            grade = "F";

        } else if (score <= 49) {
            grade = "E";
        } else if (score <= 54) {
            grade = "D";

        } else if (score <= 59) {
            grade = "D+";

        } else if (score <= 64) {
            grade = "C";

        } else if (score <= 69) {
            grade = "C+";

        } else if (score <= 74) {
            grade = "B";

        } else if (score <= 79) {
            grade = "B+";

        } else if (score >= 80) {
            grade = "A";
        } else {
            grade = "Null";
        }

        scanner.close();

        System.out.printf("You had %s", grade);

    }

    //  GradePredictor with swich statement

    public static void GradePredictorSwitch(){
        double score;
        String grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Score: ");

        score = scanner.nextDouble();

        switch ((int)(score/10)) {
            case 10,9,8:
            grade = "A";
            System.out.printf("You had %s%n", grade); 
                break;
            case 7:
            grade = "B+";
            System.out.printf("You had %s%n", grade); 
                break;
            case 6:
            grade = "B";
            System.out.printf("You had %s%n", grade); 
                break;
            case 5:
            grade = "C+";
            System.out.printf("You had %s%n", grade); 
                break;
            case 4:
            grade = "C";
            System.out.printf("You had %s%n", grade); 
                break;
            case 3:
            grade = "D+";
            System.out.printf("You had %s%n", grade); 
                break;
            case 2:
            grade = "D";
            System.out.printf("You had %s%n", grade); 
                break;
            case 1:
            grade = "E";
            System.out.printf("You had %s%n", grade); 
                break;    
        
            default:
                break;
        }
        scanner.close();
    }

    public static void main(String[] args) {

        // GradePredicter();
    
        GradePredictorSwitch();

    }
}
