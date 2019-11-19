package studios.restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private String itemCategory;
    private boolean isNew;
    private Date dateUpdated;

    public MenuItem(String itemName, String itemDescription, double itemPrice, String itemCategory, boolean isNew, Date dateUpdated) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.isNew = isNew;
        this.dateUpdated = dateUpdated;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemCategory='" + itemCategory + '\'' +
                ", isNew=" + isNew +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
