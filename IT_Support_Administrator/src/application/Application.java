package application;

import java.util.Scanner;

import employee.Employee;
import service.CredentialService;

public class Application {
	
	public static void main(String[] args) {
		
		String department="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following: \n "
				+ "1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
			
			case 1 :	department = "Tech";
						break;
			
			case 2 :	department = "Admin";
						break;
			
			case 3 :	department = "HR";
						break;
			
			case 4 : 	department = "Legal";
						break;
						
			default : 	System.out.println("Invalid Option");
			
		}
		
		if(option>=1 && option<=4)	{
			Employee emp1 = new Employee("Harshit", "Chowdary");	
			CredentialService cs = new CredentialService();	
			cs.generateEmailAddress(emp1, department);
			cs.generatePassword(emp1);
			cs.showCredentials(emp1);
			
		}
		sc.close();
		
	}

}
