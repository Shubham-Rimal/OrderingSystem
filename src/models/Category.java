package models;

import java.util.ArrayList;

public class Category extends MainCategory {
    ArrayList<String> non_veg_items;
    ArrayList<String> veg_items;
    ArrayList<String> drink_items;

    public Category(ArrayList<ArrayList> breakfast, ArrayList<ArrayList> lunch, ArrayList<ArrayList> snacks, ArrayList<String> non_veg_items, ArrayList<String> veg_items, ArrayList<String> drink_items) {
        super(breakfast, lunch, snacks);
        this.non_veg_items = non_veg_items;
        this.veg_items = veg_items;
        this.drink_items = drink_items;
    }
}
