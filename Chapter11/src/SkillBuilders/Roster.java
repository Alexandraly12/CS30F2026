package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class Roster 
{

	public static void main(String[] args) 
	{
		File dataFile;
		FileOutputStream out;
		ObjectOutputStream writeStu;
		FileInputStream in;
		ObjectInputStream readStu;
		
		String fileName, fName, lName;
		Scanner input = new Scanner(System.in);
		int numStu;
		
		System.out.println("Enter File Name: ");
		fileName = input.next();
		
		System.out.println("Enter Amount of Students: ");
		numStu = input.nextInt();
		
		dataFile = new File(fileName);
		
		try
		{
			out = new FileOutputStream(dataFile);
			writeStu = new ObjectOutputStream(out);
			
			//Write Objects
			for( int i = 0; i < numStu; i ++) 
			{
				System.out.println("Enter Student's First Name: ");
				fName = input.next();
				
				System.out.println("Enter Student's Last Name: ");
				lName = input.next();		
				
				writeStu.writeObject(new stuName(fName, lName)); //Creating student object while writing to the file
				
			}
			
			writeStu.close();
			System.out.println("Names entered to file.");
			System.out.println("Student Roster: ");
			
			//Read Objects
			in = new FileInputStream(dataFile);
			readStu = new ObjectInputStream(in);
			
			for(int i = 0; i < numStu; i++)
			{
				stuName read = (stuName)readStu.readObject();
					
				System.out.println(read);
			}
				
			readStu.close();
			input.close();
			
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Problem with input/output.");
			System.err.println("IOException: " + e.getMessage());
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Class could not be used to cast object");
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		
		

	}

}
