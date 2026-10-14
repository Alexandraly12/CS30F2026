package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class Roster 
{

	public static void main(String[] args) 
	{
		File dataFile;
		FileWriter out;
		BufferedWriter writeFile;
		FileReader in;
		BufferedReader readFile;
		
		String fileName, fName, lName;
		Scanner input = new Scanner(System.in);
		int numStu;
		
		System.out.println("Enter File Name: ");
		fileName = input.next();
		
		System.out.println("Enter Amount of Students: ");
		numStu = input.nextInt();
		
		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for( int i = 0; i < numStu; i++ )
			{
				System.out.println("Enter Student's First Name: ");
				fName = input.next();
				
				System.out.println("Enter Student's Last Name: ");
				lName = input.next();		
				
				writeFile.write(fName + " ");
				writeFile.write(lName);
				writeFile.newLine();
				
			}
			
			writeFile.close();
			out.close();
			input.close();
			
		}
		catch (IOException e)
		{
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		try
		{
			dataFile = new File(fileName);
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while(( fName = readFile.readLine()) != null)
			{
				lName = readFile.readLine();
				System.out.println(fName + " " + lName);
			}
			
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
