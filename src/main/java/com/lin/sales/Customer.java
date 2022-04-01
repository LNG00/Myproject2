package com.lin.sales;

public class Customer {
    String id;
    int customer ;
    //int silvercustomer;
    //int goldencustomer;
    int amount;
    int discount;
    int openpoint;
    float off1 = 0.1f;
    float off2 = 0.3f;
    public Customer(String id,int amount){
        this.id = id;
        this.amount = amount;
    }
    public float discount(){
        return (amount/1000)*off1*1000;
    }
    public void print(){
        float money = amount - discount();
        System.out.println(id + "\t" + amount + "\t" +money);
    }
}
