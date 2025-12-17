 
    import java.util.Scanner;
class SellingCalculator{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        // Write a program that:
 //• Takes marked price and category (A/B/C/D)
 //• Calculates discount and selling price based on category:
 //• A→60%
 //• B→40%
 //• C→20%
 //• D→10%
 //• Uses switch to apply discount and display final price
 System.out.println("Enter  marked price of the item:");
 int markedPrice = input.nextInt();// taking marked price as a input from the user 
 System.out.println("Enter  category (A/B/C/D)");
 char category = input.next().charAt(0);// using the char data type for the input
 double discount = 0;
 switch (category){// use of switch case to calculate the discount amount
     case 'A':
         discount = 0.60;
         break;
         case 'B':
             discount = 0.40;
             break;
             case 'C':
                 discount = 0.20;
                 break;
                 case 'D':
                     discount = 0.10;
                     break;
                     default:
                         System.out.println("Invalid category : please try again.");
                         return;
                         
                         
     
     
     
     
 }
 double  discountAmount = markedPrice * discount;// formua to calculate  discount amount 
 double sellingPrice = markedPrice - discount;// formula to calculate the sellling price
 
 
 System.out.println("\n ----------------------Receipt--------------");
 System.out.println("Marked price is " + markedPrice);
System.out.println(" The category of the item is:" + category);
System.out.println("The discount of the item is: " + (discount * 100));
System.out.println("The selling price of the item is:" + sellingPrice);

 
 
 
 
    }
}
    
}
