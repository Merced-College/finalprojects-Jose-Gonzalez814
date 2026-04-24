import java.util.Scanner;
// Main system that handles user interaction

public class RestaurantSystem {
    private Menu menu = new Menu();
    private OrderManager manager = new OrderManager();
    private Scanner input = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n--- RESTAURANT ORDERING SYSTEM ---");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Popular Items");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> menu.displayMenu();
                case 2 -> placeOrder();
                case 3 -> manager.displayStats();
                case 4 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
// Handles placing an order

    private void placeOrder() {
        Order order = new Order();

        while (true) {
            System.out.print("\nEnter item name (or done): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("done")) break;

            MenuItem item = menu.searchItem(name);
            if (item != null) {
                order.addItem(item);
                manager.trackItem(item.getName());
                System.out.println("Added: " + item);
            } else {
                System.out.println("Item not found.");
            }
        }

        order.displayOrder();
        manager.addOrder(order);
    }
}
