import java.util.Scanner;
class StudentRemark{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Academics record:");
         var Academics = Sc.nextInt();
         System.out.println("enter your attitude score: ");
         var attitude = Sc.nextInt();
         System.out.println("Enter your attandence here: ");
         var attandence = Sc.nextInt();
         if(Academics >= 70){
             if(attitude <5){
                 if(attandence >=80){
                     System.out.println("CONGRULATIONS !!!!!You are elligible for Scholarship.");
                 }
             }
         }
         Sc.close();
    }
}