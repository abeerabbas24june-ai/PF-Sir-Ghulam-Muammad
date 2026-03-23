
public class Lab01 {
    // Loop over an array
    public static void main(String[] args) {

        int array[] = { 48, 79, 81, 34, 55, 27 };
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum += array[a];
        }
        System.out.println(sum);

    }

}
