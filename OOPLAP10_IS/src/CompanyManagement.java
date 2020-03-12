import java.util.List;
import java.util.Scanner;

public class CompanyManagement {

    public static void main(String[] args) {
        // Create Instance
        EmployeeDAOImpl dao = EmployeeDAOImpl.getInstance ();

        displayAllEmployee(dao);

        // add new Employee
        // addNewEmployee(dao);
        // findEmployee by ID
        // findEmployee(dao);
        // Update Employee by ID
        //updateEmployeeByID(dao);
        // delete bu ID
        deleteEmployeeBYID(dao);

    } //main

    private static void deleteEmployeeBYID(EmployeeDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Employee ID that you want to delete: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        dao.deleteEmp(id);
    } //delete

    private static void updateEmployeeByID(EmployeeDAOImpl dao) {
        // Search Employee ID
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Employee ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        Employee emp = dao.findEmp(id);
        System.out.print(emp.toString());
        // get new data
        System.out.print("Enter new Salary for Employee ID: "+emp.getPmpID());
        Double ns = Double.parseDouble(sc.nextLine().trim());
        // edit data
        emp.setSalary(ns);
        // update data into database
        dao.updateEmp(emp);
    } //update

    private static void findEmployee(EmployeeDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Employee ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        Employee emp = dao.findEmp(id);
        System.out.print(emp.toString());
    } //findEmployee

    private static void addNewEmployee(EmployeeDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID. ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee Name. ");
        String Name = sc.nextLine();
        System.out.print("Enter Employee Position. ");
        String Position = sc.nextLine();
        System.out.print("Enter Employee Salary. ");
        double Salary = Double.parseDouble(sc.nextLine().trim());

        dao.addEmp(new Employee(id,Name,Position,Salary));
    } //addNewEmployee

    private static void displayAllEmployee(EmployeeDAOImpl dao) {
        List<Employee> emp = dao.getAllEmp();
        for (Employee e:emp) {
            System.out.println(e.toString());
        } // for

    } //display
} //class
