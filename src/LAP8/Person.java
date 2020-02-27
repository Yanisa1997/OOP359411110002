package LAP8;

public class Person {


    //Attributes
    private String Pid;
    private String Name;
    private String DateOfBirth;
    //Constructor
    public Person(String pid, String name, String dateOfBirth) {
        Pid = pid;
        Name = name;
        DateOfBirth = dateOfBirth;
    }

    public void running(){
        System.out.println("I'm running");
    }

    // getter and setter
    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) { Pid = pid; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Person{" +
                "Pid='" + Pid + '\'' +
                ", Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                '}';
    }
} //class
