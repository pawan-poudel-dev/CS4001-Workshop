import java.util.Scanner;
class GradeClculation{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        for ( int i = 1 ;i <= 8;i++){
            System.out.println("Enter your grade" + i+ ":" );
            int grade = Sc.nextInt();
            if(grade >= 90){
                System.out.println("Congrulations you have  Scored A+");
                
            }else if(grade >=80 && grade < 90){
                System.out.println("well done!!! You have secured A grade in your exam. ");
            }else if(grade >70 && grade < 80){
                System.out.println("Good you have secured B+ in your exam");
            }else if (grade >= 40 && grade <= 60){
                System.out.println("You have passed your exam !!! Try hard to secure good marks.");
            }else if (grade >= 60 && grade <= 70){
                System.out.println("You have secured C+ in your exam !!! Stay productive.");
                
            }else{
                System.out.println( "work Hard you  are fail.");
                
            }
            System.out.println();
            
        }
        Sc.close();
    }
}