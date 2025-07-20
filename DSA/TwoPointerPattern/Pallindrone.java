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

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPallindrone("Adam"));
        
    }

}
