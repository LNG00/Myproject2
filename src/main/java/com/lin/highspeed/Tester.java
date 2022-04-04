package com.lin.highspeed;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        int choice = Integer.parseInt(scanner.next());
        Station startstation = null;
        switch (choice) {
            case 1:
                startstation = Station.TAIPEI_CITY;
                break;
            case 2:
                startstation = Station.TAICHUNG_CITY;
                break;
            case 3:
                startstation = Station.KAOHSIUNG_CITY;
                break;
        }
        System.out.println("Your end station?(Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice = Integer.parseInt(scanner.next());
        Station endstation = null;
        switch (choice) {
            case 1:
                endstation = Station.TAIPEI_CITY;
                break;
            case 2:
                endstation = Station.TAICHUNG_CITY;
                break;
            case 3:
                endstation = Station.KAOHSIUNG_CITY;
                break;
        }
        System.out.println("Which kind of ticket? 1.Normal ticket 2.Student ticket 3.Elder ticket");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice) {
            case 1:
                ticket = new Ticket(startstation, endstation);
                break;
            case 2:
                ticket = new StudentTicket(startstation, endstation);
                break;
            case 3:
                ticket = new ElderTicket(startstation, endstation);
                break;
        }


        ticket.print();
    }
}

