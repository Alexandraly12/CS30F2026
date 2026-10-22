package Mastery;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class WordGuess 
{

	public static void main(String[] args) 
	{
		final String FLAG = "!";
		Scanner input = new Scanner(System.in);

		//Create a File object with the name of your file is the parameter
		File dataFile = new File("../Chapter11/src/Mastery/secretWords.txt");
		
		//Declare a File reader object
		FileReader in;
		
		//Declare a BufferedReader object
		BufferedReader readFile;
		
		//Create a random number object
		Random ran = new Random();
		
		int numWords = 0, wordToGuess;
		String secretWord = "";
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;	
		

		/* select secret word */
		try 
		{
			//initialize the file reader object to name of the file object
			in = new FileReader(dataFile);
            //initialize the BufferedReader object to the name of the file reader as a parameter
			readFile = new BufferedReader(in);
			//Get the number of words in the file using readFile
			numWords = Integer.parseInt(readFile.readLine());
			
           //update the word to guess to the random object and number of words read plus one
			wordToGuess = ran.nextInt(numWords) + 1;
			
           //iterate through the word to guess slots
           for(int i = 1; i <= wordToGuess; i++)
           {
        	   //update the secret word from the lines read from the file
        	   secretWord = readFile.readLine();
           }
           
           //close your BufferedReader object
           readFile.close();
           //close your FileReader object
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

		/* begin the game */
		System.out.println("WordGuess game.\n");

       //iterate through the secret word, and update the word so far variable to represent using dashes 
       //the length of the secret word
       //output the word so far using dashes
		for(int i = 0; i < secretWord.length(); i++)
		{
			wordSoFar += "-";
		}
		System.out.println(wordSoFar);


		/* allow player to make guesses*/

		do 
		{
			//?? prompt for a letter
			System.out.println("Guess a Letter ( Enter ! to guess the entire word ): ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();

			/* increment number of guesses */
			numGuesses += 1;

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter
			 * guessed and then append guessed letter to that string. Next, extract rest of
			 * wordSoFar and append after the guessed letter
			 */
			
			if(secretWord.contains(letterGuess))
			{
				updatedWord = "";
				for ( int i = 0; i < secretWord.length(); i++)
				{
					if(secretWord.charAt(i) == letterGuess.charAt(0))
					{
						updatedWord += letterGuess;
					}
					else
					{
						updatedWord += wordSoFar.charAt(i);
					}
				}
				wordSoFar = updatedWord;
			}

			/* display guessed letter instead of dash */
			System.out.println(wordSoFar + "\n");

		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));

		/* finish game and display message and number of guesses */
		if(letterGuess.equals(FLAG))
		{
			System.out.println("What is your guess?: ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if(wordGuess.equals(secretWord) || wordSoFar.equals(secretWord) )
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Sorry, You Lose.");
		}
		
		System.out.println("The secret word is: " + secretWord);
		System.out.println("Number of guess: " + numGuesses);
		}
	
	}

