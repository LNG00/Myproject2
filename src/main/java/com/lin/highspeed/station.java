package com.lin.highspeed;

public class station {
    public static final station TAIPEI_CITY =
            new station(100,"Taipei");
    public static final station TAICHUNG_CITY =
            new station(200,"Taichung");
    public static final station KAOHSIUNG_CITY =
            new station(300,"Kaohsiung");
    int id;
    String name;
    public station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
