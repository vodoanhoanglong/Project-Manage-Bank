package DAO;

import DAO.*;

import java.sql.*;
import java.util.Arrays;
import java.util.Random;


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
        String SQL = "use QLNH select * from TAIKHOAN where TenTK = ? and MatKhau = ?";
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

    public String random(int start, int end, int limit)
    {
        String accountNumber = "";
        Random r = new Random();
        long[] longs = r.longs(start, end).limit(limit).toArray();
        for (long x : longs)
        {
            accountNumber += String.valueOf(x);
        }
        return accountNumber;
    }

    public boolean CheckSignUp(String cmnd, String fullname, String phoneNumber, String birthDay, String address, String userName, String password)
    {
        String SQL = "use QLNH select * form Customers where CMND = ? and accountNumber = ? and fullName = ? and phoneNumber = ? and birthday = ? and address = ? and userName = ? and password = ?";
        String accountNumber = random(0,9,10);
        try
        {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cmnd);
            preparedStatement.setString(2, accountNumber);
            preparedStatement.setString(3, fullname);
            preparedStatement.setString(4, phoneNumber);
            preparedStatement.setString(5,birthDay);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, userName);
            preparedStatement.setString(8, password);
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

