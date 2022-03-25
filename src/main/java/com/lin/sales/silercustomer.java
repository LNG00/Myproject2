package com.lin.sales;

import com.lin.sales.Customer;

public class silercustomer extends Customer {
    int returnMoney;
    public silercustomer(String good, int amount){
        super(good, amount);
    }
    public int getReturnMoney(){
        return (int)(amount*0.1f);
    }
    @Override
    public void print(){
        float gone = amount*off;
        float money = amount - gone;
        System.out.println(id + "\t" + amount + "\t" + money + "\t");

    }
}
