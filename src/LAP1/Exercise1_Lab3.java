package LAP1;

import java.util.Scanner;

public class Exercise1_Lab3 {

    public static void main(String[] args) {

        //รับค่าจำนวนจริง 2 จำนวน จากนั้นทำการทดสอบว่าจำนวนใดมีค่ามากกว่ากัน


       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number x : ");
        double x = sc.nextDouble();
       System.out.print("Enter a real number y : ");
       double y = sc.nextDouble();

       //test condition
        if(x>y)
            System.out.println(x+"more than"+y);
        else
            System.out.println(y+"more than"+x);






    }

}
