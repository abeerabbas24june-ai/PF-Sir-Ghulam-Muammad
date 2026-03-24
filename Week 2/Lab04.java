import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        // add until user input's 0.

        Scanner sc = new Scanner(System.in);
        int sum, n;
        sum = 0;
        boolean a = true;
        while (a) {

            System.out.println("Input any Number you Want to Add: ");
            System.out.println("Input 0, if you want to terminate it");
            n = sc.nextInt();
            if (n != 0) {
                sum = sum + n;

            } else {
                break;
            }
        }
        System.out.println("The sum is: " + sum);
        sc.close();

    }
}