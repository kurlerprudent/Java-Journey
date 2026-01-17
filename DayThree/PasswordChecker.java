package DayThree;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "password";
        boolean isCorrect = true;
       

        do {
            System.out.print("Please Enter Password: ");
             String type = scanner.nextLine();
             if (!type.equals(password)) {
                System.out.println("Incorrect password, pls try again: ");
                type = scanner.nextLine();
             }else{
                System.out.println("Correct password, logging in....");
                isCorrect = false;
             }
            
        } while (isCorrect);
        scanner.close();
    }
}
