package LAP9;

public class Student {

    //Attributes
    private int Sid;
    private String Name;
    private String Major;
    private double GPA;
    //Constructor
    public Student(int sid, String name, String major, double GPA) {
        Sid = sid;
        Name = name;
        Major = major;
        this.GPA = GPA;
    }
    // getter and setter
    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sid=" + Sid +
                ", Name='" + Name + '\'' +
                ", Major='" + Major + '\'' +
                ", GPA=" + GPA +
                '}';
    }
} //class
