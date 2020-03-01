package LAP9;

import java.sql.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class TestJDBC {

    public static void main(String[] args) {
        // Step 1 : load Driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver load successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Step 2 : Create Connect
        String SQConn = "JDBC:sqlite:RUTS.sqlite";
        try {
            Connection conn = null;
            conn = DriverManager.getConnection(SQConn);
            if (conn == null) {
            System.out.println("Could Connect to Database.");
        } else {
            System.out.println("Connected to Database."); }
            // Step 3 : Create Statement
            Statement STMT = conn.createStatement();
            String sql = "select * from Student";
            ResultSet rs = STMT.executeQuery(sql);
            if (rs == null){
                System.out.println("Could not found any data");
            } else {
                System.out.println("Student data from database.");
                ArrayList<Student> std = new ArrayList<>();
                while (rs.next()){
//                    System.out.println(rs.getInt(1));
//                    System.out.println(rs.getString(2));
//                    System.out.println(rs.getString(3));
//                    System.out.println(rs.getDouble(4));
                    Student s = new Student(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4));
                            std.add(s);
                }

                DisplayObject(std);
            }
            // Create all Connection
            rs.close();
            STMT.close();
            conn.close();
        } //type

        catch (SQLException e) {
            e.printStackTrace();
        }

    } //main

    private static void DisplayObject(ArrayList<Student> std) {
        for (Student s:std) {
            System.out.println(s.toString());
        }
    }


} //class
