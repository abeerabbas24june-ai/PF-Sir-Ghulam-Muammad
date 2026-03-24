import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        // Search for the terget number.
        Scanner sc = new Scanner(System.in);
        int num, i;
        int[] value = { 12, 27, 34, 77, 51 };
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        for (i = 0; i < value.length; i++) {
            if (value[i] == num) {
                System.out.println("The Index of a Number is " + num + " is " + i);

            } else {
                System.out.println("Number not found ");
            }
            break;
        }
        sc.close();
    }
}
