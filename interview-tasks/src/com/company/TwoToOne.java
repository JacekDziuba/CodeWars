package com.company;

import java.util.TreeSet;

public class TwoToOne {

    //Take 2 strings s1 and s2 including only letters from ato z.
    // Return a new sorted string, the longest possible, containing distinct letters.

    public static String longest (String s1, String s2) {
        TreeSet<Character> set = new TreeSet<>();

        //Combine both strings into a single String
        String s1s2 = s1 + s2;

        //Create a StringBuilder that we will us to create our result String
        StringBuilder sb = new StringBuilder();

        //Add all characters to TreeSet. Now they are ordered and only 1 occurence of each
        for(int i = 0; i < s1s2.length(); i++)
            set.add(s1s2.charAt(i));

        //Build our StringBuilder by interating over the Set
        for(Character c : set)
            sb.append(c);

        //Return the result as a String
        return new String(sb);

    }
}
