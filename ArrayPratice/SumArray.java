public class SumArray {
    public static void main(String[ ] args){
        int numbers[] = {12,13,15,16,17,18,19};
        int sum =0;
        int i;
      /*   for(i= 0; i <numbers.length;i++){
            sum += numbers[i];

        }
        System.out.println(sum);*/
        // enhanced for loop 
        for(int value:numbers){
            sum += value;
        }
System.out.println(" Sum is :" + sum);



    }
    
}
