
import java.util.Scanner;

public class IT24100169Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = sc.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            sc.close();
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = sc.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            sc.close();
            return;
        }

        // Input percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = sc.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = sc.nextDouble();

        // Validate that percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            sc.close();
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("Final Exam Mark is : " + finalMark);

        
    }
}