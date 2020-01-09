package LAP6;

public class ExString1 {

    public static void main(String[] args) {

       // String เป็นคลาสใน java library
       // จะมี method ที่ object ของ String สามารถเรียกใช้ได้

       String msg = "Yanisa Khemdang"; // msg เป็น object ของ class

        int len = msg.length();  // length() ใช้ในการนับความยาวของข้อความแล้วส่งค่ากลับมาเป็นจำนวนเต็ม
        System.out.println("Length of name:" +len);
        System.out.println(msg.toUpperCase()); // toUpperCase()แปลงทุกตัวอักษรเป็นตัวพิมพใหญ่

        // concatenation String (การต่อ String)

        // 1. +
        String FName = "Yanisa";
        String LName = "Khemdang";
        String FullName = FName + LName;
        System.out.println(FullName);

        // 2. method concat()
        String FullName2 = FName.concat(LName);
        System.out.println(FullName2);

        // Compare String
        String p ="Hello";
        String q = "hello";
        String X = p;

        if (p==q) System.out.println("Yes");
        else System.out.println("NO");

        System.out.println(p==q? "Yes" : "No");
        System.out.println(p==X? "Yes" : "No");

        System.out.println(p.equals(q)? "Yes" : "No");
        System.out.println(p.equals(X)? "Yes" : "No");

        System.out.println(p.compareTo(q)==0? "Yes" : "No");
        System.out.println(p.compareTo(X)==0? "Yes" : "No");


    } //main

} //class
