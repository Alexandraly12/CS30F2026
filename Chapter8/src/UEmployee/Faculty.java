package UEmployee;

public class Faculty extends UEmployee
{

	private static String department;
	
	public Faculty(String fName, String lName, String dpt)
	{
		super(fName,lName);
		department = dpt;
	}
	
	public String getDepartment(String dpt)
	{
		if(dpt.equalsIgnoreCase("M"))
		{
			department = "Math";
		}
		else if(dpt.equalsIgnoreCase("E"))
		{
			department = "English";
		}
		else if(dpt.equalsIgnoreCase("S"))
		{
			department = "Social";
		}
		else if(dpt.equalsIgnoreCase("Sc"))
		{
			department = "Science";
		}
		return department;
	}
	
	public String toString()
	{
		return(super.toString() + "\nDepartment: " + department);
	}
	
}
