package SkillBuilders;

import java.io.*;
import java.util.Scanner;
public class MyFile {

	public static void main(String[] args) 
	{
		File textFile;
		String name;
		Scanner input = new Scanner(System.in);
		
		//Obtain file name from user
		System.out.println("Enter the name of the file: ");
		name = input.nextLine();
		
		//Create new file
		textFile = new File(name);
		
		//Determine if file exists
		if(textFile.exists())                                                              
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
		input.close();
	}

}
