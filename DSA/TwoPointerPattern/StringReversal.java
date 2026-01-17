package DSA.TwoPointerPattern;

public class StringReversal {


    public static void reverseString(String phrase){
        char[] myChar = phrase.toCharArray();

        int n = myChar.length;
        int left = 0;
        int right = n -1 ;

        while (left < right) {
            
            char temp = myChar[right];
            myChar[right] = myChar[left];
            myChar[left] =  temp;
            
            left++;
            right--;

        }

        myChar.toString();

        System.out.println(myChar);
    }

    public static void main(String[] args) {
        String str = "River";
        reverseString("Hiiii");
    }
}
