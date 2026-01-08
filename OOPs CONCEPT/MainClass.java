public class MainClass {



    public static void main(String[] args) {

        // Create Student object
        Student student = new Student();

        // Set values using setters
        student.setName("pawan poudel ");
        student.setId(101);
        student.setAge(20);

        // Print values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Age: " + student.getAge());
    }
}




