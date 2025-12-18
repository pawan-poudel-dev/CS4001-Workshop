/*
find the average of numbers in java 


*/
import java.util.Scanner;


public class Average_Of_Array {
    public static  void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        int [] num= new int [5];
        System.out.println("Enter  array numbers: ");
        for(i = 0; i< num.length;i++){
         num[i] = sc.nextInt();// taking the input numbers from the keyboard 

        }
        System.out.println("input taken arrays : ");
        for(i = 0; i <= num.length-1;i++){
            System.out.print(num[i] + " " );//showing the input array numbers taken by the user 

        }
        System.out.println("summation of the number is:  ");
        for(i = 0 ; i<= num.length-1;i++){
            sum += num[i];
            
        }

System.out.println("The summation of array numbers is " + sum);
//calculating the average of the numbers 
int average = sum / num.length;// mean / average of the array must be divided by the  counting  numberrs taken by the user 
System.out.println("average is: " + average );
sc.close();

    }
    
}
