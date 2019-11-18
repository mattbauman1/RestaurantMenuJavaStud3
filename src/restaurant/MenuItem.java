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

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setThisIsNew(boolean thisIsNew) {
        this.thisIsNew = thisIsNew;
    }
}
