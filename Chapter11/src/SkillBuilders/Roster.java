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
			System.out.println("Enter Student's First Name: ");
			fName = input.next();
			
			System.out.println("Enter Student's Last Name: ");
			lName = input.next();		
			
			writeStu.writeObject(new stuName(fName, lName));
			writeStu.writeObject(new stuName(fName, lName));
			System.out.print("Names entered to file.");
			
			writeStu.close();
			
			//Read Objects
			in = new FileInputStream(dataFile);
			readStu = new ObjectInputStream(in);
			
			stuName stu1 = (stuName)readStu.readObject();
			stuName stu2 = (stuName)readStu.readObject();
			
			System.out.println(stu1);
			System.out.println(stu2);
			
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
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Class could not be used to cast object");
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		
		
		System.out.println("Student Roster: ");
		

	}

}
