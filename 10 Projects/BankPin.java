import java.util.Scanner;

public class BankPin {
	public static void main(String[] args) {
		// Create new scanner object
		Scanner scan = new Scanner(System.in);
		String pin = "0775";
		System.out.println("WELCOME TO THE BANK OF <GARROE WAH>");

		// Create input for user to enter
		System.out.print("ENTER YOUR PIN: ");
		// User input field
		String userPin = scan.nextLine();
		System.out.println("");


		// Creat loop
		while (!userPin.equals(pin)) {
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			userPin = scan.nextLine();
			System.out.println("");
		}
		if(!userPin.equals(pin)) {
			System.out.println("INCORRECT PIN. TRY AGAIN.");
		} else {
			System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}

	}
}


// "Hey, what had happened? "


///// "Hey I just added this comment in this folder. Can you see it from Github cloud?"




