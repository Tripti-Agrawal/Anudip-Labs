import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int subjects = 5;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }
        double average = total / 5.0;
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        if (average >= 90)
            System.out.println("Grade: Ex");
        else if (average >= 80)
            System.out.println("Grade: A");
        else if (average >= 60)
            System.out.println("Grade: B");
        else if (average >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}

