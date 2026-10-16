package SkillBuilders;

import java.io.Serializable;

public class stuName implements Serializable
{
	private String firstName, lastName;
	
	//Constructor
	public stuName(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	public String toString()
	{
		String stuString;
		
		stuString = firstName + " " + lastName;
		return(stuString);
	}

}
