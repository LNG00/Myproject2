package com.lin.highspeed;

public class ticket {
    public static final int TAIPEI_CITY = 100;
    public static int TAICHUMG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;

    int price;
    station start;
    station destination;
    public ticket(station start,station destination){
        this.start = start;
        this.destination = destination;
    }

    public void print(){
        //taipeicity = 100;
    }
}
