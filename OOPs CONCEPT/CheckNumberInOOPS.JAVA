public class CheckNumber {

    // Method to check positive, negative, or zero
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

    // Overloaded method to check even or odd
    public void checkNumber(int number, char type) {
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {

        // Create object of the class
        CheckNumber obj = new CheckNumber();

        int num = 10;

        // Call method to check positive / negative / zero
        obj.checkNumber(num);

        // Call overloaded method to check even / odd
        obj.checkNumber(num, 'E');
    }
}
