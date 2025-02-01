package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

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
            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE
            );

            //create query
            String query="select *from students";
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.last();
            System.out.println("Fetching last row :");
            System.out.println("ID: "+resultSet.getInt("id"));
            System.out.println("Name: "+resultSet.getString("name"));

            resultSet.first();
            System.out.println("Fetching first row :");
            System.out.println("ID: "+resultSet.getInt("id"));
            System.out.println("Name: "+resultSet.getString("name"));

            resultSet.updateString("name","Laxmi");
            resultSet.updateRow();

            //insert
            resultSet.moveToInsertRow();
            resultSet.updateString("id","7");
            resultSet.updateString("name","Lusi");
            resultSet.updateString("course","CN");
            resultSet.insertRow();

            resultSet.last();
            System.out.println("Fetching last row :");
            System.out.println("ID: "+resultSet.getInt("id"));
            System.out.println("Name: "+resultSet.getString("name"));

            resultSet.moveToInsertRow();
            resultSet.updateString("id","6");
            resultSet.updateString("name","Sandipta");
            resultSet.updateString("course","OS");
            resultSet.insertRow();

            resultSet.first();
            System.out.println("Fetching last row :");
            System.out.println("ID: "+resultSet.getInt("id"));
            System.out.println("Name: "+resultSet.getString("name"));

            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
