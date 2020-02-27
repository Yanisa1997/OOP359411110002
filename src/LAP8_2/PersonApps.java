package LAP8_2;

public class PersonApps {

    public static void main(String[] args) {

        // create object
        //object person
        Person P1 = new Person("Yanisa","1997");
        Person P2 = new Police("Cher","1997","NST");
        Person P3 = new Sheriff("Khemdang","1997","Nai Muang");

        P1.introduce();
        P2.introduce();
        P3.introduce();

    }
}
