package EmailAdministrationApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private String emailId;
	private String password;
	private int passwordLength=6;
	private int mailCapacity=500;
	private String alternateMail;
	
	//Name given by user is used to generate email
	public Email(String firstName, String lastName, String company) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		
		//Call the method to Generate Password
		this.password=setPassword(passwordLength);
		
		//Call the method to know the department
		this.department=setDepartment();
		
		//Generate the Email Id
		emailId=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.replaceAll("\\s+","").toLowerCase()+"."+company.replaceAll("\\s+","").toLowerCase()+".com";
		
		//To Display name,department,emailId,password and mail capacity
		System.out.println("NAME: "+firstName+" "+lastName);
		System.out.println("DEPARTMENT: "+department);
		System.out.println("EMAIL: "+emailId);
		System.out.println("PASSWORD: "+password);
		System.out.println("MAIL CAPACITY: "+mailCapacity);
		
	}
	public String setPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int random= (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(random);
		}
		return new String(password);
	}
	public String setDepartment() {
		System.out.println("Department Code is \n1.Software Development \n2.IT Support/Help Desk \n3.Network Administration \n4.Cybersecurity \n5.Quality Assurance (QA) \n6.Project Management");
		System.out.println("Enter your Department Code: ");
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		switch (choice) {
		  case 1:
		    return "Software Development";
		  case 2:
			  return "IT Support";
		  case 3:
			  return "Network Administration";
		  case 4:
			  return "Cybersecurity";
		  case 5:
			  return "Quality Assurance";
		  case 6:
			  return "Project Management"; 
		}
		return "Others";
	}
	
	public int getMailCapacity() {
		return mailCapacity;
	}
	public String getAlternateMail() {
		return alternateMail;
	}
	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}
	public void setAlternateMail(String alternateMail) {
		this.alternateMail = alternateMail;
	}
	
	
}
