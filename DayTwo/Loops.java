package DayTwo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        //for loop

        // int sum = 0;

        // for(int i = 0; i < 10; i++){
        //     sum += i;
        //     System.out.println("Current value of i: " + i + ", Sum: " + sum);
        // }

        // String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // for(String fruit: fruits){
        //     System.out.println("Fruit: " + fruit);
        // }

        // //Iterating over a list using for loop

        // List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5);
        // for(int num: numbers){
        //     System.out.println("Number: " + num);
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.println("Your'e still plaing :)");

            int checker = scanner.nextInt();

            if (checker == 0) {
                number = 0;
            }
            continue;
        }
    }
}
