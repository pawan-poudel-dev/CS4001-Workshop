public class InstanceVariableDecleration {
/*
 Instance variables are declared in a class, but outside a method, constructor or any 
block.
• Instance variables are created when an object is created with the use of the keyword 
'new' and destroyed when the object is destroyed.
• The instance variables are visible for all methods, constructors and block in the class
 */
    private int id;
    public String name;
    public InstanceVariableDecleration(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void studentDetails(){
       System.out.println("Name is:" + name);
       System.out.println("Your Id is: " + id);
    }
    public static void main (String [] args){
        InstanceVariableDecleration Details = new InstanceVariableDecleration("pawan",7);
        Details.studentDetails();

    }

}
