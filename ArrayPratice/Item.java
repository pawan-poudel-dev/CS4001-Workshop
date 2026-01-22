class Item {
    String name;
    double price;
    boolean isVegetarian;

    Item(String name, double price, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    void display() {
        System.out.println(name + " | Rs." + price + " | Vegetarian: " + isVegetarian);
    }
}
