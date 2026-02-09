/*

 Create a Student class with:
• Attributes: name, studentId, age, course
• Create 3 Student objects with different data
• Display information of all students
*/
public class Student111{
  public String name;
    private int studentId;
    public   int age;
    public String course;
    Student111(){
        this.name = "pawan";
        this.studentId = 23;
        this.age = 20;
        this.course = "Programming";
    }
    public void studentDetails(){
        System.out.println("Name of the student is: " +  name);
        System.out.println("The id of the student  is: " + studentId);
        System.out.println("Age of the student is :" + age);
        System.out.println("The course of the student where he  enrolled is :" +course);

    }
    public static void main(String [] args){
        Student111 student = new Student111();
        student.studentDetails();
        
    }



}