package UEmployee;

public class Staff extends UEmployee
{
	private String jobTitle;
	
	public Staff(String fName, String lName, String job)
	{
		super(fName, lName );
		jobTitle = job;
	}
	
	public String getTitle(String jTitle)
	{
		if(jTitle.equalsIgnoreCase("T"))
		{
			jobTitle = "Teacher";
		}
		else if(jTitle.equalsIgnoreCase("P"));
		{
			jobTitle = "Principal";
		}
		if(jTitle.equalsIgnoreCase("A"))
		{
			jobTitle = "Assistant Principal";
		}
		else if(jTitle.equalsIgnoreCase("C"))
		{
			jobTitle = "Custodian";
		}
		
		return jobTitle;
	}
	
	public String toString()
	{
		return(super.toString() + "\nJob Title: " + jobTitle);
	}
}
