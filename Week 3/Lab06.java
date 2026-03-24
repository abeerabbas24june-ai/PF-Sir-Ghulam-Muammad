import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        // Count even and odd Print both.
        Scanner sc = new Scanner(System.in);
        int n, even, odd;
        System.out.print("How mant no. you want to Input: ");
        n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter any integer: ");
            value[i] = sc.nextInt();
        }
        even = 0;
        odd = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("there are " + even + "even number");
        System.out.println("there are " + odd + "odd number");

        sc.close();
    }
}