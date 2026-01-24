public class AreaOfCylinder {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double height = 10.0; // Example height

        double area = 2 * Math.PI * radius * (radius + height);
        System.out.printf("The surface area of the cylinder is: %.2f\n", area);
    }
}