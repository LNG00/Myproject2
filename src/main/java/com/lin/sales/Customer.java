package com.lin.sales;

public class Customer {
    String id;
    int customer ;
    //int silvercustomer;
    //int goldencustomer;
    int amount;
    int discount;
    float off = 0.1f;
    public Customer(String id,int amount){
        this.id = id;
        this.amount = amount;
    }
    public float getoffmoney(){
        return (amount/1000)*off*1000;
    }
    public void print(){
        float money = amount - getoffmoney();
        System.out.println(id + "\t" + amount + "\t" +money);
    }
}
