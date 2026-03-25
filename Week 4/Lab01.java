import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        // Matrix addition function.
        Scanner sc = new Scanner(System.in);
        int[][] array1 = {
                { 9, 8, 7 },
                { 4, 5, 6 }
        };
        int[][] array2 = {
                { 3, 2, 1 },
                { 9, 5, 1 }
        };
        addMatix(array1, array2);
        sc.close();
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatix(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        printArray(result);
    }
}
