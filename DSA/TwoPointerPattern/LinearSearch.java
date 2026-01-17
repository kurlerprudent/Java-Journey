package DSA.TwoPointerPattern;

public class LinearSearch {

    public static int linearSearch(int[] nums, int target){
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            if (nums[i] == target) {
                return i ;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,6,2,6,0,2};
        int target = 2;

        System.out.println("The target is at index: " + linearSearch(nums, target) );
    }

}
