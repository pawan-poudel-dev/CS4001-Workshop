public class MissingNumbersInArray{
    public static void main(String[] args){
        int a []= {1,2,3,4,5,6,7,9,10};
        int i;
        int sum1=0;
        int sum2 = 0;
        for(i = 0;i<a.length;i++){
            sum1 += a[i];
            
        }
        System.out.println(  " The summation of the numbers in array elements  is: "+ sum1);
        for(i = 1;i<=10;i++){
            sum2 += i;

        }
        System.out.println("The sum of the range elements  is:" + sum2);
        System.out.println("The missing value number is:" +  "  " + (sum2 - sum1));
        
    }
}