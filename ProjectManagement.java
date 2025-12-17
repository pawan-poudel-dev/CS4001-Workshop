import java.util.Scanner;
class ProjectManagement{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  your day :");
        String day = input.nextLine();
        System.out.println("class routine for " + day + ":" );
        switch(day){
            case"Monday":
            System.out.println("CH&SA , programming , Logic and problem solving");
            break;
            case "Tuesday":
                System.out.println("logic , programming , InformationSystem, Open access lab");
                break;
                case "Wednesday":
              System.out.println(" lab , Tutorail programming , logic , Information System.");
              break;
              case "sunday":
              System.out.println("math , database , sports , puzzle");
              break;
              case"Thursday":
              System.out.println("Tutorial , presentation , workshop , lab");
              break;
              case "friday":
                System.out.println("Electronoics , project showcse , maths");
                break;
                
                case"saturday":
                System.out.println("Halfday: + self learning and self study ");
                break;
                default:
                    System.out.println("invalid day entered.please try again");

                    
        }
        input.close();
        


    }
}