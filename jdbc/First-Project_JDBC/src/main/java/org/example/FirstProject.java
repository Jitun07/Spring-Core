package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstProject {

    public static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/village";
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
            String query="select *from population";
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String age=resultSet.getString("age");
                String address=resultSet.getString("address");
                String mobile_number=resultSet.getString("mobile_number");
                System.out.println("ID :"+id +" name: "+name +" age :" +age + " address : "+address+ " mobile_number :  "+mobile_number);
            }
            connection.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
