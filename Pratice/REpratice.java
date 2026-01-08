//repraticee the questions 
import java.util.Scanner;
public class REpratice {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  total_Marks: ");
        int Marks = sc.nextInt();
        int rev = 0;
        int org_Num = Marks;
        while(Marks != 0){
        rev = rev * 10 + Marks % 10;
        Marks = Marks / 10;

        }
        if(org_Num == rev){
            System.out.println("This is a palindrome marks.");


        }else{
            System.out.println("This is not a palindrome marks");
        }
        sc.close();

    }


    
}
