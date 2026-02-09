
public class DeclaringClasses {
    public static void main(String [] args ){
        //int [] rollNumbers = new int[5];// stores 5 roll numbers 
        // String [] namesOfPersons = new String[5];// stores 5 names of the student 
        // double [] grades = new double[5];// stores the marks of the students that they get in their exxams 
         // data of 5 students contains the marks , names and rollnumber if the students 
         int [] rno = new int [5];
         String [] names = new String[5];
         float [] grades1 = new float[5];
         Student[] students = new Student[5];
        Student pawan = new Student();// jere student is a constructor 
        
       // pawan.rno = 1;
       // pawan.name = "pawan poudel";
        //pawan.grade1 = 88.5f;

        System.out.println(pawan.rno);
         System.out.println(pawan.name);
         System.out.println(pawan.grade1);

         


    }
    // creating another   non-static innner class
    // for every single student
    // make it static so it can be instantiated from static `main`
    static class Student{
         int rno;
         String name;
         float grade1;
Student(){
        this.rno = 1;
        this.name = "pawan poudel";
        this.grade1 = 88.5f;

}

}

    
}
