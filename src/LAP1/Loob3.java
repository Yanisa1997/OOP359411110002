package LAP1;

import java.util.Scanner;

public class Loob3 {

    public static void main(String[] args) {
        //while : ใช้กรณีที่ไม่ทราบจำนวนครั้งหรือรอบที่แน่นอน ใช้โปรแกรมทำซ้ำไปเรื่อยๆจนกว่าจะเจอเงื่อนไขที่เป็นเท็จ

        Scanner sc  = new  Scanner(System.in);
        int x = 1;
        while (x !=0){
            System.out.print("Enter Integer.");
            x = sc.nextInt();
        }
        System.out.println("Good bye.");

    }
}
