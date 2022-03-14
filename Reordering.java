package com.company;


/**
 * First task solution class
 */
public class Reordering {
    /**
     *  sorting consists of 3 parts
     *  odd elements are selected first from the smallest
     *  then zeros
     *  then even from the largest
     *
     * @param arr Source array
     */
    public static void reorder(int[] arr) {

        int min;
        int f = 1;
        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;

            if (f == 1)
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] % 2 != 0 && arr[j] != 0) {
                        if (arr[j] < min) {
                            min = arr[j];
                            arr[j] = arr[i];
                            arr[i] = min;

                        }
                    }
                }

        if (min == Integer.MAX_VALUE) f = 0;
            if (f == 0)
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        if (arr[j] < min) {
                            min = arr[j];
                            arr[j] = arr[i];
                            arr[i] = min;
                        }
                    }
                }

        if (min == Integer.MAX_VALUE) f = 2;
            min = Integer.MIN_VALUE;
            if (f == 2)
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] > min) {
                        min = arr[j];
                        arr[j] = arr[i];
                        arr[i] = min;
                    }
                }
        }
    }
}
