package DayThree;

public class LinearSearch {
   
   

    public static int LinearSearchAlgorithm(int num[], int target){
        int n = num.length;

        for(int i = 0;i< n-1; i++ ){
            if (num[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int test[] = {1,2,4,6,8,9,5};
        int target = 6;
        int index = LinearSearchAlgorithm(test, target);
        
        System.out.println("The Number is found at index: " + index );
        
    }
}
