package OOP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract  class  Translation { //  giao dich    
	private String idTranslation;
	private String nameTranslation;
	protected int amount;
	protected Date dateTranslation;
	protected String note;
	
	
	public Translation() {}
	
	 
	public Translation(String idTranslation, String nameTranslation, int amount, Date dateTranslation, String note) {
		super();
		this.idTranslation = idTranslation;
		this.nameTranslation = nameTranslation;
		this.amount = amount;
		this.dateTranslation = dateTranslation;
		this.note = note;
	}
	
	public String getIdTranslation() {
		return idTranslation;
	}

	public void setIdTranslation(String idTranslation) {
		this.idTranslation = idTranslation;
	}
	
	public String getNameTranslation() {
		return nameTranslation;
	}

	public void setNameTranslation(String nameTranslation) {
		this.nameTranslation = nameTranslation;
	}

    
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Date getDateTranslation() {
		return dateTranslation;
	}

	public void setDateTranslation(Date dateTranslation) {
		this.dateTranslation = dateTranslation;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	public void receiver() {};  // nap tien
	public void withdrawal() {};  // rut tien
	public void transfer(double balance) {};  // chuyen tien

	
}
