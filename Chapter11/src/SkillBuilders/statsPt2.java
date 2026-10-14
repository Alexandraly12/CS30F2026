package SkillBuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class statsPt2 
{

	public static void main(String[] args) 
	{
		File dataFile;
		FileWriter out;
		BufferedWriter writeFile;
		FileReader in;
		BufferedReader readFile;
		Scanner input = new Scanner(System.in);
		
		String fileName;
		int numStu;
		
		String stuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		
		int numScores = 0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.println("Enter File Name: ");
		fileName = input.next();
		
		System.out.println("Enter Student Amount: ");
		numStu = input.nextInt();
		
		
		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for( int i = 0; i < numStu; i ++) // only use for loop if u know how many times it has to run, if not use while
			{
				System.out.println("Enter Student Name: ");
				stuName = input.next();
				System.out.println("Enter Grade: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
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
			//Creates input file stream (opens the door to text )
			in = new FileReader(dataFile);
			
			//Reads text from stream ( uses stream to manipulate text )
			readFile = new BufferedReader(in);
			
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
