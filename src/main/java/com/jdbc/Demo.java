package com.jdbc;

//  Step-1
import java.sql.*;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //  Step-2
        Class.forName("com.mysql.jdbc.Driver");

        //  Step-3
        Connection connection = DriverManager.getConnection("", "", "");

        //  Step-4
        Statement statement = connection.createStatement();

        //  Step-5
        ResultSet rs = statement.executeQuery("");

        //  Step-6
        while(rs.next()){
            System.out.println(rs.getInt(0));
        }

        //  Step-7
        connection.close();
    }
}
