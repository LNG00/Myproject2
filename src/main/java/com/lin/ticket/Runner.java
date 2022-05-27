package com.lin.ticket;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:00";
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        long a = 3*60*60*1000;
        Date d2 = new Date();
        d2.setTime(d.getTime()+a);
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
