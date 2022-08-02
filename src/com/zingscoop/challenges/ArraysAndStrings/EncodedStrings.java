package com.zingscoop.challenges.ArraysAndStrings;

public class EncodedStrings {
    public static void main(String[] args) {
        char[] chArr = "Zing Scoops are awesome !!".toCharArray();

        System.out.println(encodeString(chArr));
    }

    private static char[] encodeString(char[] chArr) {
        
        int noOfwhiteSpaces=0;
        for (int i = 0; i < chArr.length; i++) {
            if(Character.isWhitespace(chArr[i])) ++noOfwhiteSpaces;
        }

        char resultEncodedString[] = new char[chArr.length + (noOfwhiteSpaces * 2)];
        int resultArrIndex=-1;
        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            if(Character.isWhitespace(ch)) {
                resultEncodedString[++resultArrIndex] = '%';
                resultEncodedString[++resultArrIndex] = '2';
                resultEncodedString[++resultArrIndex] = '0';
            } else {
                ++resultArrIndex;
                resultEncodedString[resultArrIndex] = ch;
            }
        }
        return resultEncodedString;
    }
}
