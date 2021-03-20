package org.jonathany23.challenge.strings;

import java.util.*;
import java.util.stream.Collectors;

public class Permutation {

    public static boolean is_permutation(String str1, String str2){
        Optional<String> optStr1 = Optional.ofNullable(str1);
        Optional<String> optStr2 = Optional.ofNullable(str2);
        
        if (optStr1.isPresent() && optStr2.isPresent()){
            if (optStr1.get().length() == optStr2.get().length()){

                List<Character> collChar1 = optStr1.get().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                List<Character> collChar2 = optStr2.get().chars().mapToObj(c -> (char) c).collect(Collectors.toList());

                for (Character character : collChar1) {
                    if (!collChar2.contains(character)){
                        return false;
                    }
                }
                return true;
            }
        }
        
        return false;
    }

    public static boolean is_permutation2(String str1, String str2){
        Optional<String> optStr1 = Optional.ofNullable(str1);
        Optional<String> optStr2 = Optional.ofNullable(str2);

        if (optStr1.isPresent() && optStr2.isPresent()){
            if (optStr1.get().length() == optStr2.get().length()){
                char[] charsArr1 = optStr1.get().toCharArray();
                char[] charsArr2 = optStr2.get().toCharArray();
                Arrays.sort(charsArr1);
                Arrays.sort(charsArr2);
                return Arrays.equals(charsArr1, charsArr2);
            }
        }

        return false;
    }

    public static boolean is_permutation3(String str1, String str2){
        Optional<String> optStr1 = Optional.ofNullable(str1);
        Optional<String> optStr2 = Optional.ofNullable(str2);

        if (optStr1.isPresent() && optStr2.isPresent()){
            if (optStr1.get().length() == optStr2.get().length()){
                char[] chars1 = optStr1.get().toCharArray();
                char[] chars2 = optStr2.get().toCharArray();

                Map<Character, Integer> map1 = new HashMap<>();
                Map<Character, Integer> map2 = new HashMap<>();

                for (char c : chars1) {
                    map1.putIfAbsent(c, (map1.containsKey(c) ? map1.get(c) : 1));
                }

                for (char c : chars2) {
                    map2.putIfAbsent(c, (map2.containsKey(c) ? map2.get(c) : 1));
                }

                return map1.equals(map2);
            }
        }

        return false;
    }
}
