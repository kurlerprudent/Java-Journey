package DayFive;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    //Add Items to the HashMap, Use the put() method

    capitalCities.put("Ghana", "Accra");
    capitalCities.put("Nigeria", "Abuja");
    capitalCities.put("Kenya", "Nairobi");
    capitalCities.put("South Africa", "Pretoria");
    capitalCities.put("Togo", "Lome");

    //Access an item in the HashMap, Use the get() method
    String capitalOfGhana = capitalCities.get("Ghana");
    System.out.println("Capital of Ghana: " + capitalOfGhana);
    System.out.println(capitalCities);

    //Check if a key exists in the HashMap, Use the containsKey() method
    boolean hasNigeria = capitalCities.containsKey("Nigeria");
    // Check if a value exists in the HashMap, Use the containsValue() method
    boolean hasAccra = capitalCities.containsValue("Accra");

    //loop through the HashMap using a for-each loop
    System.out.println("Iterating through HashMap:");

    for(String countries : capitalCities.keySet()){
        System.out.println(countries + " - " + capitalCities.get(countries));
    }

    System.out.println("Iterating through values in HashMap:");

    for(String capital : capitalCities.values()){
        System.out.println(capital);

    }
}




}
