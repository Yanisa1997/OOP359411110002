package LAP8;

public class Student extends Person {

    private String Sid;
    private String Program;

    // เรียกใช้ Constructor ของ super class
    public Student(String pid, String name, String dateOfBirth,
                   String sid, String program) {
        super(pid, name, dateOfBirth);
        Sid = sid;
        Program = program;
    }

    public void addSubject(){
        System.out.println("I'm adding Subject");
    }

    // getter and setter
    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Sid='" + Sid + '\'' +
                ", Program='" + Program + '\'' +
                "} " + super.toString();
    }
} //class
