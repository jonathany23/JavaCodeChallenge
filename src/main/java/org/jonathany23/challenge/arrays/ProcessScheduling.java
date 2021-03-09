package org.jonathany23.challenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessScheduling {

    public Integer minimunTime(List<Integer> ability, long processed){
        boolean evaluate = true;
        int counter = 0;
        List<Integer> listAux = new ArrayList<>(ability);

        while (evaluate) {
            Integer max = Collections.max(listAux);

            if (max == 1)
                break;

            int temp;
            int index = listAux.lastIndexOf(max);
            if (processed - max >= 0) {
                temp = max / 2;
                listAux.set(index, temp);
                processed -= max;
            }
            else {
                Integer min = Collections.min(listAux);
                if (processed - min >= 0){
                    listAux.remove(index);
                    continue;
                } else {
                    break;
                }
            }
            counter++;
        }

        Integer result = counter + (int) processed;
        System.out.println(result);

        return result;
    }
}
