package UEmployee;

public abstract class UEmployee 
{
	private String firstName, lastName;
	
	public UEmployee(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	public String toString()
	{
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);
}
