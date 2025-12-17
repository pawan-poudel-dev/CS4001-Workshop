import java.util.Scanner;
class FindLargestNumber{
    public static void main(String [] args){
        Scanner input = new Scanner( System.in);
        System.out.println("Enter a digit1:  ") ;
        int digit1 = input.nextInt();
        System.out.println("enter 2nd digit:   ");
        int digit2 = input.nextInt();
        System.out.println("enter  a digit3:   ");
        int digit3 = input.nextInt();
        int largest;
        if(digit1 >digit2){
            if(digit1 > digit3){
                  largest = digit1;
                
            }else{
                  largest = digit3;
                }
            }else{
                if(digit2 > digit3){
                    largest = digit2;
                }else{
                    largest = digit3;
                }
                    
                }
                System.out.println("The largest  between 3 numbers are:" + largest);
                input.close();
            }
            
            
            
            
        
    }
