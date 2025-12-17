
//sum  all the even numbers from the 1 to 50 

public class SumNumbers {
    public static void main(String[] args) {
        int i;//declearing the variable  as i 
        int sum = 0;
        for(i = 1; i <= 50;i++){// use for loop 
            if(i % 2 == 0){// calculate even number 

                sum += i;// using relational operator 
            }
            
        }
        System.out.println("The  sum is :" + sum);

        
    
}}