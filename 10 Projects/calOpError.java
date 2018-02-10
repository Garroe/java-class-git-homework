import java.util.Scanner;

public class calOpError {
	public static void main(String[] args) {		
			Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("> ");	

			String userInput = sc.next();	
			if (userInput.equals("quit")) {
				System.out.println("Goodbye.");
				break;
			}	
			double inputA = Double.parseDouble(userInput);
			String op = sc.next();
			double inputB = sc.nextDouble();

			if (op.equals("+")) {
				System.out.println("= " + (inputA + inputB));
			} else if (op.equals("-")) {
				System.out.println("= " + (inputA - inputB));
			} else if (op.equals("^")) {
				System.out.println("= " + Math.pow(inputA , inputB));
			} else if (op.equals("%")) {
				System.out.println("= " + (inputA % inputB));
			} else {
				System.out.println("Error, invalid operator: " + op);
			} 
		}
	}
}

//----------------------

// next / nextInt / nextDouble returns "next token"
// nextLine returns "all tokens" until end of line.
