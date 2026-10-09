package SkillBuilders;

import java.io.*;

public class statsPt1 {

	public static void main(String[] args) 
	{
		File dataFile = new File("C:\\Users\\49358507\\git\\CS30F2026\\Chapter11\\src\\SkillBuilders\\test1.dat");
		FileReader in;
		BufferedReader readFile;
		String text;
		int line = 0;
		double avgScore;
		double totScore = 0;
		int amtScores = 0;
		
		//Read the file
		try 
		{
			//Creates input file stream
			in = new FileReader(dataFile);
			//Reads text from stream
			readFile = new BufferedReader(in);
			
			//Display the file
			while((text = readFile.readLine()) != null)
			{
				System.out.println(text);
				amtScores += 1;
				totScore += Double.parseDouble(text);
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
