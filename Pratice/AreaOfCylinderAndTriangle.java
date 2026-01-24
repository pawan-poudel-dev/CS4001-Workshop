public class AreaOfCylinderAndTriangle {
    public static void main(String[] args) {
        // Area of Cylinder
        double radius = 5.0; // Example radius
        double height = 10.0; // Example height

        double cylinderArea = 2 * Math.PI * radius * (radius + height);
        System.out.printf("The surface area of the cylinder is: %.2f\n", cylinderArea);

        // Area of Triangle
        double base = 8.0; // Example base
        double triangleHeight = 6.0; // Example height

        double triangleArea = 0.5 * base * triangleHeight;
        System.out.printf("The area of the triangle is: %.2f\n", triangleArea);
    }
    
}
