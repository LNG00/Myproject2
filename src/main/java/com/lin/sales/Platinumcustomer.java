package com.lin.sales;

import com.lin.sales.Goldencustomer;

public class Platinumcustomer extends Goldencustomer{
    public Platinumcustomer(String good, int amount){
        super(good, amount);
    }
    public int getOpenpoint(){
        return (int)(amount*0.2);
    }
    @Override

    public void print(){
        float gone = amount*off2;
        float money = amount - gone;
        System.out.println(id + "\t" + amount + "\t" + money + "\t" + "(" + getOpenpoint() + ")");
    }
}
