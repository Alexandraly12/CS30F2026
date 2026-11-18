package UEmployee;

public class Faculty extends UEmployee
{

	private String department;

	
	public Faculty(String fName, String lName, String dpt)
	{
		super(fName,lName);
		department = dpt;
	}
	
	public String getDepartment(String dpt)
	{
		if(dpt.toUpperCase() == "M")
		{
			department = "Math";
		}
		else if(dpt.toUpperCase() == "E")
		{
			department = "English";
		}
		else if(dpt.toUpperCase() == "S")
		{
			department = "Social";
		}
		else if(dpt.toUpperCase() == "Sc")
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
