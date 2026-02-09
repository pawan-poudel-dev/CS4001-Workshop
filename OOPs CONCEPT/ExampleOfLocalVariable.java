public class ExampleOfLocalVariable {
    public void studentName(){
        String  fName= "Aakakh";
        String lName = "Aryal";
        String fullName = fName +lName;
        System.out.println("Your friend full name is :" + fullName);


    }
    public static void main(String [] args){
        ExampleOfLocalVariable names = new ExampleOfLocalVariable();
        names.studentName();
        
    }
    
}
