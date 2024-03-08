package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return ("Hello World");
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String result = firstSegment + secondSegment;
        return result;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String results = firstSegment + secondSegment;
        return results;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String results = input.substring(0,2);
        return results;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String results = input.substring(input.length() -3);
        return results;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if(inputValue.equals(comparableValue)){
            return true;
        }
        return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static String getMiddleCharacter(String inputValue){
        int wordLength = inputValue.length() ;
        int middle = wordLength /2 -1;
        char middleChar = inputValue.charAt(middle);

        return Character.toString(middleChar);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String[] words = spaceDelimitedString.split("\\s+");

        if (words.length > 0) {
            String firstWord = words[0];
            return firstWord;
        } else {
            return "";
        }
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split("\\s+");

        if (words.length > 0) {
            String secondWord = words[1];
            return secondWord;
        } else {
            return "";
        }
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder reversed = new StringBuilder(stringToReverse);
        return reversed.reverse().toString();
    }
}