package com.lin.highspeed;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        int choice = Integer.parseInt(scanner.next());
        station startstation = null;
        switch (choice){
            case 1:
                startstation = station.TAIPEI_CITY;
                break;
            case 2:
                startstation = station.TAICHUNG_CITY;
                break;
            case 3:
                startstation = station.KAOHSIUNG_CITY;
                break;
        }
        System.out.println("Your destination station?(Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        station endstation = null;
        switch (choice){
            case 1:
                endstation = station.TAIPEI_CITY;
                break;
            case 2:
                endstation = station.TAICHUNG_CITY;
                break;
            case 3:
                endstation = station.KAOHSIUNG_CITY;
                break;
        }
        ticket ticket = new ticket(
                startstation, endstation);
    }
}
