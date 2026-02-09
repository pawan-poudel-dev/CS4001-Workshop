public class LocalVariableExample {
    public void studentAge(){
    int age = 20; //age of a person
    age++;
    System.out.println("The age of pawan is: " + age);

    }
    public static void main(String [] args){
         LocalVariableExample  object = new  LocalVariableExample ();
         object.studentAge();
        // System.out.println("Printing the age of a student."+ age);// this runs shows error because local variable only executes inside methods or constructors after exist from method they are destroyed
    }
    
}
