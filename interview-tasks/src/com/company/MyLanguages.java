package com.company;

import java.util.*;

public class MyLanguages {

            /*
Your task

Given a dictionary/hash/object of languages and your respective test results,
return the list of languages where your test score is at least 60, in descending order of the results.

Note: There will be no duplicate values.

Examples

{"Java" => 10, "Ruby" => 80, "Python" => 65}  --> ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71} --> ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}   --> []
         */

    public static List<String> myLanguages(final Map<String, Integer> results) {
        // create an empty list
        List<String> strings = new java.util.ArrayList<>();
        // iterate through the map and check values
        for (String key : results.keySet()) {
            if (results.get(key) >= 60) {
                strings.add(key);
            }
        }
//        Collections.sort(strings);
//        System.out.println("normal order: " + strings);
//        Collections.reverse(strings);
//        System.out.println("reversed order: " + strings);
        return strings;
    }


}
