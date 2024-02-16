import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in English: ");
        int eng = scanner.nextInt();

        System.out.print("Enter the marks in Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter the marks in Maths: ");
        int maths = scanner.nextInt();

        System.out.print("Enter the marks in Hindi: ");
        int hindi = scanner.nextInt();

        System.out.print("Enter the marks in History: ");
        int history = scanner.nextInt();

        int totalMarks = eng + science + maths+history+hindi;
       // int numSubjects = 5; // Assuming there are Five subjects

        float averagePercentage = totalMarks / 500.0f*100;

        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 45) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

    }
}
