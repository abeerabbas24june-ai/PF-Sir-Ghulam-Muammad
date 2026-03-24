import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        // Prepend aproch.
        Scanner sc = new Scanner(System.in);
        int i, lenght;
        String reverse = "";
        System.out.print("Enter a String you wnat to prepend: ");
        String A = sc.nextLine();
        lenght = A.length();
        for (i = lenght - 1; i >= 0; i--) {
            char c = A.charAt(i);
            reverse = reverse + c;
        }
        System.out.println(reverse);

        sc.close();
    }
}