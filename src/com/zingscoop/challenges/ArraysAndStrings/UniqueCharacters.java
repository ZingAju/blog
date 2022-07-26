package com.zingscoop.challenges.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    private static boolean isUniqueCharacters(String str) {
        Map<Character,Boolean> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.codePointAt(i) <= 65535) {
                char ch = str.charAt(i);
                if(!Character.isWhitespace(ch) && map.put(ch, true) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String s = "ZingScoop";
        String s1 = "Zing";

        System.out.println("Is Unique Characters: " + UniqueCharacters.isUniqueCharacters(s));
        System.out.println("Is Unique Characters: " + UniqueCharacters.isUniqueCharacters(s1));

    }
    
}
