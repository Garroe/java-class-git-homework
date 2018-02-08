import java.util.Random;

public class DiceRoll {
	public static void main(String[] args) {

		Random ranNum1 = new Random();
		int ranNumOne = ranNum1.nextInt(7);
		System.out.println("Roll #1: " + ranNumOne);

		Random ranNum2 = new Random();
		int ranNumTwo = ranNum2.nextInt(7);
		System.out.println("Roll #2: " + ranNumTwo);

	 	System.out.println("The total is " + totalNum(ranNumOne, ranNumTwo) + "!");
	}
	 static int totalNum(int ranNum1, int ranNum2 ) {
	 	return ranNum1 + ranNum2;
	 	}
}