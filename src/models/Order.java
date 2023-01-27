package models;

import java.util.ArrayList;

public class Order extends Items{
    ArrayList<String> order1;

    public Order(ArrayList<ArrayList> breakfast, ArrayList<ArrayList> lunch, ArrayList<ArrayList> snacks, ArrayList<String> non_veg_items, ArrayList<String> veg_items, ArrayList<String> drink_items, ArrayList<String> momo, ArrayList<String> chowmein, ArrayList<String> pizza, ArrayList<String> burger, ArrayList<String> thali_Set, ArrayList<String> toast, ArrayList<String> order1) {
        super(breakfast, lunch, snacks, non_veg_items, veg_items, drink_items, momo, chowmein, pizza, burger, thali_Set, toast);
        this.order1 = order1;
    }

    double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
