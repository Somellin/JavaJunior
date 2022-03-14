package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = RandArray.getArray(10, 10);
        System.out.println("Source array");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nTask 1");
        Reordering.reorder(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("\nTask 2");
        RepetitionCount.count(arr);

        System.out.println("\n\nTask 3");
//        Game.play(1001);
        Game.probabilityWinningOrDraw(10000,10001);
    }
}
