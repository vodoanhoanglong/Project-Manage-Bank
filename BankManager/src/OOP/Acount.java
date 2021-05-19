package OOP;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acount {

	private String acountNumber;
	private String cardNumber;
	private int balance;
	private Date dateSingup;
	List<Receiver> receiverList = new ArrayList<>(); //nap tien
	List<Transfer> transferList = new ArrayList<>(); //chuyen tien	
	List<Withdrawal> withdrawalList = new ArrayList<>(); //rut tien
	
	
	
	public Acount(String acountNumber, String cardNumber, int balance,
			Date dateSingup) {
		super();
		this.acountNumber = acountNumber;
		this.cardNumber = cardNumber;
		this.balance = balance;
		this.dateSingup = dateSingup;
	}

	public List<Receiver> getReceiverList() {
		return receiverList;
	}

	public void setReceiverList(List<Receiver> receiverList) {
		this.receiverList = receiverList;
	}

	public List<Transfer> getTransferList() {
		return transferList;
	}

	public void setTransferList(List<Transfer> transferList) {
		this.transferList = transferList;
	}

	public Acount(){}

	public String getAcountNumber() {
		return acountNumber;
	}



	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public int getBalance() {
		return this.balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public Date getDateSingup() {
		return dateSingup;
	}



	public void setDateSingup(Date dateSingup) {
		this.dateSingup = dateSingup;
	}
	
	
	public void Input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input account number :");
		acountNumber = scanner.nextLine();
		
		System.out.println("Input card number:");
		cardNumber = scanner.nextLine();
		
		balance = 0;
		
		//dateSingup = new Date();				
	}
	
	public void addReceiver()
	{
		Receiver receiver = new Receiver(); // loi 
		receiver.receiver();
		receiverList.add(receiver);
		balance += receiver.getAmount();		
	}
	// khi giaao dich Account.Transfer(txtAccount.getText()) 
	
	public void Transfer(int accountReceiver)
	{
		
		
		Transfer transfer = new Transfer(accountReceiver);
		transfer.transfer(balance);
		transferList.add(transfer);
		balance -= transfer.getAmount();		
	}
	
	public void Withdrawal(int balance)
	{
		Withdrawal withdrawal = new Withdrawal(balance);
		withdrawal.withdrawal();
		withdrawalList.add(withdrawal);
		this.balance -= withdrawal.getAmount();		
	}

	
	
	public void displayHistoryReceive()
	{
		System.out.println("History receive :");
		receiverList.forEach(receive -> receive.display());
	}
	
	public void displayHistoryTransfer()
	{
		System.out.println("History transfer :");
		transferList.forEach(transfer -> transfer.display());
	}
	
	public void displayHistoryWithdrawal()
	{
		System.out.println("History withdrawal :");
		withdrawalList.forEach(withdrawal -> withdrawal.display());
	}
	
	@Override
    public String toString()
    {
        return "* Account: "  +
                ", accountNumber: '" + acountNumber + '\'' +
                ", cardNumber: '" + cardNumber + '\'' +
                ", balance: '" + balance + '\'' +
                ", dateSignUp: " + dateSingup;
    }
	
	
	public void display()
    {
		
        System.out.println(toString());
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
