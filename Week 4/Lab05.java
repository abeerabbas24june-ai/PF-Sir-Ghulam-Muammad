import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        // Matix Operation.
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows you Want in Matrix: ");
        int rows = sc.nextInt();
        System.out.print("How many Columns you want in Matrix: ");
        int columns = sc.nextInt();
        int[][] Matrix1 = new int[rows][columns];
        int[][] Matrix2 = new int[rows][columns];
        System.out.println("Enter Matrix A Elemnets: ");
        calculator.input(Matrix1, sc);
        System.out.println("Enter Matrix B Elements: ");
        calculator.input(Matrix2, sc);
        System.out.println("Matrix A is : ");
        calculator.print(Matrix1);
        System.out.println("Matrix B is: ");
        calculator.print(Matrix2);
        System.out.println("Matrix C |A+B| is: ");
        calculator.sumMatrix(Matrix1, Matrix2);
        System.out.println("Matrix D |A-B| is: ");
        calculator.subMatrix(Matrix1, Matrix2);
        System.out.println("Transpose of Matrix A Is: ");
        calculator.transMatrix(Matrix1);
        System.out.println("Tranpose of Matrix B is: ");
        calculator.transMatrix(Matrix2);
        if (calculator.symMatrix(Matrix1)) {
            System.out.println("The Matrix A is Symetric :-) ");
        } else {
            System.out.println("The Matrix A is not Symetric :-( ");
        }
        if (calculator.symMatrix(Matrix2)) {
            System.out.println("The Matrix B is Symetirc :-)");
        } else {
            System.out.println("The Matrix B is Not Symetric :-( ");
        }
        System.out.println("The Sum of Matrix A Diagonal: ");
        calculator.diagonalsum(Matrix1);
        System.out.println("The Sum of Matrix B Diagonal: ");
        calculator.diagonalsum(Matrix2);
        sc.close();
    }

    static class calculator {
        static void input(int[][] Matrix, Scanner sc) {
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    Matrix[i][j] = sc.nextInt();
                }
            }
        }

        static void print(int[][] Matrix) {
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        static void sumMatrix(int[][] Matrix1, int[][] Matrix2) {
            int[][] addresult = new int[Matrix1.length][Matrix1[0].length];
            if (Matrix1.length == Matrix2.length && Matrix1[0].length == Matrix2[0].length) {
                for (int i = 0; i < addresult.length; i++) {
                    for (int j = 0; j < addresult[i].length; j++) {
                        addresult[i][j] = Matrix1[i][j] + Matrix2[i][j];
                    }
                }
                print(addresult);
            } else {
                System.out.println("Sum is not Possible because Given Matrix isn't Square Matrix. :-(");
            }
        }

        static void subMatrix(int[][] Matrix1, int[][] Matrix2) {
            int[][] subresult = new int[Matrix1.length][Matrix1[0].length];
            if (Matrix1.length == Matrix2.length && Matrix1[0].length == Matrix2[0].length) {
                for (int i = 0; i < subresult.length; i++) {
                    for (int j = 0; j < subresult[i].length; j++) {
                        subresult[i][j] = Matrix1[i][j] - Matrix2[i][j];
                    }
                }
                print(subresult);
            } else {
                System.out.println("Subtraction is not Possible Because Given Matrix isn't Square Matrix. :-(");
            }
        }

        static void transMatrix(int[][] Matrix) {
            int[][] transressult = new int[Matrix[0].length][Matrix.length];
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    transressult[j][i] = Matrix[i][j];
                }
            }
            print(transressult);
        }

        static boolean symMatrix(int[][] Matrix) {
            if (Matrix.length != Matrix[0].length) {
                return false;
            }
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix.length; j++) {
                    if (Matrix[i][j] != Matrix[j][i]) {
                        return false;
                    }
                }
            }
            return true;
        }

        static void diagonalsum(int[][] Matrix) {
            int sum = 0;
            if (Matrix.length == Matrix[0].length) {
                for (int i = 0; i < Matrix.length; i++) {
                    for (int j = 0; j < Matrix.length; j++) {
                        if (i == j) {
                            sum = sum + Matrix[i][j];
                        }
                    }
                }
                System.out.println(sum);
            } else {
                System.out.println("The Matrix is Not Square Matrix.");
            }
        }

    }
}