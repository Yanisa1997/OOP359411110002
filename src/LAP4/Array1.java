package LAP4;

public class Array1 {

    public static void main(String[] args) {

        // Array : คือ ตัวแปรประเภทหนึ่งที่สามารถเก็บข้อมูลชนิดเดียวกันได้และจำนวน
        // เช่น เก็บข้อมูลจำนวนเต็ม 10 จำนวนในตัวแปร 1 ตัว

        int x[] = new int[5];
            x[0] =10;
            x[2] = x[0]*2;
            x[3] = x[1]+100 *2;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        showArray(x);
        showArrayEach(x);
    } //main

    private static void showArrayEach(int[] x) {
        System.out.print("Each data in array");
        for (int val:x) {
            System.out.print(val+" ");
        }
        System.out.println();
    }

    private static void showArray(int[] x) {
        System.out.print("Data in Array: ");
        for (int i = 0; i < x.length ; i++) {
            System.out.print(x[i]+" ");
            System.out.println();
        }
    }

} //class
