/*

 Create a static array with 5 student names (examples: "Asha", "Ramesh",
"Sita", "Binod", "Sabita").
• Print each name using a for loop.
• Print the name at index 2 (third element) explicitly.
• Change the name at index 4 and print the updated value.
• After performing these operations, use Scanner to read a new name and
update the array.
• Print the updated array.
1 / 6

*/

import java.util.Scanner;
public class StudentArray1 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String [] names ={ "aasha","Ramesh","Sita","Binod","Sabita"};
    for(int i = 0; i < names.length;i++){
        System.out.println(names[i]);



    } 
    //name at index 2 
    System.out.print("The name at index 2 is : "+ names[2]);
    names[4] ="Pawan";
    System.out.print("\nThe updated name of the person is: " + names[4]);
    //use of scanner to replace the value at any  index 
    System.out.println("\nEnter a new name:  ");
    names[0] = sc.nextLine();
    //now time to update all the values accordinng to the question 
    for( int i = 0; i <names.length ; i++){
System.out.println("The updated names  in the array is : " + names[i]);


    }
    System.out.println("Java is fun.");

sc.close();

   } 

    
}
