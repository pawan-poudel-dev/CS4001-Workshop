public class ConstructorOverLoading1 {
    public  ConstructorOverLoading1(int a, int b){
        System.out.println("The sum of the numbers is: " + (a + b));
    }
    //similarly we have to increasing the leangth or the  data type of the parameters inside the constructor so that the java jvm do not confused 
    public ConstructorOverLoading1(int a, int b, int c){
        System.out.println("The sum  of the 3 digits is: "+ (a+b+c));

    }
    public  ConstructorOverLoading1(int a, double b,int c){
        System.out.println("The output of the following constructor is: "+(a+b+c));
           
    }
    public  ConstructorOverLoading1(String fName,String lName){
        System.out.println("The full name oif the person is: " +(fName + lName));
    }


        public static void main(String[] args){
             ConstructorOverLoading1 addition1 = new ConstructorOverLoading1(23,45);
              ConstructorOverLoading1 addition2 = new  ConstructorOverLoading1(23,45.66667,78);
               ConstructorOverLoading1 sddition = new ConstructorOverLoading1("pawan","poudel");

        }
    }
