

public class SumNumbers {//take 5 integers in arrAR and print their sum 
    public static void main(String [] args){
        int [] numbers = {23,34,89,34,77};
        int sum = 0;

        for( int i = 0; i < numbers.length;i++){
            sum += i;

        }
System.out.println("The sum of the numbers is " + sum );
    }
    
}
