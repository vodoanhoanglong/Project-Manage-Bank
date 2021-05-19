package OOP;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public  class Withdrawal extends Translation {  // rut tien

	private int balance;

	
	
	public Withdrawal(int balance) {
		super( );
		this.balance = balance;
	}

	
	public void withdrawal() 
	{
		for(;;)
        {
        	Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so tien: ");
            amount = Integer.parseInt(scanner.nextLine());
            if(amount <= balance) break;
            System.err.println("Insufficient balance!!!");
        }
	}
	
	@Override
    public String toString()
    {
        return"amount Withdrawal: " + amount +
                ", note: '" + note ;
        
    }
	
	
	public void display()
    {
        System.out.println(toString());
    }

	





	

	
	
	
	
	
	
	
	
	
	
}
