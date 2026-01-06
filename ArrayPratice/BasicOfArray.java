/*
Write a program to:

Take n elements from the user and store them in a 1D array

Print all elements

Find and print the sum and average of the elements




*/
import java.util.Scanner;
public class BasicOfArray {
    public  static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements of array: " );
        int numbers = sc.nextInt();//taking integers  from keywoard 
        int[]arrays =new int[numbers];

        int sum = 0;
for(int i = 0 ; i < numbers;i++){
    arrays[i] =sc.nextInt();
    

}


    }

    
}
