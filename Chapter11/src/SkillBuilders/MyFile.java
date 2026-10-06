package SkillBuilders;

import java.io.*;
import java.util.Scanner;
public class MyFile {

	public static void main(String[] args) 
	{
		System.out.println("Enter the name of the file: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		File textfile = new File(name);
		
		if(textfile.exists())
		{
			System.out.println("File: " + name + " exists.");
		}
		else
		{
			System.out.println("File does not exist.");
			try 
			{
				textfile.createNewFile();
				System.out.println("New file created.");
			}
			catch (IOException e)
			{
				System.out.println("File could not be created.");
				System.err.println("IOExpection: " + e.getMessage());
			}
		}
		
		System.out.println("Would you like to keep or delete the file?:");
		String choice = input.nextLine();
		
		if(choice.equalsIgnoreCase("Delete"))
		{
			textfile.delete();
			System.out.println("File successfully deleted.");
		}
		
		input.close();
	}

}
