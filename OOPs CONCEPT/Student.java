public class Student {

    public Student(){
        System.out.println("This is a non-args constructor");

    }
    public Student( String name){
System.out.println("The name of the Student is:"+ name);
    }
    public static void main(String [] args){
        Student ram = new Student("Ram");
        Student someone = new Student();
    }

    
}
