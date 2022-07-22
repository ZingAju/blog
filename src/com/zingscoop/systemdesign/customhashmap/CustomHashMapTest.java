package com.zingscoop.systemdesign.customhashmap;

import java.util.HashMap;

public class CustomHashMapTest {

    public static void main(String[] args) {
        CustomHashMap<String, String> names = new CustomHashMap<>();

        names.put("Zing", "Scoop");
        names.put("Scoop", "Zing");
        names.put("Batman", "Dark Knight");
        names.put("Dark Knight", "Batman");
        names.put("Luffy", "Pirate King");
        names.put("Pirate King", "Luffy");

        System.out.println("no. of entries in hashmap: " + names.size()); // 6

        System.out.println("Value for Luffy key: " + names.get("Luffy"));  // Pirate King
        System.out.println("Value for Luffyy key: " + names.get("Luffyy"));  //null

        CustomHashMap<Integer, Integer> test = new CustomHashMap<>();
        test.put(1, 1);
        System.out.println("value of 1 " + test.get(1));

    }
    
}
