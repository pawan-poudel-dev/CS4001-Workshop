public class ArrayEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 21, 7, 16, 9};

        int evenSum = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddCount++;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}

    

