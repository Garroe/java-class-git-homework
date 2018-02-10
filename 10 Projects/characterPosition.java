
import java.util.Scanner;

/*public class characterPosition {
	public static void main(String[] args) {
		Scanner typeIn = new Scanner(System.in);

		String typeWord;
		char typeChar;

		// Step 1# Ask user to type in a word
		System.out.print("Type a word: ");
		typeWord = typeIn.nextLine();

		// Step 2# Ask user to type in a single character
		System.out.print("Type a character: ");
		typeChar = typeIn.next().charAt(0);

		System.out.println("Here are the position of that character: ");
		// Step 3# The position of characters
		if (typeWord.equals(typeChar)) {
			System.out.println(typeWord.length());
		}

		// Step 4# If Char not match, print this:

	}
}*/

//---------------------------------


public class characterPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print("Type a word: ");
		String word = sc.next();

		System.out.print("Type a char: ");
		char letter = sc.next().charAt(0);

		int letterIndex = char.get(letter);
		System.out.println(letterIndex);

		// System.out.print("Type a word: ");
		// String stInput = sc.next(); 
		// char stringInput = char.indexOf(stInput);

		// System.out.print("Type a character: ");
		// char charInput = sc.next().charAt(0);
		// char chInput = char.indexOf(charInput);

		// //System.out.println(stringInput.length());
		// System.out.println("Here are the positions of the character: ");
		// System.out.println(chInput.length());

	}
}
