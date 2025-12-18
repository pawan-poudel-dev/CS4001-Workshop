//importing Scanner keyboard
import java.util.Scanner;
public class AddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        System. out.println("Enter a number: ");
        number = sc.nextInt();
        for(int i = 1; i <= number;i++){
            if(i % 2 == 0){
                System.out.println("The even numbers are: " + i+" ");
                sum += i;// here all the even numbers  are added 
            }
//sum += i;//here the  all natural  numbers of i  from 1 to 30
        }
        System.out.println("The sum of even numbers of the input is : " + sum);


    }
    
}
