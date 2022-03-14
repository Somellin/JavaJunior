package com.company;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Class for generating array
 */
public class RandArray {

    /**
     * Method for get array
     * @param size - size array
     * @param range - range of array values
     * @return - resulting array
     */
    public static int[] getArray(int size, int range){
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(range);
        }
        return arr;
    }
}
