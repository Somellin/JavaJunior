package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepetitionCount {
    public static Map<Integer,Integer> count(int[] arr) {
        Map<Integer,Integer> result = new HashMap<>();
        Set<Integer> integerSet = new HashSet<>();
      int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (integerSet.contains(arr[i])) continue;

            integerSet.add(arr[i]);
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }

            result.put(arr[i],count);
            count = 0;
        }
        int maxC=0;
        for (Integer integer: integerSet) {
            if (maxC < result.get(integer))
                maxC = result.get(integer);
        }

        System.out.println("Max reps = " + maxC);
        System.out.print("for numbers -> ");
        for (Integer key: integerSet) {
            if (maxC == result.get(key))
                System.out.print(key + " ");
        }


      return result;
    }
}
