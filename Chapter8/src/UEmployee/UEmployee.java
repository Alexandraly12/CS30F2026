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
	
	public double pay(double hours)
	{
		double payEarned;
		
		//take into consideration overtime
		if(hours > 40)
		{
			payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5) * (hours - 40));
		}
		else
		{
			payEarned = hours * hourlyPayRate;
		}
		
		return payEarned;
	}
	
	public String toString(String payStyle)
	{	
		if(payStyle.toUpperCase() == "Hourly")
		{
			return("Associate: " + firstName + " " + lastName  +  " \nPay Rate: $" + hourlyPayRate);
		}
		else
		{
			return("Associate: " + firstName + " " + lastName  +  " \nPay: $" + salary);
		}
	}

}
