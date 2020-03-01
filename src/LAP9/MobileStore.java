package LAP9;

import javafx.scene.input.KeyCode;

import java.sql.*;
import java.util.ArrayList;

import static javafx.scene.input.KeyCode.M;
import static javafx.scene.input.KeyCode.S;

public class MobileStore {

    public static void main(String[] args) {

    // Step  : load Driver
       try {
       Class.forName("org.sqlite.JDBC");
       } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
          System.out.println("Driver load successfully.");

    // Step  : Create Connect
        String SQConn = "JDBC:sqlite:RUTS.sqlite";
        try {
            Connection conn = null;
            conn = DriverManager.getConnection(SQConn);  //alt insert
            if (conn == null) {
                System.out.println("Could Connect to Database.");
            } else {
                System.out.println("Connected to Database.");
            }
            // Step : Create Statement
            Statement STMT = conn.createStatement();
            String sql = "select * from Mobile";
            ResultSet rs = STMT.executeQuery(sql);
            if (rs == null) {
                System.out.println("Could not found any data");
            } else {
                System.out.println("Case data from database.");
            ArrayList<Mobile> m = new ArrayList<Mobile>();
            while (rs.next()){
                Mobile M = new Mobile(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5));
                       m.add(M);

            }
                DisplayObject(m);
            }
            // Create all Connection
            rs.close();
            STMT.close();
            conn.close();

        } //TYPE
        catch (SQLException e) {
            e.printStackTrace();
        }


    } //MAIN

    private static void DisplayObject(ArrayList<Mobile>m){
        for (Mobile M:m) {
            System.out.println(M.toString());

        }
    }
}//CLASS







