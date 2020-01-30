package LAP7;

public class DogApp {

    public static void main(String[] args) {

        // Creating Object
        // 1.ใช้ Default Constructor คือ สร้าง Object ว่าง ๆ ยังไม่มีข้อมูลอะไร
        Dog dog1 = new Dog();
        dog1.setName("Dang");
        dog1.setAge(3);
        dog1.setHairColor("Brown");

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getHairColor());

        dog1.sleeping();

        // 2.ใช้ Design Constructor คือ สร้าง Object พร้อมกับข้อมูลของ Object
        Dog dog2 = new Dog("Dum",5,"Black");

        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getHairColor());

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());



    } //main

} //class
