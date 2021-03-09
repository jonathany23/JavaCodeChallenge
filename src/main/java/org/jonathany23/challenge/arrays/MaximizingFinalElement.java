package org.jonathany23.challenge.arrays;

import java.util.Collections;
import java.util.List;

public class MaximizingFinalElement {

    public static int getMaxValue(List<Integer> arr) {
        Collections.sort(arr);
        int aux = 0;

        for (int i = 0; i < arr.size(); i++) {

            int item = arr.get(i);
            if (i == 0){
                aux = item - 1;
                item -= aux;
                arr.set(i, item);
            } else {
                int previusValue = arr.get(i-1);
                int diff = item - previusValue;
                if (diff > 1){
                    item = item - diff + 1;
                    arr.set(i, item);
                }
            }
        }

        //arr.forEach(x -> System.out.print(x + " "));

        return arr.get(arr.size()-1);
    }
}
