
import java.util.ArrayList;
import java.util.Scanner;
public class NepaliRestaurantMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Item> menu = new ArrayList<>();

        // Adding Nepali food items
        menu.add(new Item("Dal-Bhat", 180, true));
        menu.add(new Item("Veg Momo", 220, true));
        menu.add(new Item("Chicken Momo", 250, false));
        menu.add(new Item("Sekuwa", 350, false));
        menu.add(new Item("Paneer Chilli", 300, true));
        menu.add(new Item("Aloo Tama", 200, true));

        int choice;

        do {
            System.out.println("\n===== Nepali Menu Manager =====");
            System.out.println("1. Display Vegetarian Items");
            System.out.println("2. Vegetarian Items Over Rs. 200");
            System.out.println("3. Remove Unavailable Item");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayVegetarian(menu);
                    break;

                case 2:
                    displayVegAbove200(menu);
                    break;

                case 3:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    removeItem(menu, removeName);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }

    // Method to display vegetarian items
    static void displayVegetarian(ArrayList<Item> menu) {
        System.out.println("\nVegetarian Items:");
        for (Item item : menu) {
            if (item.isVegetarian) {
                item.display();
            }
        }
    }

    // Method to display vegetarian items over Rs.200
    static void displayVegAbove200(ArrayList<Item> menu) {
        System.out.println("\nVegetarian Items Over Rs. 200:");
        for (Item item : menu) {
            if (item.isVegetarian && item.price > 200) {
                item.display();
            }
        }
    }

    // Method to remove unavailable item
    static void removeItem(ArrayList<Item> menu, String name) {
        boolean removed = false;

        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).name.equalsIgnoreCase(name)) {
                menu.remove(i);
                removed = true;
                System.out.println("Item removed successfully.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Item not found.");
        }
    }
}
