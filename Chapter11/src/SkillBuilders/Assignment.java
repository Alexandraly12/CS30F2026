package SkillBuilders;

import java.io.*;
import java.io.IOException;

public class Assignment 
{

	public static void main(String[] args) 
	{
		File textFile;
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		//Create new file
		textFile = new File("C:\\Users\\49358507\\git\\CS30F2026\\Chapter11\\src\\SkillBuilders\\instructions.txt");
		
		//Read the file
		try 
		{
			//Creates input file stream
			in = new FileReader(textFile);
			//Reads text from stream
			readFile = new BufferedReader(in);
			
			//Display the file
			while((lineOfText = readFile.readLine()) != null)
			{
				System.out.print(lineOfText);
			}
			
			//Close the streams
			readFile.close();
			in.close();
		}
		catch(FileNotFoundException e) //Catches exceptions for FileReader
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) //Catches exceptions for BufferedReader
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}

}
