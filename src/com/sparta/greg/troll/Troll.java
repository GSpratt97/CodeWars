package com.sparta.greg.troll;

import java.util.Arrays;
import java.util.List;

public class Troll {
    public static String disemvowel(String str) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(str);
        for (int i =0; i < sb.length(); i++) {
            if (list.contains(sb.charAt(i))) {
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return sb.toString();
    }
}