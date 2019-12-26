package LAP4;

import java.util.Scanner;

public class OverloadMethod {

    public static void main(String[] args) {

        //Overloading Method : คือ Method ที่มีชื่อเดียวกันแต่มี parameter
        //และ return value ต่างกัน

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        System.out.println("Enter number 2:");
//        int y = sc.nextInt();

        System.out.println(plus(10,20));
        System.out.println(plus(10.0,20.0));
        System.out.println(plus(10.0,20));

    } //main

    public static int plus(int x,int y) {
        return x+y;
    }
    public static double plus(double x,double y){
        return x+y;
    }


} //class
