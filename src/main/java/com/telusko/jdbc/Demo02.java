package com.telusko.jdbc;

import java.sql.*;

public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/alien";
        String username = "ankagarwal";
        String password = "QWE@789";

        /*
        int userId = 5;
        String name = "Amol";
        String query = "Insert into student values(" + userId + ", '" + name + "');";
        */

        String query = "Insert into student values(?, ?)";

        Class.forName("com.mysql.jdbc.Driver");
        //  Internally, calls below method.
        //  DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        Connection connection = DriverManager.getConnection(url, username, password);

        /*
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(query);
        */

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, 6);
        preparedStatement.setString(2, "Mamesh");
        int count = preparedStatement.executeUpdate();

        System.out.println(count + " record(s) inserted.");

        connection.close();
    }

}
