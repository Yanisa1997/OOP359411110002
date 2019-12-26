package LAP4;

import java.util.Scanner;

//เขียนโปรแกรมเพื่อรับจำนวนจริง 2 คำ
//จากนั้นแสดงผล บวก ลบ คูณ หาร โดยการใช้ Method

public class Method2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input 2 real number;
        System.out.print("Enter an number 1: ");
        double x = sc.nextInt();
        System.out.print("Enter an number 1: ");
        double y = sc.nextInt();

        double z = plus(x,y);
        System.out.println(x+"+"+y+"="+z); //บวก

        double a = minus(x,y);
        System.out.println(x+"-"+y+"="+a); //ลบ

        double b = times(x,y);
        System.out.println(x+"*"+y+"="+b); //คูณ

        double c = divided(x,y);
        System.out.println(x+"/"+y+"="+c); //หาร
    } //main

    private static double divided(double x, double y) {
        return x/y;
    }

    private static double times(double x, double y) {
        return x*y;
    }

    private static double minus(double x, double y) {
        return x-y;
    }

    private static double plus(double x, double y) {
        return x+y;
    } //plus


} //class
