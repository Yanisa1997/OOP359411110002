package LAP7;

public class MobileStore {

    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.setID(1001);
        mobile1.setBrand("Wiko");
        mobile1.setGenera("Sunny 4 Plus");
        mobile1.setPrice(2090);
        mobile1.setSystem("Android 9 Go");

        System.out.println(mobile1.getID());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getGenera());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getSystem());

        Mobile mobile2 = new Mobile
        (2002, "Apple", "IPhone 11 Pro", 35900, "IOS13");
        System.out.println(mobile2.getID());
        System.out.println(mobile2.getBrand());
        System.out.println(mobile2.getGenera());
        System.out.println(mobile2.getPrice());
        System.out.println(mobile2.getSystem());

        Mobile mobile3 = new Mobile
                (3003, "Samsung", "Galaxy E7", 11500, "Android 4.4");
        System.out.println(mobile3.getID());
        System.out.println(mobile3.getBrand());
        System.out.println(mobile3.getGenera());
        System.out.println(mobile3.getPrice());
        System.out.println(mobile3.getSystem());

        System.out.println(mobile1.toString());
        System.out.println(mobile2.toString());
        System.out.println(mobile3.toString());


    } //main

} //class
