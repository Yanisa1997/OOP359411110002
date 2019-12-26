package LAP4;

public class Method1 {

    public static void main(String[] args) {
        System.out.println("Hello form main Method");
        A(); //calling Method
        B("Cher"); //calling B Method
        String MyName = C("Yanisa","Khemdang");//calling C Method
        // 1.ประกาศตัวแปรชนิดเดียวกับคำที่ส่งมาจาก method เพื่อเก็บค่าข้อมูลนั้นไว้
        System.out.println(MyName);
        // 2.กรณีที่ไม่ต้องการเก็บค่าที่ส่งมาจาก method สามารถแสดงค่าข้อมูลนั้นด้วยคำสั่ง print() หรือ println()
        System.out.println(C("Yanisa","Khemdang"));
    } //main

    // Method type 1 : no parameter, no retern value
    public static void A(){
        System.out.println("Hello form A Method");
    } //type 1

    //Method type 2 : 1 or more parameters, no return value
    public static void B(String msg){ //msg เป็น local variable หรือตัวแปรเฉพาะที่
        System.out.println("Hello form A Method"+msg);
    } //type 2

    //Method type 3 : 1 or more parameters, return 1 value
    public static String C(String FName,String LName){
        System.out.println("Hello form C Method");
        String MyName = FName + " " + LName;
        return MyName;
    }

} //class
