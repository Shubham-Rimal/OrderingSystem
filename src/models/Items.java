package models;

import java.util.ArrayList;

public class Items extends Category{
    ArrayList<String> Momo;
    ArrayList<String> Chowmein;
    ArrayList<String> Pizza;
    ArrayList<String> Burger;
    ArrayList<String> Thali_Set;
    ArrayList<String> Toast;

    public ArrayList<String> getMomo() {
        System.out.println("Momo");
        return Momo;
    }

    public void setMomo(ArrayList<String> momo) {
        Momo = momo;
    }

    public ArrayList<String> getChowmein() {
        System.out.println("Chowmein");
        return Chowmein;
    }

    public void setChowmein(ArrayList<String> chowmein) {
        Chowmein = chowmein;
    }

    public ArrayList<String> getPizza() {
        System.out.println("Pizza");
        return Pizza;
    }

    public void setPizza(ArrayList<String> pizza) {
        Pizza = pizza;
    }

    public ArrayList<String> getBurger() {
        System.out.println("Burger");
        return Burger;
    }

    public void setBurger(ArrayList<String> burger) {
        Burger = burger;
    }

    public ArrayList<String> getThali_Set() {
        System.out.println("Thali Set");
        return Thali_Set;
    }

    public void setThali_Set(ArrayList<String> thali_Set) {
        Thali_Set = thali_Set;
    }

    public ArrayList<String> getToast() {
        System.out.println("Toast");
        return Toast;
    }

    public void setToast(ArrayList<String> toast) {
        Toast = toast;
    }

    public Items(ArrayList<ArrayList> breakfast, ArrayList<ArrayList> lunch, ArrayList<ArrayList> snacks, ArrayList<String> non_veg_items, ArrayList<String> veg_items, ArrayList<String> drink_items, ArrayList<String> momo, ArrayList<String> chowmein, ArrayList<String> pizza, ArrayList<String> burger, ArrayList<String> thali_Set, ArrayList<String> toast) {
        super(breakfast, lunch, snacks, non_veg_items, veg_items, drink_items);
        Momo = momo;
        Chowmein = chowmein;
        Pizza = pizza;
        Burger = burger;
        Thali_Set = thali_Set;
        Toast = toast;
    }
}
