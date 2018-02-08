import java.util.*;

/*public class fortuneCookie {
	public static void main(String[] args) {
		Random ranCookie = new Random();

		String[] fortuneList = {
			"You will have a great time doing your homework for the Java Class.",
			"Believe it can be done.",
			"Practice, practice, practice. Remember.",
			"Practice makes perfect!",
			"Never give up. Slowy, Steady and Correctly.",
			"Nothing is impossible if you have the will.",
			"Talk is cheap. Show me the code!",
			"Code can't lie; Comments can.",
			"You can't trust code that you did not totally create yourself.",
			"while(!(succeed = try()));"
		};

		int fortuneCookieList = ranCookie.nextInt(fortuneList.length);
		System.out.println("Fortune cookie says: " + fortuneList[fortuneCookieList]);
	}
}*/

public class fortuneCookie {
	public static void main(String[] args) {
		Random ranCookie = new Random();

		List<String> fortuneList = new ArrayList<String>();
		fortuneList.add("You will have a great time doing your homework for the Java Class.");
		fortuneList.add("Believe it can be done.");
		fortuneList.add("Practice, practice, practice. Remember.");
		fortuneList.add("Practice makes perfect!");
		fortuneList.add("Never give up. Slowy, Steady and Correctly.");
		fortuneList.add("Nothing is impossible if you have the will.");
		fortuneList.add("Talk is cheap. Show me the code!");
		fortuneList.add("Code can't lie; Comments can.");
		fortuneList.add("You can't trust code that you did not totally create yourself.");
		fortuneList.add("Practice...Practice....Practice!");

		//String[] myArray = fortuneList.toArray();
		int fortuneCookieList = ranCookie.nextInt(fortuneList.size());
		System.out.println("Fortune cookie says: "+'"' + fortuneList.get(fortuneCookieList) + '"');

	}
}	