import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    // set Connection
    public static String DriverName = "org.sqlite.JDBC";
    public static String url = "jdbc:sqlite:D:/OOP_YANISA/OOP_359411110002/OOPLAP10_IS/IS_Conmany.sqlite";
    public static Connection conn = null;

    // Constant Operators
    // SQL CRUD
    public static final String GET_ALL_EMP = "Select * from Employee";
    public static final String ADD_NEW_EMP = "Insert Into Employee(PmpID,Name,Position,Salary)values(?,?,?,?)";
    public static final String FIND_EMP_BY_ID = "Select * from Employee Where PmpID = ?";
    public static final String UPDATE_EMP = "update Employee set Name=? , Position=? ,Salary=? Where PmpID=?";
    public static final String DELETE_EMP = "delete from Employee Where PmpID = ?";
     //instance
    private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
    public static EmployeeDAOImpl getInstance(){
        return instance;
    }

    // Constructor
    private EmployeeDAOImpl() {
        //load Class JDBC
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    } //Constructor

    @Override
    public List<Employee> getAllEmp() {

        List<Employee> emp = new ArrayList<Employee>();
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);

           while (rs.next()) {
               int id = rs.getInt(1);
               String Name = rs.getString(2);
               String Position = rs.getString(3);
               double Salary = rs.getDouble(4);

               emp.add(new Employee(id,Name,Position,Salary));
            } //while
            // Closs connection
            rs.close();
            stmt.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();

        } //try

        return emp;

    } //getAllEmp

    @Override
    public void addEmp(Employee emp) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(ADD_NEW_EMP);
            // set parameter
            ps.setInt(1,emp.getPmpID());
            ps.setString(2,emp.getName());
            ps.setString(3,emp.getPosition());
            ps.setDouble(4,emp.getSalary());

            if (ps.execute() == false) {
                System.out.println("Already add new employee.");
            } else {
                System.out.println("Could not add new employee.");
                System.exit(1);
            }

            ps.close();
            conn.close();

        } //try

            catch (SQLException e) {
            e.printStackTrace();

        }

    } //addEmp

    @Override
    public Employee findEmp(int id) {

        Employee emp = null;
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(FIND_EMP_BY_ID);
            // set parameter
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int EpmID = rs.getInt(1);
                String Name = rs.getString(2);
                String Position = rs.getString(3);
                double Salary = rs.getDouble(4);

                emp = new Employee(EpmID, Name, Position, Salary);

            } //if
            else {
                System.out.print("Could not found Employee with ID: "+id);
            }

            rs.close();
            ps.close();
            conn.close();

        } //try
        catch (SQLException e) {
            e.printStackTrace();
        }

        return emp;

    } //find

    @Override
    public void updateEmp(Employee emp) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(UPDATE_EMP);
            // set parameter
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getPosition());
            ps.setDouble(3,emp.getSalary());
            ps.setInt(4,emp.getPmpID());

            int rs = ps.executeUpdate(); // return = 0,1
            if (rs !=0) {
                System.out.print("Employee with ID "+emp.getPmpID());
            } else {
                System.out.print("Could not Update Employee with ID"+emp.getPmpID());
            }

            ps.close();
            conn.close();

        } //tye

        catch (SQLException e) {
            e.printStackTrace();
        }

    } //update

    @Override
    public void deleteEmp(int id) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(DELETE_EMP);
            // set parameter
            ps.setInt(1,id);
            int rs = ps.executeUpdate();
            if (rs !=0) {
                System.out.print("Employee with ID"+id+"was id"+id);
            } else {
                System.out.print("could not delete Employee"+"with id"+id);
            }

            ps.close();
            conn.close();

        } //type
        catch (SQLException e) {
            e.printStackTrace();
        }


    } //delete


} //class
