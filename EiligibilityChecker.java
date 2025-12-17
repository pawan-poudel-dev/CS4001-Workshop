
import java.util.Scanner;
class EiligibilityChecker{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your gpa: ");
        double gpa = Sc.nextDouble();
        System.out.println("Enter your attandance: ");
        double attandance = Sc.nextDouble();
        System.out.println("Your attitude  score is :");
        int attitude = Sc.nextInt();
        if(gpa >= 3.2){
            
           if(attitude <5)
           {
               if (attandance >80)
           {
            System.out.println("You are elligible to secure scholarship place");
           }
        }} 
        Sc.close();
    }}