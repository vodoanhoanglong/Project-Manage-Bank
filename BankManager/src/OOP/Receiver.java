package OOP;



import java.sql.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Receiver extends Translation {   // nguoi nhan
	
	
	
	
	public Receiver() {
		super( );
	}
	
    
	
	
	
	@Override
	public void receiver() 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input money receive");
		amount = Integer.parseInt(scanner.nextLine());
		System.out.println("Input inform note");
		note = scanner.nextLine();
		dateTranslation = new Date(amount); // xem lai
	}
	
	
	
	
	

	@Override
    public String toString()
    {
        return "* Receiver: " + "amount: " + amount + ", note: '" + note ;
    }
	
	
	public void display()
    {
        System.out.println(toString());
    }





























	
	
	
	
	
	
	
	
	
	
	
}
