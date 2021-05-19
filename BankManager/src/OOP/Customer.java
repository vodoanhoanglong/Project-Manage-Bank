package OOP;

import java.sql.Date;

public class Customer {

	private String id;
	private String nameCustomer;
	private Date birthDay;
	private Boolean sex;
	private String phoneNumber;
	private String address;
	
	
	
	public Customer(String CMND, String nameCustomer, Date birthDay, Boolean sex, String phoneNumber, String address) {
		super();
		CMND = CMND;
		this.nameCustomer = nameCustomer;
		this.birthDay = birthDay;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}


	public String getNameCustomer() {
		return nameCustomer;
	}



	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}



	public Date getBirthDay() {
		return birthDay;
	}



	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Boolean getSex() {
		return sex;
	}



	public void setSex(Boolean sex) {
		this.sex = sex;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
