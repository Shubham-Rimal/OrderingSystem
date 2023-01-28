package models;

import java.util.ArrayList;

public class Customer extends Order{
    String name;
    double totalPrice;

    public Customer(ArrayList<String> order1, String name, double totalPrice) {
        super(order1);
        this.name = name;
        this.totalPrice = totalPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInvoice(){
        double total = totalPrice + (0.13*totalPrice);
        System.out.println("The Total bill including 13% service tax: Rs."+total);
        return total;
    }

}
