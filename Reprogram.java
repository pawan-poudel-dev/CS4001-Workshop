import java.util.Scanner;// calculating the largest of all 
class Reprogram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your num2: ");
        int num2 = input.nextInt();
        System.out.println("Enter a num num3: ");
        int num3 = input.nextInt();
        int largest;
        if(num1 >num2){
            if(num1 > num2){
                largest = num1;
                
            }else{
                largest = num3;
            } }else{
                if(num2 > num3){
                    largest = num2;
                    
                }else{
                    largest = num3;
                }
                
                
            }
            System.out.println("The largest of three numbers is: " + largest);
            input.close();
        }}