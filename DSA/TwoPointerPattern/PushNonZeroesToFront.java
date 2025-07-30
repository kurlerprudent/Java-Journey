package DSA.TwoPointerPattern;

public class PushNonZeroesToFront {

    public static void pushZeroesToBack(int[] nums){
        int n = nums.length;
        int[] temp = new int[n];
        int position = 0;

        for(int i = 0; i < n; i++){
            if (nums[i] != 0) {
                temp[position] = nums[i];
                position++;
            }
        }
        for(int j = 0; j< n; j++){
            nums[j] = temp[j];
        }
    }

    //with no temp storage

    public static void pushTo(int[] nums){
        int n = nums.length;
        int position = 0;

        for(int i = 0; i<n; i++){
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }

        while (position < n) {
            nums[position] = 0;
            position++;
        }
    }
    public static void pushToReverse(int[] nums){
        int n = nums.length;
        int position = 0;
        int[] temp = new int[n];

        for(int i =n - 1; i>0; i--){
            if (nums[i] != 0) {
                temp[position] = nums[i];
                position++;
            }
        }

        
    }

}
