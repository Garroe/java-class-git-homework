import java.util.Scanner;

public class OneCharAtATime {
	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your message: ");
		char [] charArray = scanWords.nextLine().trim().toCharArray();
		System.out.println("Here are the characters in order: ");
		System.out.println();



		for (int i = 0; i <charArray.length; i++){
			System.out.println((i+0) + ":" + "'" + charArray[i] + "'");
		}
	}
}