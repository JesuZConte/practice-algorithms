package com.practice.algorithms.strings;

import java.util.Arrays;
import java.util.List;

public class LengthLastWord {

    public static void main(String[] args) {
        String emptyPhrase = "";
        String phrase = "Hello world";
        String phraseWithEmptySpaces = "    world    ";

        System.out.println(checkLengthOfLastWord(emptyPhrase));
        System.out.println(checkLengthOfLastWord(phrase));
        System.out.println(checkLengthOfLastWord(phraseWithEmptySpaces));
    }

    public static int checkLengthOfLastWord(String input) {
        String cleanInput = input.trim();

        List<String> splittedPhrase = Arrays.asList(cleanInput.split(" "));

        String wordToCheck = splittedPhrase.get(splittedPhrase.size() - 1);

        return wordToCheck.length();

    }
}
