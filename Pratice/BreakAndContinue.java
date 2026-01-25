public class BreakAndContinue {
    public static void main(String[] args) {

        int[] numbers = {12, 54, 667, 7, 98, 43, 8907, 3, 1, 0};
        int sum = 0;
        int i = 0;

        while (i < numbers.length) {

            if (numbers[i] == 7) {
                i++;        // increment BEFORE continue
                continue;   // skip 7
            }

            sum += numbers[i];
            i++;
        }

        System.out.println("The output of the example is: " + sum);
    }
}
