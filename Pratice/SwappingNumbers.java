// multiple ways of swapping a number 
public class SwappingNumbers {
    public static void main(String [] args){
        int  a = 10;
        int b = 30;
       /*  int t = a;
        a = b;
        b =  t;
        System.out.println("Variable after decleration: " + a  + " " + b);*/

// using - & + operators 
/*a = a + b;//10 + 30 = 40
b= a - b;// 40 - 30 = 10 . Here b uses the current value of a 
a = a -b;//40 -10 = 20.Here a uses both  new values generated above 
System.out.println("The swapping of numbers is : " + a + " " + b); */ 

// step 3: using the divide and a multiplication method 
a = a *b; // a *b = 300
b = a /b;// 300/30 = 10
a = a /b;// 300/10= 30
System.out.println("The swapping numbers are: " +  a + " " + b);
System.out.println("learning java , building  knowledge is intresting anda fun.");


    }

    
}
