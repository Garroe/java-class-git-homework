import java.util.Scanner;

public class vartCharList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Print tokens here: ");

		String userInput = sc.next();// User will input token
		int stringLength = userInput.length();// Declare the length of the token

		for(int i = 0; i < stringLength; i++) {
			char letter = userInput.charAt(i);
		}
		
	}
}