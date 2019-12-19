package LAP1;

import java.util.Scanner;

public class Loob2 {
    public static void main(String[] args) {
        //for
        //รับค่าจำนวนเต็ม จำนวน 5 ครั้ง แล้วหาผลรวมและค่าเฉลี่ยแสดงทางจอภาพ

        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter an interger : ");
            total += sc.nextInt(); //total + total + sc.nextInt();
        }
        //display output
        System.out.println("The total value is :"+total);
        System.out.println("The averga valus is :"+(total/5));
    }

}
