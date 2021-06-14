package org.jonathany23.challenge.strings;

/**
 * function to reverse a string (a list of characters), in-place.
 */
public class ReverseString {

    public static String [] reverse(String [] chars){
        if (chars != null && chars.length > 0){
            var reverse = new String[chars.length];
            var count = 0;
            for (int i = chars.length-1; i >= 0; i--) {
                reverse[count] = chars[i];
                count++;
            }
            return reverse;
        }
        return chars;
    }
}
