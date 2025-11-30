import java.util.Scanner;
class RickshawFare{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Distance you have travelled with Rickshaw: ");
        double distanceInKilometer = sc.nextDouble();
        System.out.println("The distance you have travelled with Rickshaw:" + distanceInKilometer + "Km");// Taking distance in km  as input from the user
        
        System.out.println("Time taken by the rickshaw to travel: ");
        int minutes = sc.nextInt();
        sc.nextLine();
        System.out.println("You have travelled" + minutes + "minutes in Rickshaw" );//taking  time in minutes input from the user
        
        System.out.println("If the customer is local or not?(yes/no ):");//using teranry operator 
        String localInput = sc.nextLine();
        
        
        System.out.println("Is this night time ? (Yes / No):");//using ternary operators
        String nightInput = sc.nextLine();
        
        
        //Assigining  Fare rules
        double baseFare = 50;//Fixed starting charge
        double perKm = 20;//price perkm
        double perMin = 2;//price per minutes
        
        
        
        //Discounts for local travellers more than 10km 
         
        
        double localDiscountRate = 0.10;//discount  that is  10 %
        
        double nightSurChargeRate = 0.20;// adding 20% extra who want o travvell in night travelling in night time 
        
        double fare = baseFare + (distanceInKilometer * perKm) + (minutes  * perMin);/* 
        Charging only by distance or only by time would be unfair to either the driver or the passenger.
        #Distance travelled = covers the road distance 
        #Base fare = minimum wage  for booking  the driver 
        #Time taken = covers  all the traffic or waiting which dosent makes drivers unfair 
        #short rides with long delays still pay fairly

#Long rides with fast travel still pay fairly

#Drivers earn a consistent amount
        */
        
        
        fare = (localInput.equals("yes") && distanceInKilometer >= 10)?fare - (fare * localDiscountRate): fare;
        
        fare = nightInput.equals("yes") ? fare + (fare * nightSurChargeRate): fare;
        System.out.println("Final fare : Rs" + (int)fare);
         sc.close();
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}