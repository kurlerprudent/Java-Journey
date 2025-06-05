package DayOne;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        AreaOfCircle(radius);
    }
   
   public static void AreaOfCircle( double radius){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius  = scanner.nextDouble();
    
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radious %.2f is %.2f%n", radius, area);
   }
}
