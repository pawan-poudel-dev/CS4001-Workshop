public class Main {
  //create a method 
  public int addNumbers (int a ,int b ){
    int sum = a +  b;
    return sum;


  }  
  public static void main(String [] args){
    int num1 = 10;
    int num2 = 50;
    Main obj = new Main();

//calling method 
int result = obj.addNumbers(num1,num2);
 System.out.println("Sum is "+ result );
  }
    
}
