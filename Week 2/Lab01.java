import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        // append aproch.
        Scanner sc = new Scanner(System.in);
        int i, length;
        String reverse = "";
        System.out.print("Enter a string you want to append: ");
        String A = sc.nextLine();
        length = A.length();
        for (i = 0; i < length; i++) {
            char c = A.charAt(i);
            reverse = c + reverse;
        }
        System.out.println(reverse);

        sc.close();
    }
}