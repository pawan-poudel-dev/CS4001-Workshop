/*print ascii(American Standard Code for Information Interchange) value of character  */
import java.util.Scanner;
public class AsciiValueCharacter {
    public static void main(String [] args){
        char ch;
        System.out.println("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        int a = ch;//  implicit type casting the int a automatically  converts the value of character to be entered into its ascii vakue in memory 
        System.out.println(a);//if i enter a input character A then the ascii value is 65 givrn in return
    }
    
}
/*
*

Uppercase letters	65 – 90 (A – Z)  ascii value ranges fro capital characters 
Lowercase letters	97 – 122 (a – z)for lower 
Digits	48 – 57 (0 – 9)
Special characters	32 – 47, 58 – 64, 91 – 96, 123 – 126

32 is space

10 is newline (used in programming for Enter)





*/
