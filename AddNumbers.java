//adding the numbers in java  using the     1D ARRAY
public class AddNumbers {
    public static void main(String [] args){
        int [] grades = { 89 , 90 , 45, 34, 67, 90 , 100};
        int sum = 0;
        for(int  marks : grades){
         sum  += marks;



        }
        System.out.println(sum);
    }
    
}
