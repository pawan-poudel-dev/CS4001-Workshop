import java.util.Scanner;
class Operators{
    public static void main (String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int  grade = Sc.nextInt();
        System.out.print("Enter your next grade:");
        int grade1 = Sc.nextInt();
        var sum = grade + grade1;
        var difference = grade - grade1;
        var remainder = grade % grade1;
        var multiplication = grade * grade1;
        var divide = grade / grade1;
        System.out.println("THE SUM OF TWO NUMBER IS" + sum);
        System.out.println("The difference of two number is" + difference);
        System.out.println("THE REMAINDER OF TWO NUMBER IS: " + remainder);
        System.out.println("The divide of two number is "+ divide);
        
        System.out.println("The multiplication of two number is :" +  multiplication);
        Sc.close();
        
        
        
    }
}