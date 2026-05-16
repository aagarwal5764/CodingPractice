package com.telusko.jdbc;

import java.sql.*;

public class Demo01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/alien";
        String username = "ankagarwal";
        String password = "QWE@789";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("Select * from student;");

        while(rs.next()){
            System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }

        connection.close();
    }

}
