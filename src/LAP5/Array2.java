package LAP5;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X[] = new int[5]; // index 0-4
        // input data from user
        for (int i = 0; i < X.length; i++) {
            System.out.println("Enter an integer: ");
            X[i] = sc.nextInt();

        }

        // display data in array
        showDataArray(X);
    }

    private static void showDataArray(int[] x) {
        System.out.print("Data in array");
        for (int val : x) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
