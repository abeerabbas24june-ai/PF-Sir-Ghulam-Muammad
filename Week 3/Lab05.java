
import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        // Find the largest number in the array.
        Scanner sc = new Scanner(System.in);
        int a, largest;
        System.out.print("How many Numbers you want to Input? = ");
        a = sc.nextInt();
        int[] value = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter Any Integer: ");
            value[i] = sc.nextInt();
        }
        largest = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] > largest) {
                largest = value[i];
            }
        }
        System.out.println("Lagerest No. is: " + largest);
        sc.close();

    }
}