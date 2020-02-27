package LAP8;

public class Circel extends GraphicObject {

    final static double PI = 3.141;

    private double radius;
    //Constructor
    public Circel(double radius) {
        this.radius = radius;
    }
    // getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    void FindArea() {
        double Area = PI * radius * radius;
        System.out.println("The Area of Circel With radius "+this.radius+
                " radius = "+Area);
    }

} //class
