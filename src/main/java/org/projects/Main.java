package org.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        solution(5);
    }

    public static String solution(int n){
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<>();
        roman_numerals.put("I", 1);
        roman_numerals.put("V", 5);
        roman_numerals.put("X", 10);
        roman_numerals.put("L", 50);
        roman_numerals.put("C", 100);
        roman_numerals.put("D", 500);
        roman_numerals.put("M", 1000);

        




        System.out.println(roman_numerals);
        return "";
    }
}