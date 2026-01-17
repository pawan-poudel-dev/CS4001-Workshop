public class CheckPrimeNumber{
    public static void main(String[] args){
        int number = 4;
        boolean isPrime = true;
        if(number <= 1){
            isPrime= false;
        }else{
            for(int i = 2;i <number;i++){
                if(number % i== 0){
                    isPrime = false;
                    break;
                }
            }
        }if(isPrime){
            System.out.println( number + " " + "Is a prime number.");

        }else{
            System.out.println(number+ " " +"Numbber is not a prime number.");
        }

    }
}