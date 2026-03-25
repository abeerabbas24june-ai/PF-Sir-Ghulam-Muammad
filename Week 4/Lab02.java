import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        // print Table of Any integer with user input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any No. for Table: ");
        int n = sc.nextInt();
        multiple(n);
        sc.close();
    }

    static void multiple(int n) {
        int m = 1, res;
        while (m <= 10) {
            res = n * m;
            System.out.println("\t " + n + " * " + m + " = " + res);
            ++m;

        }
    }
}