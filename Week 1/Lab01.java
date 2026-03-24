import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        // Enter a number for table.
        Scanner sc = new Scanner(System.in);
        int num, a, b;
        System.out.println("\"Enter the number for which you want the table: ");
        num = sc.nextInt();
        a = 1;
        while (a <= 10) {
            b = num * a;
            System.out.println("\t" + num + " * " + a + " = " + b);
            ++a;

        }
        sc.close();
    }

}
