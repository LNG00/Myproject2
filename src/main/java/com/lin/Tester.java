package com.lin;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(7);
        int n2 = list.get(5);
        //arrayTest();
    }

    private static void arrayTest(){
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
    }
}
