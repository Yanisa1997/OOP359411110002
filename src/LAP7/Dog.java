package LAP7;

public class Dog {

    // Attributes คือ คุณลักษณะของ Object (Attributes คำสั่ง private)
    private String name;
    private int age;
    private String hairColor;
    // Constructor Method ที่มีชื่อเดียวกับชื่อคลาส เมื่อมีการสร้าง Object จะมีการเรียกใช้ Constructor (Constructor คำสั่ง public)
        // 1.Default Constructor
    public Dog(){}
        // 2.Design Constructor
    public Dog(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }
    // Behaviors คือ พฤติกรรมของ Object ซึ่งจะมีนิยามด้วย Method ที่อยู่ในคลาส
    public void sleeping(){
        System.out.println("Dog Sleeping");
    }
    public void eating(){
        System.out.println("Dog Eating");
    }
    public void running(){
        System.out.println("Dog Running");
    }
    // getter and setter Method
    // getter ใช้อ่านข้อมูลของ Object
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    // setter ใช้ปรับปรุงข้อมูลของ Object
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setHairColor (String hairColor){
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return " [Name: " +this.name +
                " Age: " +this.age +
                " Color: " +this.hairColor + "]\n";
    }


} //class
