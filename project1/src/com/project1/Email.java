package com.project1;

public class Email {

	private int id;
	private String firstname;
	private String lastname;
	private String department;
	private String company;
	private int mailbox_capacity;
	private String password;
	private String email;
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(int id,String firstname, String lastname, String department, String company) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.company = company;
		this.email=firstname+"."+lastname+"."+"@"+department+"."+company+".com";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMailbox_capacity() {
		return mailbox_capacity;
	}
	public void setMailbox_capacity(int mailbox_capacity) {
		this.mailbox_capacity = mailbox_capacity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", department=" + department
				+ ", company=" + company + ", mailbox_capacity=" + mailbox_capacity + ", password=" + password
				+ ", email=" + email + "]";
	}
	
		
}
