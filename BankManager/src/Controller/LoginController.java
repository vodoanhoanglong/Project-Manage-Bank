package Controller;

import Model.Login;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class LoginController
{
    public static String fullname, gender, address, phone, dateSignUp, balance, accountNumber, born;
    public static Date birthday, dateRegister;
    public static double balanceService;

    public static void getUserData(String username)
    {
        ResultSet resultSet = Login.getUserData(username);
        try
        {
            resultSet.next();
            fullname = resultSet.getString(2);
            birthday = resultSet.getDate(3);
            born = new SimpleDateFormat("dd-MM-yyyy").format(LoginController.birthday);
            gender = resultSet.getString(4);
            if (gender.equalsIgnoreCase("1"))
                gender = "Nam";
            else if (gender.equalsIgnoreCase("0"))
                gender = "Nữ";
            address = resultSet.getString(5);
            phone = resultSet.getString(6);
            accountNumber = resultSet.getString(7);
            dateRegister = resultSet.getDate(10);
            dateSignUp = new SimpleDateFormat("dd-MM-yyyy").format(LoginController.dateRegister);
            balanceService = resultSet.getDouble(12);
            balance = String.format("%,.0f", balanceService);
        }catch (Exception exception)
        {
            System.err.println("LoginController.java.getUserData: " + exception.getMessage());
        }
    }

    public static boolean CheckLogin(String userName, String password)
    {
        ResultSet resultSet = Login.CheckLogin(userName, password);
        try
        {
            if(!resultSet.next())
                return false;
        }catch (Exception exception)
        {
            System.err.println("LoginController.java.CheckLogin: " + exception.getMessage());
        }
        return true;
    }

    public static String Random(int start, int end, int limit)
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

    public static boolean CheckSignUpSoTK(String accountNumber)
    {
        ResultSet resultSet = Login.CheckSignUpSoTK(accountNumber);
        try
        {
            if (!resultSet.next())
                return false;
        } catch (Exception exception)
        {
            System.err.println("LoginController.java.CheckSignUpSoTK: " + exception.getMessage());
        }
        return true;
    }

    public static boolean CheckSignUpTenTK(String username)
    {
        ResultSet resultSet = Login.CheckSignUpTenTK(username);
        try
        {
            if (!resultSet.next())
                return false;
        } catch (Exception exception)
        {
            System.err.println("LoginController.java.CheckSignUpTenTK: " + exception.getMessage());
        }
        return true;
    }
}
