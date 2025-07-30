package Hyperskill;

import java.util.Scanner;

public class Ariithmetics {
    public static void main(String[] args) {
        
        // Palindrone
        String str = "madam";
        System.out.println(isPalindrome("madam"));
        
        

    }

    public static boolean isPalindrome(String s){
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = clean.length() ;
        int left = 0;
        int right = n-1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

}
