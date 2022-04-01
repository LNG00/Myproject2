package com.lin.sales;

import com.lin.sales.Customer;

public class silercustomer extends Customer {
    int openpoint;
    public silercustomer(String good, int amount){
        super(good, amount);
    }
    public int getOpenpoint(){
        return (int)(amount*0.1);
    }
    @Override
    public void print(){
        float gone = (amount/1000)*100;
        float money = amount - gone;
        System.out.println(id + "\t" + amount +  "\t" + money + "\t" + "(" +getOpenpoint() + ")");
    }
}
