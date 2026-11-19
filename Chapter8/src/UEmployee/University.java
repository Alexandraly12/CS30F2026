package UEmployee;

import java.text.NumberFormat;
import java.util.Scanner;

import CresMart.Employee;

public class University 
{
	public static void payEmployee(UEmployee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double pay;
		
		System.out.println(emp); //Printing an Employee Object
		
		pay = emp.Pay(payArg, null);
		
		System.out.println(money.format(pay));
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter Employee First Name: ");
		//String fN = input.nextLine();
		
		//System.out.println("Enter Employee Last Name: ");
		//String lN = input.nextLine();
		
		Faculty emp1 = new Faculty("Alexandra", "Ly", "Math");
		
		Staff emp2 = new Staff("Sahej", "Parhar", "Teacher");
		
		//System.out.println("Enter Department {(M)ath, (E)nglish, (S)ocial, (Sc)ience}: ");
		//String dep = input.nextLine();
		
		//System.out.println("Enter Job Title {(T)eacher, (A)ssistant Principal, (P)rincipal, (C)ustodian}: ");
		//String job = input.nextLine();
		
		
		System.out.println("Hourly Pay? ( Y or N ): ");
		String type = input.nextLine();
		if(type.toUpperCase() == "Y")
		{
			System.out.println("Enter Hours Worked: ");
			String num = input.nextLine();
			double hours = Double.parseDouble(num);
			//System.out.println(employee.pay(hours));
		}
		
		//System.out.println(employee.getDepartment(dep) + employee.getTitle(job) + employee.toString());

	}

}
