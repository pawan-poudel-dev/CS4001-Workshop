// here we have set a examples of the constructor tyor in java i.e default constructor and parameterized constructor and we have no-args constructor and we have also created a class with the name of the constructor types and we have created a main method in that class and we have created an object of that class and we have called the values of the constructor in that class and we have printed the values of the constructor in that class.
public class ConstructorTypes {
    public ConstructorTypes(){
        System.out.println("This is a no-args constructor type.");
    }
    public  ConstructorTypes( int a, int b){//paramaterized constructor 
        System.out.println("The sum of the numbers is:" + (a+b));


    }
    
    public static void main(String[] args){
        ConstructorTypes addition = new ConstructorTypes();
        ConstructorTypes addition1 = new ConstructorTypes(23,56);
        ConstructorTypes addition2 = new ConstructorTypes(45,67);
        // default constructor example 
        ConstructorTypes addition3 = new ConstructorTypes();


    }
    
}
