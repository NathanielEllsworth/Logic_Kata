package com.ironyard.data;

import java.util.*;

/**
 * Created by nathanielellsworth on 10/20/16.
 */
public class Main {

    public static void main(String[] args){

        caughtSpeedingv1();
        caughtSpeedingv2();
        caughtSpeedingv3();
        caughtSpeedingv4();

        sortaSumv1();
        sortaSumv2();
        sortaSumv3();

        love6v1();
        love6v2();
        love6v3();

        blackJackv1();
        blackJackv2();
        blackJackv3();
        blackJackv4();



    }

    // (.1
    private static void caughtSpeedingv1(){
        int x =60;
        boolean y = false;
        int z = Kata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);
    }
    private static void caughtSpeedingv2(){
        int x =65;
        boolean y = false;
        int z = Kata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);
    }
    private static void caughtSpeedingv3(){
        int x =65;
        boolean y = true;
        int z = Kata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);
    }
    private static void caughtSpeedingv4(){
        int x =81;
        boolean y = false;
        int z = Kata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);
    }




    // (.2
    private static void sortaSumv1(){
        int x =3;
        int y = 4;
        int z = Kata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);
    }
    private static void sortaSumv2(){
        int x =9;
        int y = 4;
        int z = Kata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);
    }
    private static void sortaSumv3(){
        int x =10;
        int y = 11;
        int z = Kata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);
    }





    // (.3
    private static void love6v1(){
        int x = 6;
        int y = 4;
        boolean z = Kata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);
    }
    private static void love6v2(){
        int x = 4;
        int y = 5;
        boolean z = Kata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);
    }
    private static void love6v3(){
        int x = 1;
        int y = 5;
        boolean z = Kata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);
    }




    // (.4
    private static void blackJackv1(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(3);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);
        y.add(10);
        String z = Kata.blackJack(x,y);
        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);
    }
    private static void blackJackv2(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(3);
        x.add(5);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);
        String z = Kata.blackJack(x,y);
        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);
    }
    private static void blackJackv3(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(6);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);
        y.add(3);
        String z = Kata.blackJack(x,y);
        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);
    }
    private static void blackJackv4(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(30);
        x.add(10);
        List<Integer> y = new ArrayList<Integer>();
        y.add(11);
        y.add(10);
        String z = Kata.blackJack(x,y);
        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);
    }

}
