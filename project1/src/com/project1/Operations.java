package com.project1;
import java.util.ArrayList;
import java.util.Scanner;
public class Operations {
	
	private ArrayList<Email> empList = new ArrayList<Email>();
	
	
	Scanner sc1= new Scanner(System.in);
	
	//to add the email
	public void addEmail(Email e) {
		empList.add(e);
	}
	
	
	//to search for email
	public Email searchEmail(int id) {
		Email emp = null;
		for(Email e: empList) {
			if(e.getId()==id) {
				emp = e;
				break;
			}
		}
		return emp;
		
	}
	
	//Update password
		public void updatePassword(int id , String p) {
			Email foundemp = searchEmail(id);
			if(foundemp!=null) {
				foundemp.setPassword(p);
			}else {
				System.out.println("Email by the given id not found in the record");
			}
		}
//	update mail_capacity
	public void updateMailCapacity(int id , int mailcap) {
		Email foundemp = searchEmail(id);
		if(foundemp!=null) {
			foundemp.setMailbox_capacity(mailcap);
		}else {
			System.out.println("Email by the given id not found in the record");
		}
	}
	
	
	
	//to display name
	void displayName(int id)
	{
		Email foundemp = searchEmail(id);
		if(foundemp!=null) {
			System.out.println("Name is: "+foundemp.getFirstname()+" "+foundemp.getLastname());
		}
		else
		{
			System.out.println("Email by the given id not found in the record");
		}
	}
	
	//to display Email ID
	void displayMail(int id)
	{
		Email foundemp = searchEmail(id);
		if(foundemp!=null) {
			System.out.println("Mail Id is: "+foundemp.getEmail());
		}
		else
		{
			System.out.println("Email by the given id not found in the record");
		}
	}
	
	
	//to display mail capacity
	void displayMailCapacity(int id)
	{
		Email foundemp = searchEmail(id);
		if(foundemp!=null) {
			System.out.println("Mail Capacity is: "+foundemp.getMailbox_capacity());
		}
		else
		{
			System.out.println("Email by the given id not found in the record");
		}
	}
	
	//to remove email
	public void removeEmail(int id) {
		Email foundemp = searchEmail(id);
		if(foundemp!=null) {
			empList.remove(foundemp);
		}else {
			System.out.println("Email by the given id not found in the record");
		}
	}
	
	
	//to dispaly all email details
	void viewAllEmailDetials() {
		System.out.println("-----------------------------------");
		System.out.println("ID\tFirst_Name\tLast_Name\tDepartment\tMailId\tMailCapacity");
		System.out.println("-----------------------------------");
		for(Email e: empList) {
			System.out.println(e.getId()+"\t"+e.getFirstname()+"\t"+e.getLastname()+"\t"+e.getDepartment()+"\t"+e.getEmail()+"\t"+e.getMailbox_capacity());
		}
	}
	//total no of emails.
		public int getTotalEmail() {
			
			return empList.size();
		}
		
}
//	
//	public void EmailGeneration()
//	{
//		System.out.println("Enter first name: ");
//		f_n=sc1.next();
//		System.out.println("Enter last name: ");
//		l_n=sc1.next();
//		System.out.println("Choose the Department name: ");
//		System.out.println("1.Sales   2. Development    3. Accounting");
//		int x=sc1.nextInt();
//		switch(x) {
//		case 1:
//			dept="Sales";
//			break;
//		case 2 :
//			dept="Development";
//			break;
//		case 3:
//			dept="Accounting";
//			break;
//		default:dept="";
//			
//		}
//		System.out.println("Enter Company name: ");
//		cmp=sc1.next();
//		
//		EmailGen e1=new EmailGen(f_n,l_n,dept,cmp);
//		System.out.println("Email ID Generated.....@!!!!");
//		
//	}
//	void changePassword(EmailGen e,String passwd)
//	{
//		e.setPassword(passwd);
//		
//	}
//	void changeMailcapacity(EmailGen e,int mc)
//	{
//		e.setMailbox_capacity(mc);
//	}
//	void altEmail(EmailGen e)
//	{
//		e.email=e.firstname+e.lastname+"@mailID";
//	}
//	void dispName(EmailGen e)
//	{
//		System.out.println("Name is : "+e.getName());
//	}
//	void dispEmail(EmailGen e)
//	{
//		System.out.println("Email Id is : "+e.getEmail());
//	}
//	void dispMailCapacity(EmailGen e)
//	{
//		System.out.println("MailCapacity is : "+e.getMailbox_capacity());
//
//	}
//

