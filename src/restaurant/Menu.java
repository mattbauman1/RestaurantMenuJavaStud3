package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        if(!items.contains(item)) {
            items.add(item);
        }
        else {
            System.out.println("Item: " + item.toString() + " is already in the Menu and will not be added again!");
        }
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public boolean isNewItem(MenuItem item) {
        return item.getThisIsNew();
    }

    public void printItem(MenuItem item) {
        System.out.println(item.toString());
    }

    public void printMenu() {
        System.out.println("Items in menu last updated: " + lastUpdated);
        for(MenuItem item : items) {
            System.out.println(item.toString());
        }
    }
}
