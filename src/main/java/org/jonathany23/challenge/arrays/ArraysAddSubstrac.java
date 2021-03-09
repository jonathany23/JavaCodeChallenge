package org.jonathany23.challenge.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysAddSubstrac {

    public List<Long> arrayChallenge(List<Long> arr) {

        Long counter;
        List<Long> resultArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            counter = 0L;
            if (i == 0){
                resultArr.add(counter);
                continue;
            }

            Long currentValue = arr.get(i);

            for (int j = i-1; j >= 0; j--) {
                counter += (currentValue - arr.get(j));
            }
            resultArr.add(counter);
        }
        return resultArr;
    }
}
