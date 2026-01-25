//grade finder 
public class WhileLoop1 {
    public static void main(String [] args){
        int  grade = 1;
        int sum =0;
        while(grade <= 90){
             if(grade ==  30){
                sum += grade;
            
                break;
             }
             grade++;
        }
        System.out.println("Grade found: " + " "+ grade);
        System.out.println("Sum of all is : " + ""+ sum);

    }
    
}
