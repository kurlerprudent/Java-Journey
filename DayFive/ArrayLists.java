package DayFive;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Obed");
        arr.add("Obed");
        arr.add("Obed");
        arr.add("Obed");

        arr.remove(2);
        arr.add(1, "Afia");
        arr.add(1, "Ama");

        arr.set(3, "Prudent");
        arr.set(4, "Kurler");

        int dem = arr.size(); //gets the size of the arraylist

        System.out.println(dem);

        String demo = arr.get(2);

        System.out.println(demo);
        System.out.println(arr);

        arr.clear();
        System.out.println(arr); //prints out nothing

        //Looping through Arraylists

        arr.add("Obed");
        arr.add("Ama");
        arr.add("Kojo");
        arr.add("Prudent");
        arr.add("Afia");

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
          System.out.println();
        //Using the forEach loop this time

        for(String i : arr){
          
            System.out.println(i);
        }

        //Can also be used for other primitive types but should be wrapped in their object form

        ArrayList<Integer> myArrayInt = new ArrayList<Integer>();

        // import the Collection class which includes the sort method

        Collections.sort(arr);
        System.out.println("Sorted ArrayList: ");
        System.out.println(arr); // prints the sorted arraylist
    }



}
