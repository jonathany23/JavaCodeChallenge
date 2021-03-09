package org.jonathany23.challenge.strings;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueCharacters {

    public boolean has_unique_chars(String string){
        Optional<String> optStr = Optional.ofNullable(string);

        if (optStr.isPresent()){
            char[] chars = optStr.get().toLowerCase().toCharArray();
            List<Character> processChars = new ArrayList<>();

            for (char aChar : chars) {
                if (processChars.contains(aChar)){
                    return false;
                } else {
                    processChars.add(aChar);
                }
            }
            return true;
        }
        return false;
    }

    public boolean has_unique_charsSet(String string){
        Optional<String> optStr = Optional.ofNullable(string);

        if (!optStr.isPresent()){
            return false;
        }

        string = string.toLowerCase();
        Set<Character> characterSet = string.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        return string.length() == characterSet.size();
    }

    public boolean has_unique_chars_strems(String string){
        Optional<String> optStr = Optional.ofNullable(string);

        if (!optStr.isPresent()){
            return false;
        }

        string = string.toLowerCase();
        char[] charArray = string.toCharArray();

        for (char c : charArray) {
            long count = string.chars().filter(ch -> ch == c).count();
            if (count > 1)
                return false;
        }

        return true;
    }
}
