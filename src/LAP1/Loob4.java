package LAP1;

import java.util.Scanner;

public class Loob4 {

    public static void main(String[] args) {
        //do while : ใช้ในกรณีที่ไม่ทราจำนวนครั้งหรือรอบที่แน่นอน เช่นเดียวกับ while
        //แต่จะต่างกันที่ do while จะมีการทำคำสั่งของ loob ก่อน 1 ครั้ง จากนั้นจึงทำการตรวจสอบเงื่อนไข

        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.print("Enter Integer.");
            x = sc.nextInt();
        }while (x !=0);
        System.out.println("Good bye.");
    }
}
