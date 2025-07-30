package DSA.TwoPointerPattern;

import java.util.Arrays;

public class PushZeros {
    public static void main(String[] args) {
        int[] nums = {0,2,34,0,5,6,0,3,0,4,5,5,0};
        pushZeroesToBack(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void pushZeroesToBack(int[] nums){
        int nonZeroPos = 0;
        for(int i = 0; i< nums.length; i++){
            if (nums[i] != 0) {
                nums[nonZeroPos] = nums[i];
                nonZeroPos++;
            }
        }

        while (nonZeroPos < nums.length) {
            nums[nonZeroPos] = 0;
            nonZeroPos++;
        }
    }

}
