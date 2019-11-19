package studios.restaurant;
import java.util.ArrayList;


public class Menu {

    private ArrayList<MenuItem> foodOptions;

    //add an item to the menu
    public void addMenuItem(MenuItem food) {
      foodOptions.add(food);
    }

    //remove an item from the menu
    public void removeMenuItem(MenuItem food) {
        foodOptions.remove(food);
    }

//    public String lastUpdated(MenuItem) {
//        return ("The menu was last updated on " + MenuItem.dateUpdated);
//    }
//
//    public String printItem(MenuItem) {
//        System.out.println("Menu Item: " + itemName.MenuItem +
//                "Description: " +  itemDescription.MenuItem +
//                "Price: " + itemPrice.MenuItem
//        )
//    }


    //getters and setters
    public ArrayList<MenuItem> getFoodOptions() {
        return foodOptions;
    }

    public void setFoodOptions(ArrayList<MenuItem> foodOptions) {
        this.foodOptions = foodOptions;
    }

//    @java.lang.Override
//    public java.lang.String toString() {
//        return "Menu{
//                "foodOptions=" + foodOptions +
//                '}';
//    }
}
