//sum of natural numbers taken from the user 
import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Enter a natural number: ");// asking user to enter a natural number 
         number = sc.nextInt();
         for(int i = 1; i <= number; i++){   //use of for loop to print numbers up to user taken
          System.out.println( "Numbers are: " + i + "");
          sum += i;



    }
   System.out.println("The sum of the natural numbers is :" + sum); 
    
    }}
