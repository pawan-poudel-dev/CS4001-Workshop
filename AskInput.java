import java.util.Scanner;
public class AskInput{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number (0 to stop):");
        number = Sc.nextInt();
        while (number != 0){
            System.out.println("you have entered "+ number+ ".");
            number = Sc.nextInt();
            
        }
    System.out.println("Finished");
    Sc.close();
    }
    
}