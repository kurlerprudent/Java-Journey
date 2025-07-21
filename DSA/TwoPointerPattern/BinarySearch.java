package DSA.TwoPointerPattern;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int n  = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                
                return mid;
            }else if (nums[mid] < target) {
                left = mid + 1;
            
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] myNums = { 1, 4, 7, 8, 10, 35, 56 };
        System.out.println("index: " + binarySearch(myNums, 10));
    }

}
