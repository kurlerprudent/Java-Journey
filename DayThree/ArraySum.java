package DayThree;

public class ArraySum {
    public static void main(String[] args) {
        
        int nums[] = {2,3,5,8,0};
        int n = nums.length;
        int sum = 0;

        for(int num: nums){
            sum = sum + num;
        }

        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}
