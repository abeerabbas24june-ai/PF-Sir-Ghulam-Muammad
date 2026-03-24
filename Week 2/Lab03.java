import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        // Palindrome.
        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean d = true;
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int c = s.length();
        for (a = 0, b = c - 1; a < b; a++, b--) {
            if (s.charAt(a) != s.charAt(b)) {
                System.out.println("Word is not Palindrome. ");
                d = false;
                break;
            }

        }
        if (d) {
            System.out.println("Word is Palindrome. ");
        }

        sc.close();
    }
}
