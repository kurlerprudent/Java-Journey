package DayFour;

public class MultiDimenssionalArray {
    public static void main(String[] args) {
        int myArr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " ");
                System.out.print(" ");

            }
        }
    }
}
