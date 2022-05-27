package com.lin.sales;

import com.lin.sales.Customer;
import com.lin.sales.silercustomer;

import java.util.ArrayList;
import java.util.List;


public class Salestester {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("001", 1200));
        customers.add(new Customer("002", 800));
        customers.add(new silercustomer("003",2150));
        customers.add(new Goldencustomer("004",2150));
        customers.add(new Platinumcustomer("005",2500));

        for (Customer c: customers
             ) {
            c.print();
        }

    }
}
