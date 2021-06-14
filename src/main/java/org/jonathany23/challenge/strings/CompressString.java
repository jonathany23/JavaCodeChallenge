package org.jonathany23.challenge.strings;


public class CompressString {

    public static String compressString(String string){
        if (string == null || string.length() == 0){
            return string;
        }

        char[] chars = string.toCharArray();
        char previusValue = chars[0];
        int counter = 0, i = 1;
        String result = "";
        String txtTemp = String.valueOf(chars[0]);

        do{
            if (chars[i] == previusValue){
                counter++;
                txtTemp += chars[i];
            } else {
                result = getPartialResult(previusValue, counter, result, txtTemp);
                txtTemp = String.valueOf(chars[i]);
                counter = 0;
            }
            previusValue = chars[i];
            i++;
        } while (i < chars.length);

        result = getPartialResult(previusValue, counter, result, txtTemp);
        return (result.length() < string.length() ? result : string);
    }

    private static String getPartialResult(char previusValue, int counter, String result, String txtTemp) {
        if (counter > 1) {
            String txt = String.valueOf(previusValue);
            result += txt + (counter + 1);
        } else {
            result += txtTemp;
        }
        return result;
    }

    public static String compressString2(String string){
        if (string == null || string.length() == 0){
            return string;
        }

        String result = "";
        char previusChar = string.charAt(0);
        int count = 0;

        for (char c : string.toCharArray()) {
            if (c == previusChar){
                count++;
            } else {
                result += calc_partial_result(previusChar, count);
                previusChar = c;
                count = 1;
            }
        }
        result += calc_partial_result(previusChar, count);
        return (result.length() < string.length() ? result : string) ;
    }

    public static String calc_partial_result(char previusChar, int count){
        return ""+previusChar + (count > 1 ? count : "");
    }
}
