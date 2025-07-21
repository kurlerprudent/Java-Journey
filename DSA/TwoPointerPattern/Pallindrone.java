package DSA.TwoPointerPattern;

public class Pallindrone {

    public static boolean isPallindrone(String phrase){
        phrase =  phrase.replaceAll("\\s", "");
        phrase.toLowerCase();
        System.out.println("Removed white space and to lowercase: " + phrase);
        phrase = phrase.replaceAll("[^a-z0-9]", "");
        System.out.println("Removed all special char :" + phrase);

        char[] myChar = phrase.toCharArray();
        System.out.println( myChar);

        int n = myChar.length;
        System.out.println(n);
        int left = 0;
        int right = n - 1;

        for(int i = 0; i <= n - 1; i++){
            if (myChar[left] != myChar[right]) {
                return false;
            }else if (myChar[left] == myChar[right]) {
                left = left + 1;
                right = right - 1;
            }
        }
        
       return true;
    }

    //reverse strings 

    public static void reverseStrings(String phrase){
        char[] myChar = phrase.toCharArray();

        System.out.println("Character array: " + myChar);
        int n = myChar.length;
        System.out.println("leghnt of array: " + n);
        int left = 0;
        int right = n - 1;

        while (left < right) {
            
            char temp = myChar[right];
            myChar[right] = myChar[left];
            myChar[left] = temp;

            left++;
            right--;

            
        }
        myChar.toString();
        System.out.println(myChar);

    }    
    public static void main(String[] args) {
        String str = "hello";
        
        System.out.println(isPallindrone("Adam0"));

        reverseStrings(str);
        
    }



  
}
