package com.practice.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String word1 = "abcdef";
        String word2 = "aefghi";
        String word3 = "abcefgh";

        longestCommonPrefix(List.of(word1, word2, word3));

        String gee1 = "geeksforgeeks";
        String gee2 = "geeks";
        String gee3 = "geek";
        String gee4 = "geezer";

        longestCommonPrefix(List.of(gee1, gee2, gee3, gee4));
    }

    public static void longestCommonPrefix(List<String> input) {
        List<Character> prefix = new ArrayList<>();
        for(int i = 0; i < input.get(0).length(); i++) {
            String firstWord = input.get(0);
            boolean equalChar = false;
            for(int j = 1; j < input.size(); j++) {
                if (input.get(j).length() > i && firstWord.charAt(i) == input.get(j).charAt(i)) {
                    equalChar = true;
                } else {
                    equalChar = false;
                    break;
                }
            }
            if (equalChar) {
                prefix.add(firstWord.charAt(i));
            }
        }

        System.out.println(prefix);


    }
}
