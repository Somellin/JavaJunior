package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static int play(int rolls) {

        int[] P1 = new int[3];
        int[] P2 = new int[3];

        int[] Rolls = new int[rolls];

        for (int i = 0; i < 3; i++) {
            P1[i] = ThreadLocalRandom.current().nextInt(7);
            P2[i] = ThreadLocalRandom.current().nextInt(7);
        }
        for (int i = 0; i < rolls; i++) {
            Rolls[i] = ThreadLocalRandom.current().nextInt(7);
        }


//        System.out.println("Player1 = " + Arrays.toString(P1));
//        System.out.println("Player2 = " + Arrays.toString(P2));
//        System.out.println("Rolls = " + Arrays.toString(Rolls));

        int countP1, countP2;

        countP1 = scoring(Rolls, P1);
        countP2 = scoring(Rolls, P2);

//        System.out.println("P1 = " + countP1);
//        System.out.println("P2 = " + countP2);

        if (countP1 > countP2){
//            System.out.println("Player 1 won");
            return 1;
        }
        else if (countP1 < countP2){
//            System.out.println("Player 2 won");
            return 2;
        }
        else{
//            System.out.println("Draw");
            return 0;
        }


    }

    public static int scoring(int[] Rolls, int[] P) {
        int i, win = 0, countP = 0;
        for (i = 0; i < Rolls.length - 2; i++) {
            if (Rolls[i] == P[0]) {
                for (int j = 0; j < P.length; j++) {
                    if (Rolls[i + j] == P[j]) {
                        win++;
                    } else win = 0;
                }
            } else win = 0;

            if (win == 3) {
                countP++;
                win = 0;
                i += 3;
            }
        }
        return countP;
    }

    public static void probabilityWinningOrDraw(int bank,int rolls) {
        int count = 0;
        int countDraw = 0;
        int tmp;
        for (int i = 0; i < bank; i++) {
            tmp = play(rolls);
            if (tmp == 1)
                count++;
            else if (tmp == 0)
                countDraw++;

        }

        System.out.println("Number of games : " + bank);
        System.out.println("Number of wins : " + count);
        System.out.println("Number of draws : " + countDraw);
        System.out.println("Number of losses : " + (bank-(count+countDraw)));

        System.out.println("Probability of winning = " + (double)count/bank);
        System.out.println("Probability of draw = " + (double)countDraw/bank);
    }
}
