package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordGuess 
{

	public static void main(String[] args) 
	{
		final String FLAG = "!";
		String fileName;

		//Create a File object with the name of your file is the parameter
		File dataFile = new File(fileName);
		
		//Declare a File reader object
		FileReader in;
		
		//Declare a BufferedReader object
		BufferedReader readFile;
		
		//Create a random number object
		int ranNum = (int)(Math.random() * 10) + 1;
		
		int numWords, wordToGuess;
		String secretWord = "";
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;	
		
		

		/* select secret word */
		try {
				//initialize the file reader object to name of the file object
				in = new FileReader(dataFile);
               //initialize the BufferedReader object to the name of the file reader as a parameter
				readFile = new BufferedReader(in);
				//Get the number of words in the file using readFile
               
               //update the word to guess to the random object and number of words read plus one
              
				
               //itirate through the word to guess slots
                       //update the secret work from the lines read from the file
              
               //close your BufferedReader object
               //close your FileReader object
				
   	} catch (/* ?? */) 
       {
			/* ?? */
		} catch (/* ?? */) 
       {
			/* ?? */
   	}



		/* begin the game */
		System.out.println("WordGuess game.\n");

       //iterate through the secret word, and update the word so far variable to represent using dashes 
       //the length of the secret word
       //output the word so far using dashes
	



		/* allow player to make guesses*/

		do {
			//?? prompt for a letter


			/* increment number of guesses */
			//?

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter
			 * guessed and then append guessed letter to that string. Next, extract rest of
			 * wordSoFar and append after the guessed letter
			 */
			
            //???





			/* display guessed letter instead of dash */
			    //??


		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));



       
		/* finish game and display message and number of guesses */
		
       //??
	}
}
