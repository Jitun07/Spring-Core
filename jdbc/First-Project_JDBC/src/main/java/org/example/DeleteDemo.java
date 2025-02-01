package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {

    public static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/studentdb";
    public static String USERNAME="root";
    public static String PASSWORD="Lusi";
    public static void main(String[] args) {
        try{
            //class driver
            Class.forName(LOAD_DRIVER);

            //making connection
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            //create statement
            Statement statement = connection.createStatement();

            //create query
            String query="delete from students where id=9";

            int rowAffected = statement.executeUpdate(query);

            System.out.println("Row Affected :"+rowAffected);

            connection.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
