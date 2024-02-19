package com.project1;

import java.util.Scanner;

public class Testing {
	private static Operations op=new Operations();
	private static Scanner sc=new Scanner(System.in);
	
	
	public static void menuItems() {
		
		System.out.println("Options");
		System.out.println("--------------------------------------");
		System.out.println("Select 1 to add new Email");
		System.out.println("Select 2 to view Email details by id");
		System.out.println("Select 3 to update Email Password");
		System.out.println("Select 4 to update Email Capacity");
		System.out.println("Select 5 to Display Name by id");
		System.out.println("Select 6 to Display MailID by id");
		System.out.println("Select 7 to Display Mail Capacity by id");
		System.out.println("Select 8 to delete Email record");
		System.out.println("Select 9 to Display all Emails");
		System.out.println("Select 10 to view Email count");
		System.out.println("Select 11 to exit from app");
		System.out.println("--------------------------------------");
		
	}
	public static void main(String[] args) {
	{
		while(true) {
			menuItems();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter first name: ");
				String f_n=sc.next();
				System.out.println("Enter last name: ");
				String l_n=sc.next();
				System.out.println("Choose the Department name: ");
				System.out.println("a.Sales   b. Development    c. Accounting");
				String c=sc.next();
				String dept;
				switch(c) {
				case "a":
					dept="Sales";
					break;
				case "b":
					dept="Development";
					break;
				case "c":
					dept="Accounting";
					break;
				default:dept="";
				}
				System.out.println("Enter the Company Name: ");
				String cmp=sc.next();
				
				Email e=EmailGen.createEmail(f_n, l_n, dept, cmp);
				op.addEmail(e);
				System.out.println("Email added Successfully...........");
				break;
			case 2:
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				Email e1= op.searchEmail(id);
				if(e1 != null) {
				System.out.println("Id :"+e1.getId()+"\t"+"Name :"+e1.getFirstname()+" "+e1.getLastname()+"\t"+"MailID: "+e1.getEmail()+"\t"+"Mail Capacity: "+e1.getMailbox_capacity());
				break;
				}
				else {
					System.out.println("No employee with that Id");break;
				}
				
			case 3:
				System.out.println("Enter id: ");
				int id1=sc.nextInt();
				System.out.println("Enter new Password:");
				String s=sc.next();
				op.updatePassword(id1, s);
				System.out.println("Password updated Successfully.......");
				break;
			case 4:
				System.out.println("Enter id: ");
				int id2=sc.nextInt();
				System.out.println("Enter new Mail Capacity:");
				int c2=sc.nextInt();
				op.updateMailCapacity(id2, c2);
				break;
			case 5:
				System.out.println("Enter id: ");
				int id3=sc.nextInt();
				op.displayName(id3);
				break;
			case 6:
				System.out.println("Enter id: ");
				int id4=sc.nextInt();
				op.displayMail(id4);
				break;
			case 7:
				System.out.println("Enter id: ");
				int id5=sc.nextInt();
				op.displayMailCapacity(id5);
				break;
			case 8:
				System.out.println("Enter employee id");
				int id8 = sc.nextInt();
				op.removeEmail(id8);
				break;
			case 9:
				op.viewAllEmailDetials();
				break;
			case 10:
				System.out.println("Total Email count: "+op.getTotalEmail());
				break;
			case 11:
				 System.exit(0);
				 break;
			default:menuItems();
			}
			
			}
	}
	
}}
