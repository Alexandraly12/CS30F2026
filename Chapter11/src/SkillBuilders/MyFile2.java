package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class MyFile2 
{

	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		
		//Create new file
		textFile = new File("C:\\Users\\49358507\\git\\CS30F2026\\Chapter11\\src\\SkillBuilders\\zzz.txt");
		
		try 
		{
			textFile.createNewFile();
			System.out.println("File: zzz.txt has been created.");
		}
		catch (IOException e)
		{
			System.out.println("File: zzz.txt could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		//Prompt user to keep or delete file
		System.out.println("Would you like to Keep or Delete the file?:");
		String choice = input.nextLine();
		
		//Delete file
		if(choice.equals("Delete"))
		{
			//textFile.delete();
			if(textFile.delete())
			{
				System.out.println("File successfully deleted.");
			}
			else
			{
				System.out.println("File failed to delete.");
			}
		}
		
		input.close();

	}
}


