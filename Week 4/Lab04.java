import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Any No.: ");
        int p = sc.nextInt();
        if (prime(p)) {
            System.out.println("Given No. is Prime. :-)");
        } else {
            System.out.println("Given No. is Not Prime. :-(");
        }
        sc.close();
    }

    static boolean prime(int p) {
        if (p <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

}