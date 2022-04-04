package com.lin.highspeed;

import com.lin.highspeed.Ticket;

public class StudentTicket extends Ticket {
    public StudentTicket(Station start, Station end) {
        super(start, end);
    }
    @Override
    public void print(){
        float money = price*off1;
        System.out.println(start.name + " to " +end.name + "\t" + money);
    }
}
