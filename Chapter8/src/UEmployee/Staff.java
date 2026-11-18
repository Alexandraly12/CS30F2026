package UEmployee;

public class Staff extends Faculty
{
	private String jobTitle;
	
	public Staff(String fName, String lName, String dpt, String job)
	{
		super(fName, lName, dpt);
		jobTitle = job;
	}
	
	public String getTitle(String jTitle)
	{
		if(jTitle.toUpperCase() == "T")
		{
			jobTitle = "Teacher";
		}
		else if(jTitle.toUpperCase() == "P")
		{
			jobTitle = "Principal";
		}
		else if(jTitle.toUpperCase() == "A")
		{
			jobTitle = "Assistant Principal";
		}
		else if(jTitle.toUpperCase() == "C")
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
