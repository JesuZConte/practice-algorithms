package com.practice.algorithms.strings;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String firstWord = "Hello";

        reverseString(firstWord);
    }

    public static void reverseString(String input) {
        char[] characters = input.toCharArray();
        char[] reversedCharacters = new char[input.length()];

        Stack<Character> characterStack = new Stack<>();
        for (char character: characters) {
            characterStack.push(character);
        }

        for (int i = 0; i < input.length(); i++) {
            char character = characterStack.pop();
            reversedCharacters[i] = character;
        }

        System.out.println(new String(reversedCharacters));
    }
}
