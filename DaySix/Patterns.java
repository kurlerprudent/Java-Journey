package DaySix;

public class Patterns {
    public static void main(String[] args) {

        printInvertedTriangle(5);

    }

    static void printSquare(int n) {
        // outer loop

        for (int row = 0; row < n; row++) {

            // inner loop or column

            for (int column = 0; column < n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Triangle

    static void printTiangle(int n) {
        // row loop

        for (int row = 1; row <= n; row++) {

            // inner loop column

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    static void printInvertedTriangle(int n){

        // row loop
        for (int row = 1; row <= n; row++){

            //inner loop column
            for(int column = n; column >= row; column--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern4(int n){
        // rows = 2n - 1

        for(int row = 1; row <= 2 * (n-1); row++){

            //column
            
        }
    }

}
