import java.util.Scanner;
class NumberType{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* the program is designed to check the number weather it is even , odd , or negative*/
        System.out.println("Enter a number:");
        
        for(int i = 1; i <= 5; i++){
            
            System.out.println("Enter a number" + i +":");
            int num = sc.nextInt();
        
        
        if(num == 0){
            System.out.println("The number is zero.");
            
        }else if(num >0){
            System.out.println("The number you have entered is positive number.");
            
        }else{
            System.out.println("The number you have entered is negative.");
            
        }
        
            
            
            
        }
        
    }}
