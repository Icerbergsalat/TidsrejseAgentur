package com.example.tidsrejseagentur;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {
    public static Connection connect() throws SQLException{
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //opretter en forbindelse mellem programmet og mysql databasen
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TidsrejseAgentur", "user", "26Uj96MSlPMV4o3aHqIypWcu");
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void addUser() throws SQLException{
        Connection connection = connect();
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(name, familie) values(?,?)");
        preparedStatement.setString(1,"admin");
        preparedStatement.setString(2,"23");
        preparedStatement.execute();
    }
}