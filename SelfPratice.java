import java.util.Scanner;
public class SelfPratice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is "+  name);// Taking name as input from the user
         
        System.out.println("Enter your age:");//Taking  age as input from the user 
        float age = sc.nextFloat();
        System.out.println("You are  " + age);
        if (name == "pawan"){
            System.out.println("The name you have entered is correct.");//use of if satement 
            
            
            
            
        }else if(age >=  20){
            System.out.println("You are elligible to vote.");// use of elseif condition weather the age is adult or minor of the persion 
            
            
            
        }else if (age <= 18){
            System.out.println("You are not elligible to vote. Turn to 18 and then you are elligible to vote for the election .");
            
        }
        else {
            System.out.println("Your name is invalid!!! please try again");
        }
        
    } 
}
