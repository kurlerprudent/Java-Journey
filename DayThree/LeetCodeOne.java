package DayThree;

import java.util.Scanner;

public class LeetCodeOne {
    //FizzBuzz problem

   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    for(int i=1; i<=n; i++){
        if (i%5 == 0 && i%3 == 0) {
            System.out.println("FizzBuzz");
        }else if (i%5 == 0) {
            System.out.println("Buzz");
        }else if ( i%3 == 0) {
            System.out.println("Fizz");
        }else{
            System.out.println(i);
        }
    }

    scanner.close();



   }

    
}
