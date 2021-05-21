/*
* This program pushes a user input to a program with a class containing an
* arraylist. Then peaks whats in the stack and pops it. This is not crashable.
* Also clears the list.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-21
*/

// Import the Scanner class
import java.util.Scanner;

public final class StackForm {

  private StackForm() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * This program recieves input and adds values onto the stack.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);

    // references MrCoxallStack file
    MrCoxallStack clasStack = new MrCoxallStack();

    try {
      // receive user input
      System.out.println("Enter how many numbers you want to add to a stack: ");
      int userParam = userInput.nextInt();
      System.out.println();

      // Pushes user input into the array
      for (int counter = 0; counter < userParam; counter++) {
        System.out.println("Enter an integer to push onto the stack: ");
        int numberChosen = userInput.nextInt();
        System.out.println();

        // Pushes user input into arraylist in MrCoxallStack
        clasStack.push(numberChosen);
      }

      // Peeks the number on top of the stack
      System.out.print("Peeked: " + clasStack.peek());
      // Prints out the current stack
      System.out.print("\nThe numbers in the stack: " + clasStack.showStack());

      // Receives user input
      System.out.println();
      System.out.println("\nEnter how many numbers you want to pop: ");
      int userParam2 = userInput.nextInt();

      // Gets the popped numbers
      for (int counter = 0; counter < userParam2; counter++) {
        System.out.print("\nPopped: " + clasStack.pop());
      }

      // Prints out whats in the stack
      System.out.print("\nThe numbers in the stack: " + clasStack.showStack());
      System.out.println();

      // Calls the clear method and tells user the array has been cleared
      System.out.print("\nClearing the numbers in the stack");
      System.out.print("\n" + clasStack.clear());
      System.out.print("\nThe numbers in the stack: " + clasStack.showStack());

      // Tells user program has finished
      System.out.println();
      System.out.println("\nDone");

    } catch (NullPointerException e) {
      // Throws an exception if the array is empty
      System.out.println("\nInvalid Input. More numbers Popped than in stack");
    } catch (Exception e) {
      // Throws an exeption
      System.out.println("\nInvalid Input. Try again.");
    }
  }
}
