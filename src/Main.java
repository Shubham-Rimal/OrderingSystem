import models.Customer;
import models.Items;
import models.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> momo = new ArrayList<>();
        ArrayList<String> chowmein = new ArrayList<>();
        ArrayList<String> pizza = new ArrayList<>();
        ArrayList<String> burger = new ArrayList<>();
        ArrayList<String> thali_set = new ArrayList<>();
        ArrayList<String> toast = new ArrayList<>();

        momo.add("Chicken Momo");
        momo.add("Buff Momo");
        momo.add("Veg Momo");

        chowmein.add("Chicken Chowmein");
        chowmein.add("Buff Chowmein");
        chowmein.add("Veg Chowmein");

        pizza.add("Mix Pizza");
        pizza.add("Cheese Pizza");
        pizza.add("Chicken Pizza");
        pizza.add("Pork Salami Pizza");
        pizza.add("Meat Lovers Pizza");

        burger.add("Hamburger");
        burger.add("Veg Burger");
        burger.add("Chicken Burger");
        burger.add("Cheese Burger");

        thali_set.add("Chicken Thali Set");
        thali_set.add("Veg Thali Set");
        thali_set.add("Mutton Thali Set");
        thali_set.add("Fish Thali Set");

        toast.add("Avocado and Eggs Toast");
        toast.add("Cheese Toast");
        toast.add("French Toast");
        toast.add("Plain Toast");
        toast.add("Butter Toast");
        toast.add("Fruit Jam Toast");

        ArrayList<ArrayList> breakfast = new ArrayList<>();
        ArrayList<ArrayList> lunch = new ArrayList<>();
        ArrayList<ArrayList> snacks = new ArrayList<>();

        breakfast.add(toast);

        lunch.add(thali_set);

        snacks.add(momo);
        snacks.add(chowmein);
        snacks.add(pizza);
        snacks.add(burger);

        ArrayList<String> non_veg = new ArrayList<>();

        non_veg.add(momo.get(0));
        non_veg.add(momo.get(1));
        non_veg.add(chowmein.get(0));
        non_veg.add(chowmein.get(1));
        non_veg.add(pizza.get(0));
        non_veg.add(pizza.get(2));
        non_veg.add(pizza.get(3));
        non_veg.add(pizza.get(4));
        non_veg.add(thali_set.get(0));
        non_veg.add(thali_set.get(2));
        non_veg.add(thali_set.get(3));
        non_veg.add(burger.get(0));
        non_veg.add(burger.get(2));
        non_veg.add(burger.get(3));
        non_veg.add(toast.get(0));

        ArrayList<String> veg = new ArrayList<>();

        veg.add(momo.get(2));
        veg.add(chowmein.get(2));
        veg.add(pizza.get(1));
        veg.add(burger.get(1));
        veg.add(thali_set.get(1));
        veg.add(toast.get(1));
        veg.add(toast.get(2));
        veg.add(toast.get(3));
        veg.add(toast.get(4));
        veg.add(toast.get(5));

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Soda");
        drinks.add("Milkshake");
        drinks.add("Coffee");
        drinks.add("Black Tea");
        drinks.add("Milk Tea");

        Items i1 = new Items(breakfast, lunch, snacks, non_veg, veg, drinks, momo, chowmein, pizza, burger, thali_set, toast);

        ArrayList<String> order1 = new ArrayList<>();

        order1.add(momo.get(0));
        order1.add(momo.get(2));
        order1.add(pizza.get(4));
        order1.add(drinks.get(0));
        order1.add(drinks.get(0));

        Order o1 = new Order(order1);

        Customer c1 = new Customer(order1, "Logan", 850);



        System.out.println("\n\n\n--------------------------------Menu--------------------------------");
        System.out.println("Breakfast: ");
        for (ArrayList singleBreakfast: breakfast){
            System.out.println(singleBreakfast);
        }
        System.out.println("\nLunch: ");
        for (ArrayList singleLunch: lunch){
            System.out.println(singleLunch);
        }
        System.out.println("\nSnacks: ");
        for (ArrayList singleSnacks: snacks){
            System.out.println(singleSnacks);
        }
        System.out.println("\n\n\n---------------------------------Bill---------------------------------");
        System.out.println(c1.getName()+"'s orders:\n");
        for (String singleOrder: order1){
            System.out.println(singleOrder);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        c1.getInvoice();
    }

}