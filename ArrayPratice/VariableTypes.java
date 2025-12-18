class  VariableTypes{
    int a = 100;//i stance varible 
    static  int b = 50;//static vriable 
    public static void main(String [] args ){
        int c = 9009;//local variable 
        System.out.println(c);
        System.out.println(VariableTypes.b);
        VariableTypes ref =  new VariableTypes();
        System.out.println(ref.a);
    }

}