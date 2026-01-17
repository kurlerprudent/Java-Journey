package DayThree;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Enter Your Number: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            factorial *= i;
        }

        System.out.println("Answer: " + num +"! = "+ factorial);

        scanner.close();
    }
}
