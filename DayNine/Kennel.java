package DayNine;

public class Kennel {
    public static void main(String[] args) {
        
        Dog max = new Dog("Max", 03);
        System.out.println("Name: " + max.getName() + "\t Age:"+ max.getAge());

        System.out.println("After setting the name again");

        max.setName("Tobby");
        max.setAge(2);

        System.out.println("Name: " + max.getName() + "\t Age: " + max.getAge());
    }

}
