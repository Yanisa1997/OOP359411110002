package LAP1;

import java.util.Scanner;

public class control3 {

    public static void main(String[] args) {
        //if-else-if : ทดสอบหลายเงื่อนไข ทำงานอย่างใดอย่างหยึ่งที่ผลการทดสอบเป็นจริง;
        //โครงสร้าง if-else-if

//        if(เงื่อนไข) {
//            คำสั่งเงื่อนไขที่ 1 เป็นจริง;
//        } else if(เงื่อนไขที่ 2){
//            คำสั่งเงื่อไขที่ 2 เป็นเท็จ;
//        } else if(เงื่อนไขที่ 3){
//            คำสั่งเงื่อนไขที่ 3 เป็นจริง
//        } else if(เงื่อนไขที่ n){
//            คำสั่งเงื่อนไขที่ n เป็นจริง
//        }else{
//            คำสั่งที่ทำงานเมื่อทุกเงื่อนไขเป็นเท็จทั้งหมด;
//        }

        //How old are you? >50 == old, >20 == teenager, <20 == young

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int age = sc.nextInt();
        //test condition
        if(age>50) {
            System.out.println("You Are old");
        }else if (age>20){
            System.out.println("You are teenager");
        }else {
            System.out.println("You are young");
        }

    }
}
