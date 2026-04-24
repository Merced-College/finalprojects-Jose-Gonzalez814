import java.util.*;
// Manages all orders and tracks popularity using a hash table

public class OrderManager {
    private Queue<Order> orderQueue = new LinkedList<>();
    private HashMap<String, Integer> popularity = new HashMap<>();

// Add an order to the queue
    public void addOrder(Order order) {
        orderQueue.add(order);
    }

// Get the next order in line

    public Order nextOrder() {
        return orderQueue.poll();
    }
// Track how many times an item is ordered

    public void trackItem(String itemName) {
        popularity.put(itemName, popularity.getOrDefault(itemName, 0) + 1);
    }
// Print popularity stats to put it plainly it tracks the amount of times a item has been ordered

    public void displayStats() {
        System.out.println("\n--- POPULAR ITEMS ---");
        for (String item : popularity.keySet()) {
            System.out.println(item + ": " + popularity.get(item) + " orders");
        }
    }
}
