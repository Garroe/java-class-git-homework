import java.util.Random;
import java.util.Scanner;

/*public class Magic8Ball {
  public static void main(String[] args) {
    Random ranWord = new Random();

    String[] myWords = 
    {
      // Positive Answers
      "Yes",
      "Correct",
      "Right",
      "Absolutely",
      "True",
      "You nailed it",
      "You're genius!",

      // Negative Answers
       "No",
       "Incorrect",
       "Not really",
       "Wrong",
       "False",
       "You missed it",
       "Sorry", 

      // Nutural Answers
       "Maybe",
       "Probably",
       "Hopefully",
       "Not sure",
       "Let me check",
       "Do more research"
     };

    int randomNumber = ranWord.nextInt(myWords.length); //0, 1, 2
    //System.out.println("The special number is " + randomNumber);

    System.out.println("MAGIC 8-Ball SAYS: " + myWords[randomNumber]);

  }*/
}



//---------------------------------------------------------------------


public class Magic8Ball {
    public static void main(String... args) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      System.out.println ("Let's play Magic 8 ball!"); 
      System.out.print ("User Enter: " + scanner.nextLine());
       
       List<String> myWords = new ArrayList<String>();
       myWords.add("Yes");
       myWords.add ("No");
       myWords.add("Absolutely");
       myWords.add("You need more knowledge");
       myWords.add("Don't know");
       
       Object[] myArray = myWords.toArray();
       int select = random.nextInt(myArray.length);
       System.out.println(myArray[select]); 
    }
    
}

//------------------------------