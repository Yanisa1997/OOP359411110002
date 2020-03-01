package LAP9;

public class Mobile {

    //Attributes
    private int ID;
    private String Brand;
    private String Genere;
    private double Price;
    private String System;

    //Constructor
    public Mobile(int ID, String brand, String genere, double price, String system) {
        this.ID = ID;
        Brand = brand;
        Genere = genere;
        Price = price;
        System = system;
    }
    //getter and setter
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ID=" + ID +
                ", Brand='" + Brand + '\'' +
                ", Genere='" + Genere + '\'' +
                ", Price=" + Price +
                ", System='" + System + '\'' +
                '}';
    }
} //class
