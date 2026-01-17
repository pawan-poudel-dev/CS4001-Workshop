public class FibonacciSeries {
    public  static void main(String[] args){
        int a = 0;
        int b  = 1;
        int c; 
        for(int i = 1; i <= 10; i++){
            c = a + b;// summation of a and b integer 
            System.out.print( " " +c);
            a = b;
            b = c;


        }
    }
    
}
/*  Lets see how the fibonacci numbers works with loop 

when i = 1;           
 a = 0
 b = 1; 
 c = 1;
 a = b;//now a = 1 ;
 b= c;//b = 1;

 when i = 2;
 a = 1;
 b = 1;
  c =  a + b; // 2
  a = b;// now the value of a becomes 1
  b  = c;//2 and the value of b becomes 2

  when i = 3;
  a = 2;
  b = 3;
  c =  a+ b; 5
  a = b;// a = 3;
  b = c; b = 5;

   and the process continues to infinite times  until and unless we have  given the instructions or conditoion 





*/

