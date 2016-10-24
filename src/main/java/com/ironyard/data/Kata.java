package com.ironyard.data;

import java.util.*;

/**
 * Created by nathanielellsworth on 10/20/16.
 */
public class Kata {





    // (.1
    public static int caughtSpeeding(int Speed, boolean Birthday){
        if (Birthday)
            Speed -= 5;
        if (Speed <= 60)
            return 0;
        else if (Speed <= 80)
            return 1;
        else
            return 2;
    }





    // (.2
    public static int sortaSum(int x, int y){
        int sum = x + y;
        if (sum >= 10 && sum <= 19)
            return 20;
        return sum;
    }





    // (.3
    public static boolean love6(int x, int y){
        if (x == 6 || y == 6)
            return true;
        return ((x + y) == 6 || Math.abs(x - y) == 6);
    }





    // (.4
//    public static String blackJack(List<Integer>Dealer, List<Integer>Player) {
//        String result = null;
//        int D = 0;
//        int P = 0;
//    }

}
