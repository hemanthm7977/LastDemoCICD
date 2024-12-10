import java.util.Scanner;

public class Vowels_And_Consants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Variables to store vowels and consonants
		String vowels = "";
		String consonants = "";

		// Convert input to lowercase to make it case-insensitive
		input = input.toLowerCase();

		// Use a normal for loop to iterate through the string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i); // Get the character at the current index
			if (Character.isLetter(ch)) { // Check if the character is a letter
				if ("aeiou".indexOf(ch) != -1) {
					vowels += ch; // Add to vowels if it's a vowel
				} else {
					consonants += ch; // Add to consonants otherwise
				}
			}
		}

		// Output the results
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

		scanner.close();
	}
}
