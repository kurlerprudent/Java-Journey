package DayEight;

public class Recurrsion {

    public static long  Fibonocci(int n){
        if (n == 0) {
            return n;
        }else if (n == 1) {
            return n;
        }else{
            return Fibonocci(n - 1 ) + Fibonocci(n - 2);
        }
    }

    public static void main(String... args) {
        System.out.println(Fibonocci(160));
    }

}
