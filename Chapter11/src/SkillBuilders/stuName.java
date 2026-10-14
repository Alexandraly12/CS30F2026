package SkillBuilders;

public class stuName 
{
	private String firstName, lastName;
	
	public stuName(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	public String toString()
	{
		String stuString;
		
		stuString = firstName + lastName;
		return(stuString);
	}

}
