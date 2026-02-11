public class KhanaGharMenu {

    // ================== Attributes ==================
    private String itemName;
    private double price;
    private String category;
    private boolean isVegetarian;
    private boolean isAvailable;

    // Extra attribute (allowed by question)
    private int calories;

    // ================== Constructor ==================
    public KhanaGharMenu(String itemName, double price, String category,
                         boolean isVegetarian, boolean isAvailable, int calories) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
        this.calories = calories;
    }

    // ================== Methods ==================
    public void displayItem() {
        System.out.printf(
            "%-25s Rs. %-6.2f %-15s %-12s %-10s %4d kcal%n",
            itemName,
            price,
            category,
            isVegetarian ? "Vegetarian" : "Non-Veg",
            isAvailable ? "Available" : "Not Available",
            calories
        );
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public boolean isNonVegetarian() {
        return !isVegetarian;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    // ================== Main Method ==================
    public static void main(String[] args) {

        // Creating menu items
        KhanaGharMenu[] menu = {
            new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true, 600),
            new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true, 80),
            new KhanaGharMenu("Dharane Kalo Bangur", 400, "Special", false, true, 900),
            new KhanaGharMenu("Sekuwa", 200, "Snack", false, true, 550)
        };

        // ================== Display Full Menu ==================
        System.out.println("\n========== KHANA GHAR MENU ==========");
        System.out.printf("%-25s %-8s %-15s %-12s %-10s %-8s%n",
                "Item Name", "Price", "Category", "Type", "Status", "Calories");
        System.out.println("---------------------------------------------------------------------");

        for (KhanaGharMenu item : menu) {
            item.displayItem();
        }

        // ================== Vegetarian Items ==================
        System.out.println("\n--- Vegetarian Items Only ---");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian()) {
                item.displayItem();
            }
        }

        // ================== Non-Vegetarian Items ==================
        System.out.println("\n--- Non-Vegetarian Items Only ---");
        for (KhanaGharMenu item : menu) {
            if (item.isNonVegetarian()) {
                item.displayItem();
            }
        }

        // ================== Non-Veg > Rs.100 & Available ==================
        System.out.println("\n--- Non-Veg Items (Price > Rs.100 & Available) ---");
        for (KhanaGharMenu item : menu) {
            if (item.isNonVegetarian() && item.getPrice() > 100 && item.isAvailable()) {
                item.displayItem();
            }
        }

        // ================== Veg < Rs.50 & Available ==================
        System.out.println("\n--- Veg Items (Price < Rs.50 & Available) ---");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian() && item.getPrice() < 50 && item.isAvailable()) {
                item.displayItem();
            }
        }
    }
}
