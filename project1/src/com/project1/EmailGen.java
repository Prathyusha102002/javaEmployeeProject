package com.project1;

public class EmailGen {
	private static int random=1001;
	public static Email createEmail(String firstname, String lastname, String department, String company)
	{
		Email e=new Email(random++,firstname,lastname,department,company);
		return e;
	}
	
	
}
//	String firstname;
//	String lastname;
//	String department;
//	String company;
//	private int mailbox_capacity;
//	private String password;
//	String email;
//	
//	//constructors..................................................
//	
//	
//	public EmailGen() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public EmailGen(String firstname, String lastname, String department, String company) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.department = department;
//		this.company = company;
//		email=firstname+"."+lastname+"."+"@"+department+"."+company+".com";
//		
//	}
////	public EmailGen(String firstname, String lastname, String company) {
////		super();
////		this.firstname = firstname;
////		this.lastname = lastname;
////		this.company = company;
////		
////	}
//	
//	
//	//setters and getters....................................
//	
//	
//	public int getMailbox_capacity() {
//		return mailbox_capacity;
//	}
//	public void setMailbox_capacity(int mailbox_capacity) {
//		this.mailbox_capacity = mailbox_capacity;
//	}
//	public String getName() {
//		return firstname+lastname;
//	}
//	public String getEmail() {
//		return email;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	
//	
//	


