package models;

import java.util.ArrayList;

public class MainCategory {
    ArrayList<ArrayList> Breakfast;
    ArrayList<ArrayList> Lunch;
    ArrayList<ArrayList> Snacks;

    public MainCategory(ArrayList<ArrayList> breakfast, ArrayList<ArrayList> lunch, ArrayList<ArrayList> snacks) {
        Breakfast = breakfast;
        Lunch = lunch;
        Snacks = snacks;
    }

    public ArrayList<ArrayList> getBreakfast() {
        return Breakfast;
    }

    public void setBreakfast(ArrayList<ArrayList> breakfast) {
        Breakfast = breakfast;
    }

    public ArrayList<ArrayList> getLunch() {
        return Lunch;
    }

    public void setLunch(ArrayList<ArrayList> lunch) {
        Lunch = lunch;
    }

    public ArrayList<ArrayList> getSnacks() {
        return Snacks;
    }

    public void setSnacks(ArrayList<ArrayList> snacks) {
        Snacks = snacks;
    }
}
