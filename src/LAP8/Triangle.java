package LAP8;

public  class Triangle extends GraphicObject {

    final static double half = 0.5;

    private double hight;

    public Triangle(double hight, double base) {
        this.hight = hight;
        this.base = base;
    }
    private double base;

    // getter and setter

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    // FinDArea เป็น Method ของ super class และเป็น abstract method
    // ดังนั้น จึงต้องทำการ implement ใหม่ใน sub class
    @Override
    void FindArea() {
        double Area = half * hight * base;
        System.out.println("The Area of Triangle "+this.hight+" base = "+Area);
    }
}
