import java.util.*;

public class Order {
    private Queue<MenuItem> items = new LinkedList<>();
// Add an item to the order
    public void addItem(MenuItem item) {
        items.add(item);
    }
// Calculates total using recursion
    public double calculateTotal() {
        return calculateRecursive(new ArrayList<>(items), 0);
    }

// Recursive total calculator or to put it more plainly its a Recursive function to add up prices
    private double calculateRecursive(ArrayList<MenuItem> list, int index) {
        if (index == list.size()) return 0;
        return list.get(index).getPrice() + calculateRecursive(list, index + 1);
    }

// Prints the order summary
    public void displayOrder() {
        System.out.println("\n--- ORDER SUMMARY ---");
        for (MenuItem item : items) {
            System.out.println(" - " + item);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
