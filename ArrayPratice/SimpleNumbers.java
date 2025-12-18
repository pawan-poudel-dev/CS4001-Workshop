import java.util.Scanner;

class SimpleNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Read scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Print all scores
        System.out.println("\nScores:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate average
        double average = (double) sum / n;

        // Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Output results
        System.out.println("\nTotal Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}
