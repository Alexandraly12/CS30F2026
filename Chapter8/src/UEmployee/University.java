package UEmployee;

import java.text.NumberFormat;
import java.util.Scanner;

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
		
		Faculty emp1 = new Faculty("Alexandra", "Ly", "Math");
		
		Staff emp2 = new Staff("Sahej", "Parhar", "Teacher");
		
		String action;
		double payArg;
		int empNum;
		UEmployee emp = emp1;
		
		do
		{
			System.out.println("\n(E)mployee \\ (P)ay \\ (Q)uit");
			System.out.println("Enter choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{	
				System.out.println("Enter Employee Number (1 or 2)");
				empNum = input.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
				}
				
				if(action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(action.equalsIgnoreCase("P"))
				{	
					System.out.println("Enter hours OR pay period: ");
					
					payArg = input.nextDouble();
					
					payEmployee(emp, payArg);
				}
			}
			
		}while(!action.equalsIgnoreCase("Q"));
		//System.out.println(employee.getDepartment(dep) + employee.getTitle(job) + emp);

	}

}
