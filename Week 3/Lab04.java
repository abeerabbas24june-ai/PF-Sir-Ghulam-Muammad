import java.util.Scanner;

public class Lab04 {
    // Find Average Score of Studets results.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0, Average;

        System.out.print("How Many Subjects: ");
        int n = sc.nextInt();

        double Marks[] = new double[n];
        System.out.println("Enter The Secured Marks= ");
        for (int i = 0; i < n; i++) {
            Marks[i] = sc.nextDouble();
            sum = sum + Marks[i];
        }

        Average = sum / n;
        System.out.println("Average Score / Marks are = " + Average);

        sc.close();
    }

}
