import java.util.Scanner;

public class calOpError {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		while (true) {

			System.out.print("> ");				

			double inputA = Double.parseDouble(userInput);
			String op = sc.next();
			double inputB = Double.parseDouble(userInput);

			if (op.equals("+")) {
				System.out.println("= " + (inputA + inputB));
			} else if (op.equals("-")) {
				System.out.println("= " + (inputA - inputB));
			} else if (op.equals("^")) {
				System.out.println("= " + Math.pow(inputA , inputB));
			} else if (op.equals("%")) {
				System.out.println("= " + (inputA % inputB));
			} else {
				System.out.println("Error, invalid operator: ");
			} 

			String userInput = sc.next();
			if (userInput.equals("quit")) {
				System.out.println("Goodbye.");
				break;
			}
		}
	}
}

//----------------------
