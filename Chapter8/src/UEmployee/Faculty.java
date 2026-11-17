package UEmployee;

public class Faculty extends UEmployee
{

	private String department;
	private double hourlyPayRate;
	
	public Faculty(String fName, String lName, String dpt)
	{
		super(fName,lName);
		department = dpt;
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
	
	public String depart()
	{
		
	}
	
	public String toString()
	{
		return(super.toString() + ", Associate \nPay Rate: " + hourlyPayRate);
	}
}
