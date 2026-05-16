package com.telusko.jdbc.demo03dao;

import java.sql.*;

class StudentDAO{

    Connection connection = null;

    public void connect(){
        String url = "jdbc:mysql://localhost:3306/alien";
        String username = "ankagarwal";
        String password = "QWE@789";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Student getStudent(int rollno){
        Student student = new Student();
        student.rollno = rollno;
        String query = "Select * from student where rollno = " + rollno;
        try {
            connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            student.name = resultSet.getString(2);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return student;
    }

    public void addStudent(Student s2) {
        String query = "Insert into student values(?, ?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, s2.rollno);
            preparedStatement.setString(2, s2.name);
            int count = preparedStatement.executeUpdate();
            System.out.println(count + " record(s) with rollno:" + s2.rollno + " inserted.");
        } catch (Exception exception){
            System.out.println(exception);
        }
    }

    public void removeStudent(int rollno) {
        String query = "Delete from student where rollno = ?";
        connect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, rollno);
            int count = preparedStatement.executeUpdate();
            System.out.println(count + " record(s) with rollno:" + rollno + " deleted.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}