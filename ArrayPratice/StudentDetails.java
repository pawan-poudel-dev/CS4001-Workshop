public class StudentDetails {
    public void studentAge(){
        //local variable age 
        int age = 10;
        age = age + 5;
        System.out.println("your age is : " +  age );

    }
    public static void main(String args []){
        StudentDetails obj = new StudentDetails();
        obj.studentAge();
        
    }
    
}
