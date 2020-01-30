package LAP7;

public class Mobile {

    // Attributes
    private int ID;
    private String Brand;
    private String Genera;
    private double Price;
    private String System;

    //Constructor Method
    // 1.Default Constructor
    public Mobile(){}
    // 2.Design Constructor
    public Mobile(int ID, String Brand, String Genera, double Price, String System){
       this.ID = ID;
       this.Brand = Brand;
       this.Genera = Genera;
       this.Price = Price;
       this.System = System;
    }
    // getter
    public int getID(){
        return this.ID;
    }
    public String getBrand(){
        return this.Brand;
    }
    public String getGenera(){
        return this.Genera;
    }
    public double getPrice(){
        return this.Price;
    }
    public String getSystem(){
        return this.System;
    }
    // setter
    public void setID (int ID){
        this.ID = ID;
    }
    public void setBrand (String Brand){
        this.Brand = Brand;
    }
    public void setGenera (String Genera){
        this.Genera = Genera;
    }
    public void setPrice (double Pice){
        this.Price = Pice;
    }
    public void setSystem (String System){
        this.System = System;
    }

    @Override
    public String toString() {
        return " [ID: " +this.ID +
                " Brand: " +this.Brand +
                " Genera: " +this.Genera +
                " Price: " +this.Price +
                " System: " +this.System+ "]\n";
    }
}
