import java.util.Scanner;

public class bankPinLockOut {
	public static void main(String[] args) {
		// Step 1# Create new scanner object
		Scanner scan = new Scanner(System.in);
			int pinNum = 775;
			int numOfTries = 0;
		System.out.println("WELCOME TO THE BANK OF <GARROE WAH>");

		// Step 2# Create input for user to enter
		System.out.print("ENTER YOUR PIN: ");
		int user = scan.nextInt();
		numOfTries++;
		System.out.println();

		// Creat loop
		while (user != pinNum && numOfTries < 3) {
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			user = scan.nextInt();
			numOfTries++;
			System.out.println();
			
		}
		if(user == pinNum){
			System.out.println("YOUR PIN HAS BEEN ACCCEPTED!");
		} else if (numOfTries >=3){
			System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}

	}
}
