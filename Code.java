import java.util.Scanner;
public class Code{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your grade:");
    float grade = sc.nextFloat();
    var result = (grade >= 40)?"You have passed your exam":"You have failed  your exam.";
    System.out.println("The result is " + result);
    
    
}
}
