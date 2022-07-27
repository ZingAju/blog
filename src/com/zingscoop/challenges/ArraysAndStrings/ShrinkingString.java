package com.zingscoop.challenges.ArraysAndStrings;

public class ShrinkingString {

    private static String getShrinkedText(String str) {

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            // No need to shrink white spaces
            if (!Character.isWhitespace(ch)) {
                if (i + 1 >= str.length() || ch != str.charAt(i + 1)) {
                    ++count;
                    sb.append(ch).append(count);
                    count = 0;
                } else {
                    ++count;
                }
            } else {
                sb.append(ch);
                count = 0;
            }

        }
        // If shrinnked string greater than original string length, just return original
        // string.
        return sb.length() > str.length() ? str : sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaa bbt ccddd";
        System.out.println(getShrinkedText(str));

        String str1 = "Zing Scoop";
        System.out.println(getShrinkedText(str1));
    }

}
