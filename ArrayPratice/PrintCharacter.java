//print character in java 
import java.util.Scanner;
public class PrintCharacter {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character you want: ");
        ch = sc.next().charAt(3);//taking 0 means  we are  giving the indes because the work on index based method
        System.out.println(ch);
    }

    
}
