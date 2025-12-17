import java.util.Scanner;
class CinemaTicket{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String  age;
        System.out.println("Enter your age group (Child/ Adult/ Senior) :  ");
          //taking age as a input  from the keyboard
          String ageGroup = input.nextLine();
          System.out.println("Select your movie language (Nepali/Hindi/English): ");
          String Language = input.nextLine();//taking movie language as input from user using the ternary operator 
          System.out.println("Is a person is Student ? (True/false):");// CHECK WEATHER A PERSON IS STUDENT OR NOT 
          boolean isStudent = input.nextBoolean();
          System.out.println("Is there is any festival ? (True/false):");// taking festival aas input 
          boolean isFestival = input.nextBoolean();
           int  basePrice = 0;
           if(ageGroup.equalsIgnoreCase("Child")){
               basePrice = 150;//selecting the baseprice for the child
               
           }else if(ageGroup.equalsIgnoreCase("Adult")){
               basePrice = 250; // assigining the base price for the adult
            
            
            }else if(ageGroup.equalsIgnoreCase("Senior")){
                basePrice = 300;// assigining thee base price for the senior 
                
            }else{
                System.out.println(" age group entered.");
                
            }
            int finalPrice = basePrice;
            if(Language.equalsIgnoreCase("Nepali")){
                //no kind of surcharge 
                
            }else if(Language.equalsIgnoreCase("Hindi")){
                finalPrice += 50;// adding extra 50 in base price  for hindi language  
            }else if(Language.equalsIgnoreCase("English")){
                finalPrice += 100;// adding extra 100 in english langyage movie 
                
                
            }else{
                System.out.println("You have selected wrong movie language. Please choose a correct movie type.");
                
            }
            double studentDiscount =  finalPrice - (finalPrice * 0.20);
            double festivalDiscount = (finalPrice * 0.15)- finalPrice;
            // the final output of the ticket is 
            System.out.println("The final price of your ticket with discount is: " + finalPrice);
            
            
            input.close();
          
          
          
        }}