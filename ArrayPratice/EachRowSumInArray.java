public class EachRowSumInArray {
    public static void main(String[] args) {
        int [][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {45, 67, 89}
        };

        // Go through each row
        for (int i = 0; i < numbers.length; i++) {
            int rowSum = 0; // reset sum for each row
            // Go through each column in the current row
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }
            System.out.println("Sum of row " + i + " is " + rowSum);
        }
    }
}
