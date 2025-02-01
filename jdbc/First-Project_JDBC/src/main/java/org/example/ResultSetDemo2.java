package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo2 {

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
            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE
            );

            //create query
            String query="select *from population";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
//                System.in.read();
                Thread.sleep(5000);
                resultSet.refreshRow();
                System.out.println(resultSet.getInt(1)+ "   " +
                        "  " +resultSet.getString(2)+ "  "+resultSet.getInt(3)+
                        "  "+resultSet.getString(4)+ "  "+resultSet.getString(5));
            }


            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
