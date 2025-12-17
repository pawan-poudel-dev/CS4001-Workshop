//counting the  number of digits of 
// 45567------= 5
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.println("Enter  a number of digit : ");
         num = sc. nextInt();
         while(num >0){
            num /= 10;
            count++;

         }
         System.out.println("The count of digit is : " + count);


        
    }

    
}
