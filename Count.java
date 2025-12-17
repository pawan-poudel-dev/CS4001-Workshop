import java.util.Scanner;
class Count
{
public static void main(String[]args){
    //checking weather the numner is negative or positive 
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter your number: ");//taking  integer as input from the user 
    
    for(int i = 1; i <=10;i++){
        System.out.println("Enter your number " + i + ":");
    int number = Sc.nextInt();
    
    if(number == 0){
        System.out.println(" The number you have entered is 0/null.");
    }else if(number > 0){
        System.out.println("The number you have entered is positive number");
                 
        
        
    }else{
        System.out.println("The number you have entered is negative");
        
    }
    Sc.close();
}
}}