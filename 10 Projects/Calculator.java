import java.util.Scanner;

// Step #1: Input "> " sign
// Step #2: Read user "inputA"
// Step #3: User operational equation input "op"
// Step #4: Read user "inputB"
// Step #4: Print the equation result, then go 
//          back to Step #1. Use loop

public class Calculator {
	public static void main(String[] args) {
		
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.print("> ");

			double inputA = sc.nextDouble();
			String op = sc.next();
			double inputB = sc.nextDouble();

			if (op.equals("+")) {
				System.out.println("= " + (inputA + inputB));
			}else if (op.equals("-")) {
				System.out.println("= " + (inputA - inputB));
			}else if (op.equals("*")) {
				System.out.println("= " + (inputA * inputB));
			}else if (op.equals("/")) {
				System.out.println("= " + (inputA / inputB));
			}else {
				System.out.println("Incorrrect equation. Try again later.");
			}
		}

	}
}