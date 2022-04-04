package com.lin.ticket;

public class Ticket {
    public static int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;

    String name;
    int price;
    int number;
    Station start;
    Station end;
    float off1 = 0.5f;

    public Ticket(Station start, Station end) {
        this.start = start;
        this.end = end;

        if (start == Station.TAIPEI_CITY) {
            if (end == Station.TAICHUNG_CITY) {
                price =  700;
            } else {
                price =  1500;
            }
        } else if (start == Station.TAICHUNG_CITY) {
            if (end == Station.TAIPEI_CITY) {
                price =  700;
            } else {
                price =  800;
            }
        } else if (start == Station.KAOHSIUNG_CITY) {
            if (end == Station.TAICHUNG_CITY) {
                price =  800;
            } else {
                price =  1500;
            }
        }
    }


    public void print() {
        System.out.println(start.name + " to " + end.name + "\t" + price);
    }
}
