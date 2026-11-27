
import java.util.Scanner;

public class Hangman {

	// FUNKCIJA 1: Writes just what is missing  (ex. J _ V _) i preostale živote
	public static void printWord(char[] hiddenWord, int lives) {
		System.out.print("\nWord: ");
		for (int i = 0; i < hiddenWord.length; i++) {
			System.out.print(hiddenWord[i] + " ");
		}
		System.out.println("| Lives left: " + lives);
	}

	// FUNKCIJA 2: is the word guessed (nema više donjih crta '_')
	public static boolean isWordGuessed(char[] hiddenWord) {
		for (int i = 0; i < hiddenWord.length; i++) {
			if (hiddenWord[i] == '_') {
				return false; // still unhidden letters
			}
		}
		return true; // all of them were guesssed
	}

	//  Writing underscore 
	public static void initHiddenWord(char[] hiddenWord) {
		for (int i = 0; i < hiddenWord.length; i++) {
			hiddenWord[i] = '_';
		}
	}

	// : checks if a letter exists in a word and detects it
	public static boolean checkLetter(String secretWord, char[] hiddenWord, char guess) {
		boolean found = false;
		// goes through whole hidden word to  check
		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == guess) {
				hiddenWord[i] = guess; // Otkrivamo slovo
				found = true;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //it is like malloc makes new obj and reads from stdin
		// new Scanner auto changing types to String int..
		// Scanner is class new is malloc mem alocator
		// new Scanner (buffer of 1024 char - 2048 bytes in java 1 char 2 bytes)
		System.out.println("   - START GAME -   ");
		System.out.println("\nPlayer 1, enter the secret word: \n");

		// String secretWord = args[0].trim().toUpperCase();
		String secretWord = scanner.nextLine().trim().toUpperCase(); // nextLine waits for Enter (better then next becuase it takes whatever) .trim() it cleans empty spaces tabs
		for (int i = 0; i < 40; i++) {
			System.out.println();
		}
		if (secretWord.isEmpty()) {
			secretWord = "MADRID";
		}
		// Bira jednu nasumičnu reč iz niza i pretvara je u niz slova
		//nextInt is method and return 0-4 from class Random, but scanner.nextInt() is from class Scanner

		char[] hiddenWord = new char[secretWord.length()]; //strlen for exact number of bytes 
		//need to use new str bc I dont wanna overwrite first one
		// i couldnt use random again bc I would just get one more random number

		/*
		.length with and withouth () are different 
		.length ALWAYS for arrays  forex words  - 
		.length() is a method(an included function) from class String
		 */
		initHiddenWord(hiddenWord);

		int lives = 6;

		String usedLetters = ""; // Pamti sva već probana slova (za proveru ponovljenog poteza)

		// Main loop:
		while (lives > 0 && !isWordGuessed(hiddenWord)) {
			printWord(hiddenWord, lives);

			System.out.print("Enter a letter: ");
			String input = scanner.next().toUpperCase();

			// Validation: for 1 letter 
			if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {  // from JDK lib java.lang
				System.out.println("Invalid input! Please enter a single letter.");
				continue; // Returns us to start of the loop withouth losing the life
			}

			// Validation: is that letter added previously
			if (usedLetters.contains(input)) {
				System.out.println("You already tried that letter! Choose another one.");
				continue;
			}
			usedLetters = usedLetters + input; // adding new letter to udes letters

			char guess = input.charAt(0);
			boolean found = checkLetter(secretWord, hiddenWord, guess); // previously false;

			if (!found) {
				lives--;
				System.out.println("Wrong letter!");

				// Alarm! 
				switch (lives) {
					case 1:
						System.out.println("Careful! Last life left!");
						break;
					case 3:
						System.out.println("Halfway through your lives!");
						break;
					default:
						break;
				}
			}
		}

		// ENd: checking the true or false
		if (isWordGuessed(hiddenWord)) {
			System.out.println("\nYou win! The word was: " + secretWord);
		} else {
			System.out.println("\nGame over! The word was: " + secretWord);
		}

		scanner.close(); //kao free za malloc
	}

}
