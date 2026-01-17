package DSA.TwoPointerPattern;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int len = removeDuplicates(nums);
        System.out.println(len);
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length <= 1) {
            return nums.length;
        }

        int slow = 0;
        for(int fast = 1; fast< nums.length; fast++){
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }

           
        }

        return slow + 1;
    }

}
