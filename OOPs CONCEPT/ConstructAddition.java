public class ConstructAddition{
    public ConstructAddition(){
        System.out.println("Hey!!something starting  at first is brutel.But its fine and ok.");
        



    }
    public ConstructAddition(int a, int b){
        System.out.println("The summation of the numbers is: " + (a+b));

    }
    public static void main(String[] args){
        ConstructAddition  Addition = new ConstructAddition();
        ConstructAddition addition1 = new ConstructAddition(20,20);
        ConstructAddition addition2 = new ConstructAddition(550,50);
    }
}