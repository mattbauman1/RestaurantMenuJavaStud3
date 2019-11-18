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

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getThisIsNew() {
        return thisIsNew;
    }

    public String toString() {
        return "Item: " + description + ", Category: " + category + ", Price: " + price + ", New(y/n): " + (thisIsNew ? "Y" : "N");
    }

    public boolean equals(Object item) {
        if(item == this) {
            return true;
        }
        if(item == null) {
            return false;
        }
        if(item.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem)item;
        return theItem.price == price && theItem.description.equals(description) && theItem.category.equals(category);
    }
 }
