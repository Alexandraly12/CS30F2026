package Mastery;

import java.io.*;
import java.util.Scanner;

public class countVowels 
{

   public static void main(String[] args) 
   {
       File textFile;
       FileReader in;
       BufferedReader readFile;
       String fileName;
       String lineInFile, lowercaseText, letter;
       int vowelSum = 0;

       /* prompt the user for the name of the file */
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the name of the file: ");
       fileName = input.nextLine();

       /* count the vowels in the file */
       try {
                //new File object required
    	  		textFile = new File(fileName);
                //new File reader object required
    	  		in = new FileReader (textFile);
                //new BufferedReader object required
    	  		readFile = new BufferedReader(in);
                //read the lines from the file
    	  		while((lineInFile = readFile.readLine()) != null)
    			{
    			
                    //as lines are read convert them to lower case
    				lowercaseText = lineInFile.toLowerCase();
                    //iterate through the lower case text
    				for(int i = 0; i < lowercaseText.length(); i ++)
    				{
                        //using the String class 
                        //check if each character traverse through is a vowel
    					if(lowercaseText.contains(letter))
    					{
    						//update total vowels
    						vowelSum += 1;
    					}
    							
    				}
    			} // End While
    	  		
    	  		//user wants to know the number of vowels inside a file name
           		System.out.println("Number of vowels in file: " + vowelSum);
                //close BufferedReader object
           		readFile.close();
                //close FileReader object 
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

