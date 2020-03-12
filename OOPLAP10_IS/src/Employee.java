public class Employee {

    private int PmpID;
    private String Name;
    private String Position;
    private Double Salary;

    public Employee(int pmpID, String name, String position, Double salary) {
        PmpID = pmpID;
        Name = name;
        Position = position;
        Salary = salary;
    }

    public int getPmpID() {
        return PmpID;
    }

    public void setPmpID(int pmpID) {
        PmpID = pmpID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "PmpID=" + PmpID +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                ", Salary=" + Salary +
                '}';
    }
} //class
