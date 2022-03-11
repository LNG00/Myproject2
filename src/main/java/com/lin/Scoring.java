package com.lin;

public class Scoring {
    public static void main(String[] args) {
        Student lin = new Student("Lin" , 55, 50);
        GraduateStudent jolin = new GraduateStudent("Jolin", 70, 80, 90);
        //lin.name = "Lin";
        //lin.Chinese = 75;
        //lin.English = 90;
        lin.print();
        jolin.print();
    }
}
