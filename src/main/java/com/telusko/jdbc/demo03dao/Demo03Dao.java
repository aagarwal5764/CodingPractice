package com.telusko.jdbc.demo03dao;

import java.sql.*;

public class Demo03Dao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        StudentDAO studentDAO = new StudentDAO();
        Student s1 = studentDAO.getStudent(1);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.rollno = 15;
        s2.name = "Archana";
        studentDAO.addStudent(s2);

        studentDAO.removeStudent(15);
    }
}