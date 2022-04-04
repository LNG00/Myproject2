package com.lin.ticket;

public class Station {
    public static final Station TAIPEI_CITY = new Station("Taipei",100);
    public static final Station TAICHUNG_CITY = new Station("Taichung",200);
    public static final Station KAOHSIUNG_CITY = new Station("Kaohsiung",300);

    int price;
    String name;
    public Station(String name, int price){
        this.price = price;
        this.name = name;
    }
}
