package com.leti.obshaga.preparing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview",
                    "root","12345678");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM people");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " this is Worker ID");
                System.out.println(rs.getString("firstName") + " " + rs.getString("lastName"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
