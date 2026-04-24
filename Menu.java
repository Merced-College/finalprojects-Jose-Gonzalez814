import java.util.*;
// Stores all menu items and handles searching, sorting, and categories
public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private LinkedList<String> categories = new LinkedList<>();

    public Menu() {
        loadDefaultMenu(); // loads the restaurant menu
    }
// Loads a realistic restaurant menu
    private void loadDefaultMenu() {
        addCategory("Appetizers");
        addCategory("Burgers");
        addCategory("Drinks");
        addCategory("Desserts");

        // Add items to the menu
        addItem(new MenuItem("Mozzarella Sticks", 7.99, "Appetizers"));
        addItem(new MenuItem("Chicken Wings", 12.49, "Appetizers"));
        addItem(new MenuItem("Garlic Bread", 5.49, "Appetizers"));

        addItem(new MenuItem("Classic Cheeseburger", 10.99, "Burgers"));
        addItem(new MenuItem("Bacon BBQ Burger", 12.99, "Burgers"));
        addItem(new MenuItem("Veggie Burger", 9.99, "Burgers"));

        addItem(new MenuItem("Soft Drink", 2.49, "Drinks"));
        addItem(new MenuItem("Iced Tea", 2.99, "Drinks"));
        addItem(new MenuItem("Milkshake", 4.99, "Drinks"));

        addItem(new MenuItem("Chocolate Cake", 6.49, "Desserts"));
        addItem(new MenuItem("Ice Cream Sundae", 5.99, "Desserts"));
    }
// Adds a category to the linked list
    public void addCategory(String category) {
        categories.add(category);
    }
// Adds a menu item to the array list
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Linear Search Algorithm to find an item by name
    public MenuItem searchItem(String name) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) return item;
        }
        return null;
    }

    // Selection Sort Algorithm to sort items by price
    public void sortByPrice() {
        for (int i = 0; i < items.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(j).getPrice() < items.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            Collections.swap(items, i, minIndex);
        }
    }
// Prints the full menu grouped by category
    public void displayMenu() {
        System.out.println("\n--- FULL MENU ---");
        for (String category : categories) {
            System.out.println("\n[" + category + "]");
            for (MenuItem item : items) {
                if (item.getCategory().equals(category)) {
                    System.out.println(" - " + item);
                }
            }
        }
    }
}
