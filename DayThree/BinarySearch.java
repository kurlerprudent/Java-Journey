package DayThree;

public class BinarySearch {
    public static int BinarySearchAlgorithm(int num[], int target){
        int n = num.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (num[mid] == target) {
                return mid;
            }else if (num[mid] < target) {
                left = mid + 1;
            }else if(num[mid] > target){
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int test[] = {1,2,4,6,8,9,5};
        int target = 6;

        int index = BinarySearchAlgorithm(test, target);

        System.out.println("The taget is at index: " + index);
    }
}
