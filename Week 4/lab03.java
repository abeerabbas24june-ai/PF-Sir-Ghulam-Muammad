import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        // Overloading Method.
        Scanner sc = new Scanner(System.in);
        double a, s, d;
        calc calc = new calc();
        System.out.print("Input First No.: ");
        a = sc.nextDouble();
        System.out.print("Input Second No.: ");
        s = sc.nextDouble();
        System.out.print("Input Third No.: ");
        d = sc.nextDouble();
        System.out.println("Addition 1: " + calc.add(a, s));
        System.out.println("Addition 2: " + calc.adddouble(a, d));
        System.out.println("Max of 2: " + calc.max(a, s));
        System.out.println("Max of 3: " + calc.max(a, s, d));
        sc.close();
    }

}

class calc {
    double add(double a, double s) {
        return a + s;
    }

    double adddouble(double a, double d) {
        return a + d;
    }

    double max(double a, double s) {
        return (a < s) ? a : s;
    }

    double max(double a, double s, double d) {
        double max = a;
        if (s > max)
            max = s;
        if (d > max)
            max = d;
        return max;
    }
}