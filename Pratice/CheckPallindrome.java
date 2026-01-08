//cheecking  weather the  number is palindrome or not 
import java.util.Scanner;
public class CheckPallindrome {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want: ");
        int palindromeNumber = sc.nextInt();
        int rev = 0;
        int org_num = palindromeNumber;
        while(palindromeNumber != 0){
            rev =  rev *10 + palindromeNumber %10;
            palindromeNumber = palindromeNumber/10;


        

        }
        if(org_num == rev){
            System.out.println(  org_num+ " "+"The given number is palindrome number");

        }else{
            System.out.println(" Number is   not palindrome number.");
        }

    }

    
}
