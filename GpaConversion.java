import java.util.Scanner;
class GpaConversion{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your gpa between (0.0 - 4.0): ");// ask the user to enter their gpa
        // creating the scanner object to read  input from the keyboard
        if(Sc.hasNextDouble()){//// Check if the user’s input is a valid number (double)
            double gpa = Sc.nextDouble();// read the input from the user
            if(gpa < 0.0 || gpa >4.0){ 
                System.out.println("Error: The gpa must range between 0.0  and 4");
            }else{
                String grade = ConvertGpaToGrade(gpa); // Convert the GPA to a letter grade
                System.out.println("Congrulations!! your grade is " + grade);
            }  
            }else{ 
                System.out.println("Invalid input !! please enter a number: ");// Display the final grade to the user
                
                
            }
            
                Sc.close();
            
        }
        public static String ConvertGpaToGrade(double gpa){ // Method that converts GPA to letter grade
            if(gpa >3.7) return "A";
            else if(gpa> 3.0) return "B";
            else if(gpa > 2.0) return " c";
            else if(gpa >1.0) return "D";
            else return"F";
            
                
                
            }
        }
        
        
    
    
