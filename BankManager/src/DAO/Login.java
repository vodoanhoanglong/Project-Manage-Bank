package DAO;

import DAO.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login
{
    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    // khởi tạo k cần funcName
    {
        try
        {
            connection = DriverManager.getConnection(Common.connectString);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    public boolean CheckLogin(String userName, String password)
    {
        String SQL = "use QLNH select * from AccountLogin where userName = ? and password = ?";
        try
        {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.next())
                return false;
        } catch (Exception exception)
        {
            System.err.println("Login.java.CheckLogin: " + exception.getMessage());
        }
        return true;
    }
}
