import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students (5 to 10): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (n < 5 || n > 10) {
            System.out.println("Invalid number! Program will exit.");
            return;
        }

        // Input student data
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade (A, B+, etc): ");
            String grade = sc.nextLine();

            students.add(name + "-" + grade);
        }

        // Empty list check
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        // Display list
        System.out.println("\nStudent Grade List:");
        for (String s : students) {
            System.out.println(s);
        }

        // Count A grades
        int countA = 0;
        for (String s : students) {
            if (s.endsWith("-A")) {
                countA++;
            }
        }

        System.out.println("\nNumber of A grades: " + countA);

        // Remove entry
        System.out.print("\nEnter full entry to remove (e.g. John-A): ");
        String removeItem = sc.nextLine();

        if (students.remove(removeItem)) {
            System.out.println("Entry removed successfully.");
        } else {
            System.out.println("Entry not found.");
        }

        // Final list
        System.out.println("\nUpdated Student List:");
        for (String s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
