/*
This method should return the square of that number.
Hints:- a. write a class.
b. write the main method
c. create the object of the class.
d. by using that object call the method (user defined) with one integer value as arguments.
e. store the returned result of the method in an integer variable.
f. print that value.
g. close the main method
h. define a new method which calculate the square.
i. return that square value
Lab Questions


*/


public class SquareNumber{



    // a. define a new method which calculate the square
    int calculateSquare(int number) {
        // i. return that square value
        return number * number;
    }

    // b. write the main method
    public static void main(String[] args) {

        // c. create the object of the class
        SquareNumber obj = new SquareNumber();

        // d. by using that object call the method with one integer value
        int result = obj.calculateSquare(5);

        // e. print that value
        System.out.println("Square of the number is: " + result);

        // f. close the main method
    }
}

    

