/*
* This class creates an arraylist that will recieve input from a class.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-21
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {

  /**
  * Initializes the array.
  */
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  /**
  * This method receives the number inpputed by the user.
  *
  * @param pushNumber
  */
  public void push(final int pushNumber) {
    stackAsArray.add(pushNumber);
  }

  /**
  * This method peeks the top number in the stack.
  *
  * @return peekNum
  */
  public int peek() {
    return stackAsArray.get(stackAsArray.size() - 1);
  }

  /**
  * This method pops the top number of the array.
  *
  * @return poppedNumber
  */
  public int pop() throws Exception {
    // Throws exception if the array is empty
    if (this.stackAsArray.size() == 0) {
      throw null;
    } else {
      // Removes the top number in the stack and returns it
      int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
      stackAsArray.remove(stackAsArray.size() - 1);
      return poppedNumber;
    }
  }

  /**
  * This method clears the array.
  *
  * @return results
  */
  public String clear() {
    // Clears the array
    stackAsArray.clear();
    // Create varaible to tell user that the string has been cleared
    String results = "Array has been cleared!";
    // Returns the results
    return results;
  }

  /**
  * This method prints out the stack.
  *
  * @return userStack
  */
  public String showStack() {
    if (stackAsArray.size() > 0) {
      // Adds the elements in the array to a string and returns it
      String userStack = "";
      for (int counter = 0; counter != stackAsArray.size(); counter++) {
        if (counter != stackAsArray.size() - 1) {
          userStack = userStack + stackAsArray.get(counter) + ", ";
        } else {
          userStack = userStack + stackAsArray.get(counter);
        }
      }
      return userStack;
    } else {
      return null;
    }
  }
}
