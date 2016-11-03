package com.ironyard.data;

import java.util.*;

/**
 * Created by nathanielellsworth on 10/20/16.
 */
public class Kata {


    // (.1
    public static int caughtSpeeding(int Speed, boolean Birthday) {
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
    public static int sortaSum(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19)
            return 20;
        return sum;
    }






    // (.3
    public static boolean love6(int x, int y) {
        if (x == 6 || y == 6)
            return true;
        return ((x + y) == 6 || Math.abs(x - y) == 6);
    }






    // (.4
    public static String blackJack(List<Integer> dealer, List<Integer> player) {
        String result = null;
        int d = 0;
        int p = 0;

        for (int h = 0; h < dealer.size(); h++) {
            d = d + dealer.get(h);
        }
        for (int g = 0; g < player.size(); g++) {
            p = p + player.get(g);
        }
        if (p > d && p <= 21) {
            result = "Player";
        } else if ((p == d) || (d > 21)) {
            result = "Player";
        }
        if ((d > p || p > 21) && d <= 21) {
            result = "Dealer";
        }
        if (d == 21 || p == 21) {
            result = result + "BlackJack";
        }
        return result;
    }

}
