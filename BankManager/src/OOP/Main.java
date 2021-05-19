package OOP;



import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
		
	static Scanner scanner = new Scanner(System.in);
	static Acount account = null;

	public static void main(String[] args)
    {
	    login();
        int choose;
        do
        {
            Menu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose)
            {
                case 1:
                    account = new Acount();
                    account.Input();
                    break;
                case 2:
                    if(account!=null)
                    {
                        account.addReceiver();
                        account.display();
                    }else System.err.println("Account not exist!");
                    break;
                case 3:
                    if(account!=null)
                    {
                        account.Transfer(account.getBalance());;
                        account.display();
                    }else System.err.println("Account not exist!");
                    break;
                case 4:
                    if(account!=null)
                    {
                        account.Withdrawal(account.getBalance());;
                        account.display();
                    }else System.err.println("Account not exist!");
                    break;
                case 5:
                    if(account!=null) account.displayHistoryReceive();
                                 
                    else System.err.println("Account not exsit!");
                    break;
                case 6:
                    if(account!=null) account.displayHistoryTransfer();
                    else System.err.println("Tai khoan khong ton tai!!!");
                    break;
                case 7:
                    if(account!=null) account.displayHistoryWithdrawal();
                    else System.err.println("Account not exsit!");
                    break;
                case 0:
                    System.out.println("Goood Bye");
                    break;
                default:
                    System.err.println("Khong co lua chon nay!!!");
                    break;
            }
        }while(choose!=7);
    }
	
	
	static void login()
    {
        System.out.println("========== WELCOME ==========");
        System.out.println("User Name: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        System.out.println();
        String password = scanner.nextLine();
        if(username.equalsIgnoreCase("hoanglong") && password.equals("03032001"))
            System.out.println("Login Success");
        else
        {
            System.err.println("Login Failed");
            login();
        }
    }
	
	static void Menu()
    {
        System.out.println("1. Tao tai khoan");
        System.out.println("2. Nap tien");
        System.out.println("3. Gui tien");
        System.out.println("4. Rut tien");
        System.out.println("5. Lich su nap tien");
        System.out.println("6. Lich su gui tien");
        System.out.println("7. Lich su rut tien");
        System.out.println("0. Thoat");
        System.out.println("NHAP LUA CHON CUA BAN: ");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
