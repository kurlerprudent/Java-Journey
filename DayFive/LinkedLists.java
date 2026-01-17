package DayFive;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
        // LinkedList is a part of the Java Collections Framework and provides a doubly-linked list implementation.
        // It allows for efficient insertion and removal of elements from both ends of the list.

       LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Obed");
        linkedList.add("Ama");
        linkedList.add("Kojo");
        linkedList.add("Prudent");
        linkedList.add("Afia");

        // Displaying the LinkedList
        System.out.println("Linked List: " + linkedList);

        // Removing an element from the LinkedList
        linkedList.remove("Kojo");
        System.out.println("After removing 'Kojo': " + linkedList);

        // Accessing an element at a specific index
        String firstElement = linkedList.get(0);
        System.out.println("First Element: " + firstElement);

        // Looping through the LinkedList using a for-each loop
        System.out.println("Iterating through Linked List:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        System.out.println(linkedList.removeLast()); // Removes and returns the last element of the LinkedList
        System.out.println("After removing the last element: " + linkedList);

        //inserting an element at a specific index
        linkedList.add(2, "Kwame");
        System.out.println("After inserting 'Kwame' at index 2: " + linkedList);
    }

}
