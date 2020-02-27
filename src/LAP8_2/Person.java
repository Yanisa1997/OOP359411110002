package LAP8_2;

public class Person {

    //Attributes
    private String name;
    private String bornYear;

    //Constructor
    public Person(String name, String bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }
    // introduce
    public void introduce(){
        System.out.println("My Name is "+this.name);
        System.out.println("I was born in "+this.bornYear);
    }


    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }
} //class
