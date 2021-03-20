package org.jonathany23.challenge.strings;

import java.util.Optional;

public class Rotation {

    public boolean isSubstring(String str1, String str2){
        return false;
    }

    public boolean isRotation(String str1, String str2){
        Optional<String> optStr1 = Optional.ofNullable(str1);
        Optional<String> optStr2 = Optional.ofNullable(str2);

        if (optStr1.isPresent() && optStr2.isPresent()){
            String txt1 = optStr1.get();
            String txt2 = optStr2.get();
            if (txt1.length() == txt2.length()) {
                String concat = txt2 + txt2;
                if (concat.contains(txt1)){
                    return true;
                }
            }
        }

        return false;
    }
}
