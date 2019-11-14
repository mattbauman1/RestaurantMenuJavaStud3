package restaurant;

public class MenuItem {

    private float price;
    private String description;
    private String category;
    private boolean thisIsNew;

    public MenuItem(float price, String description, String category, boolean thisIsNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.thisIsNew = thisIsNew;
    }


}
