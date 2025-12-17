/* Taking input from the user using modulo operator and find the even or odd.*/
import java.util.Scanner;
class EvenOdd{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The given number" + number + "is odd");
            
            
            
        }else{
            System.out.println("The given number is not divisible by 2 that means it's a odd number.");
        }
        input.close();
    }
}
