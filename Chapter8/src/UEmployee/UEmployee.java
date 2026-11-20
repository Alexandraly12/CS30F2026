package UEmployee;

public abstract class UEmployee 
{
	private String firstName, lastName;
	private double hourlyPayRate;
	private double salary;
	
	public UEmployee(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	public double Pay(double time, String type)
	{
		double pay = 0;
		
		if(type.equals("H"))
		{
			double payEarned;
			//take into consideration overtime
			if(time > 40)
			{
				payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5) * (time - 40));
			}
			else
			{
				payEarned = time * hourlyPayRate;
			}
			
			pay = payEarned;
		}
		else if(type.equals("S"))
		{
			double payEarned;
			
			payEarned = salary/52 * time;
			
			pay = payEarned;
		}
		
		return pay;
		
	}
	
	public String toString()
	{	
		return("Associate: " + firstName + " " + lastName  +  " \nPay: $" + hourlyPayRate);
	}

}
