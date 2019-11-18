package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Restaurant {

    public static void main(String[] args) {
	    //Create a bunch of menu items
        MenuItem one = new MenuItem((float)2.34, "Toast", "Breakfast", true);
        MenuItem two = new MenuItem((float)2.33, "Jam", "Breakfast", false);
        MenuItem three = new MenuItem((float)2.34, "Eggs", "Breakfast", true);
        MenuItem four = new MenuItem((float)28.35, "Bacon", "Breakfast", false);
        MenuItem five = new MenuItem((float)2.34, "Sausage", "Breakfast", true);
        MenuItem six = new MenuItem((float)23.33, "Waffle", "Breakfast", false);
        MenuItem seven = new MenuItem((float)2.34, "Burger", "Lunch", true);
        MenuItem eight = new MenuItem((float)27.35, "Hot Dog", "Lunch", false);
        MenuItem nine = new MenuItem((float)2.34, "Salad", "Lunch", true);
        MenuItem ten = new MenuItem((float)2.33, "Gyro", "Lunch", false);
        MenuItem eleven = new MenuItem((float)26.34, "Vegetable Soup", "Lunch", true);
        MenuItem twelve = new MenuItem((float)2.35, "Grilled Cheese", "Lunch", false);
        MenuItem thirteen = new MenuItem((float)12.34, "Steak", "Dinner", true);
        MenuItem fourteen = new MenuItem((float)2.33, "Pizza", "Dinner", false);
        MenuItem fifteen = new MenuItem((float)52.34, "Taco", "Dinner", true);
        MenuItem sixteen = new MenuItem((float)23.35, "Steak Fajitas", "Dinner", false);
        MenuItem seventeen = new MenuItem((float)22.34, "Chicken Fajitas", "Dinner", true);
        MenuItem eighteen = new MenuItem((float)12.33, "Beef and Brocoli", "Dinner", false);

        //Make some menus with the menu items
        ArrayList<MenuItem> breakfastItems = new ArrayList<>();
        breakfastItems.add(one);
        breakfastItems.add(two);
        breakfastItems.add(three);
        Menu breakfast = new Menu(new Date(), breakfastItems);
        breakfast.addItem(four);
        breakfast.addItem(five);
        breakfast.addItem(six);
        ArrayList<MenuItem> lunchItems = new ArrayList<>();
        lunchItems.add(seven);
        lunchItems.add(eight);
        lunchItems.add(nine);
        Menu lunch = new Menu(new Date(), lunchItems);
        lunch.addItem(ten);
        lunch.addItem(eleven);
        lunch.addItem(twelve);
        ArrayList<MenuItem> dinnerItems = new ArrayList<>();
        dinnerItems.add(thirteen);
        dinnerItems.add(fourteen);
        dinnerItems.add(fifteen);
        Menu dinner = new Menu(new Date(), dinnerItems);
        dinner.addItem(sixteen);
        dinner.addItem(seventeen);
        dinner.addItem(eighteen);
        ArrayList<MenuItem> chefFavoriteItems = new ArrayList<>();
        chefFavoriteItems.add(one);
        chefFavoriteItems.add(seven);
        Menu chefFavorites = new Menu(new Date(), chefFavoriteItems);
        chefFavorites.addItem(thirteen);
        chefFavorites.addItem(five);
        chefFavorites.addItem(seventeen);
        ArrayList<MenuItem> dailySpecialItems = new ArrayList<>();
        dailySpecialItems.add(twelve);
        dailySpecialItems.add(nine);
        Menu dailySpecial = new Menu(new Date(), dailySpecialItems);
        dailySpecial.addItem(four);
        dailySpecial.addItem(nine);
        //Start printing the menus
        System.out.println("******************");
        breakfast.printMenu();
        System.out.println("******************");
        lunch.printMenu();
        System.out.println("******************");
        dinner.printMenu();
        System.out.println("******************");
        chefFavorites.printMenu();
        System.out.println("******************");
        dailySpecial.printMenu();
        System.out.println("******************");
        //Print individual item through menu
        lunch.printItem(seven);
        System.out.println("******************");
        dinner.printItem(eighteen);
        System.out.println("******************");
        breakfast.printItem(three);
        System.out.println("******************");
        //Print individual by calling its print toString method directly
        System.out.println(one.toString());
        System.out.println("******************");
        System.out.println(twelve.toString());
        System.out.println("******************");
        System.out.println(nine.toString());
        System.out.println("******************");
        //Remove an items from the specials
        dailySpecial.removeItem(four);
        dailySpecial.printMenu();
    }
}
