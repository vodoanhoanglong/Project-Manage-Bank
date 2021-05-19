package OOP;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transfer extends Translation {  // chuyen khoan

	private int transferAccount;
	

    
	public Transfer(int transferAccount) {
	super();
	this.transferAccount = transferAccount;
}
	
	public int getTransferAccount() {
		return transferAccount;
	}
	public void setTransferAccount(int transferAccount) {
		this.transferAccount = transferAccount;
	}	
	
	
	
	
	
	
	public void transfer(int balance) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Input transfer account: ");
        transferAccount = Integer.parseInt(scanner.nextLine());

        for(;;)
        {
        
            System.out.println("Input money: ");
            amount = Integer.parseInt(scanner.nextLine());
            if(amount  <=  balance) break;
            System.err.println("In      "
            		+ " "
            		+ " "
            		+ "  "
            		+ " "
            		+ " ufficient balance!");
        }
        System.out.println("Input note: ");
        note = scanner.nextLine();
	}

	
	
	
	
	@Override
    public String toString()
    {
        return "* Transfer: " +
                "transferAccount: '" + transferAccount + '\'' +
                ", note: '" + note + '\'' +
                ", money: " + amount ;
    }
	
	public void display() { System.out.println(toString()); }






	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
}
