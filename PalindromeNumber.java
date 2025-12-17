//check weather a number is palindrome or not
// like 121, 222 checking right to left and left to right the letter , number must be same is a palindrome number 
import java.util.Scanner;
public class PalindromeNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 , s = 0, c,r;
        System.out.println("Enter a number :");
         num1 = sc.nextInt();
         c = num1;//c value is  equal to num1 as well 
        while(num1 >0){
            r = num1%10;
            s = (s * 10) + r;
            num1 = num1 /10;





        }
        if (c ==s ){
            System.out.println("This is a palindrome number.");

        }else{
            System.out.println("Not a palindrome number.");
        }

    }
    
}
