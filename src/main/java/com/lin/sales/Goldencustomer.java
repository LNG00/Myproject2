package com.lin.sales;

import com.lin.sales.silercustomer;

public class Goldencustomer extends silercustomer {
    //int returnMoney;
    public Goldencustomer(String good, int amount){
        super(good, amount);
}

    @Override
    public void print(){
        float gone = amount*off1;
        float money = amount - gone;
        System.out.println(id + "\t" + amount + "\t" + money + "\t" + "(" + getOpenpoint() + ")");
    }
}
