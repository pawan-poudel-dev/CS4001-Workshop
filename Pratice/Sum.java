import  java.util.Scanner;
public class Sum {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your favouriate number you want :");
        int number1= sc.nextInt();
        System.out.println("Enter your Second number: ");
        int number2 = sc.nextInt();
        // now we are going to revise the concept of  all the parts that we have previously covered 
        int Sum = number1 + number2;
        int subtract = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 % number2;
        System.out.println(Sum);
        System.out.println();

        System.out.println(subtract);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);


        //  gradually we are moving to the relational or comparision  operators 
        if(number1 == number2){
            System.out.println("Both are equal.");
        }else if(number1 >= number2){
            System.out.println("Both are not equal.");

        }else if(number1  != number2){
            System.out.println(" Number1 is not equal to number2");
        }else{
            System.out.println("The given numbers are equal");
        }



    }
    
}
