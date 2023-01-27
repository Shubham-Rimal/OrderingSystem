package models;

import java.util.ArrayList;

public class Customer {
    String name;

    public Customer(String name, ArrayList<String> order) {

        this.name = name;
        this.order = order;
    }

    ArrayList<String> order;
}
