
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class groceryList {
  public static void main(String[] args) {
    List<String> items = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    while (true) {
      // Step #1: Your program should say how many items are in the list
      System.out.println("You have " + items.size() + " items in your grocery list.");

      // Step #2: then ask the user if they want to add an item.
      System.out.print("Would you like to add an item? [y/n]: ");

      // Step #3: If the user enters y, then program should prompt the user to
      String answer = scan.nextLine();

      if (answer.equals("y")) {
        System.out.print("What is the item: ");
        String item = scan.nextLine();
        items.add(item);
        System.out.println("");
      }

      // Step #4: If the user enters n, then program should display the whole
      if (answer.equals("n")) {
        System.out.println("");
        System.out.println("Here is your grocery list:");

        for (int i = 0; i < items.size(); i++) {
          String item = items.get(i);
          System.out.println("- " + item);
        }

        System.out.println("");
        System.out.println("Goodbye.");

        break;
      }
    }
  }
}