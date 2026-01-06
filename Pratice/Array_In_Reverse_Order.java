//print array in reverse  order 
import java.util.Scanner;//importing the scanner keyboard 
class Array_In_Reverse_Order{


public static void main(String [] args){
    
    int num1 [] = new int[6];//Assigning the value of the object 
    Scanner sc = new Scanner(System.in);//input keyboard
    System.out.println("Enter a numbers in array: ");
    for(int i =0 ; i< num1.length;i++){
num1[i] = sc.nextInt();//ask the user frequently to input the numbers

    }
    System.out.println("Array elements are: ");
    for(int i=0;i< num1.length;i++){
        System.out.println("Elements are :" + num1[i]);//here print all arrays 


    }
    
    //now its time to reverse  the array 
    for(int i = num1.length-1;i>= 0;i--){
        System.out.println("The reverse of the array is : " + num1[i]);//here we get the reverse of the numbers use of decrement 

    }

    

    sc.close();


}
}