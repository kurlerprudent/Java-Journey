package DayFour;

public class Arrays {
    public static void main(String[] args) {
        //Initializing and assignings

        int myArr[] = {1, 2, 3, 4, 5};
        String strArr[] = {"Hello", "World", "!"};

        //Accessing elements
        System.out.println("First element of myArr: " + myArr[0]);
        System.out.println("Second element of strArr: " + strArr[1]);

        //Iterating through an array
        System.out.println("Elements of myArr:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of strArr:");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println();
    }
}
