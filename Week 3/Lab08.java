import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        // Reverse the contents of the array without creating a second array.
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How many No. you want to Add in: ");
        n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter any No: ");
            value[i] = sc.nextInt();
        }
        System.out.print("Before: ");
        for (int a = 0; a < n; a++) {
            System.out.print(value[a] + "\t");
        }
        System.out.print("\n After: ");
        for (int b = n - 1; b > 0; b--) {
            System.out.print(value[b] + "\t");
        }
        sc.close();
    }
}
