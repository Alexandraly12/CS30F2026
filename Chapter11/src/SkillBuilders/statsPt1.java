package SkillBuilders;

import java.io.*;
import java.text.NumberFormat;

public class statsPt1 
{

	public static void main(String[] args) 
	{
		File dataFile = new File("../Chapter11/src/SkillBuilders/test1.dat");
		FileReader in;
		BufferedReader readFile;
		
		String stuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
		int numScores = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Read the file
		try 
		{
			//Creates input file stream (opens the door to text )
			in = new FileReader(dataFile);
			
			//Reads text from stream ( uses stream to manipulate text )
			readFile = new BufferedReader(in);
			
			//Display the file
			while((stuName = readFile.readLine()) != null) //Get name from first line , check that line is not empty
			{
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				
				totalScore = totalScore + scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
				
			}//ends while
			
			avgScore = totalScore / numScores;
			System.out.println("Low Score = " + percent.format(lowScore/100));
			System.out.println("High Score = " + percent.format(highScore/100));
			System.out.println("Average Score = " + percent.format(avgScore/100));
			
			
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
