package LAP8;

public class PersonApp {

    public static void main(String[] args) {
        // Create Objects
      Person P1 = new Person("1809900819269","Yanisa Khemdang",
              "10/03/1997");
      System.out.println(P1.toString());

      Student S1 = new Student("1809900819269","Yanisa Khemdang",
              "10/03/1997","359411110002","Information System");
      System.out.println(S1.toString());

      S1.running();
      S1.addSubject();
      // P1.addSubject(); // Objects ของ Super class ไม่สามาถใช้ Method ของ Sub class ได้



    } //main
} //class
