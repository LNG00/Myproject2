package com.lin.ticket;

public class ElderTicket extends StudentTicket {
    public ElderTicket(Station start, Station end) {
        super(start, end);
    }

    @Override
    public void print() {
        float money = price*off1;
        System.out.println(start.name + " to " + end.name + "\t" + money);
    }
}
