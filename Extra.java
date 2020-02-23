// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The Extra program implements an application that calculates how many 
* kiloton bombs the potential energy of an object is given the mass.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-23 
*/

public class Extra {
  // Create variables 
  static double mass;
  static double energy;
  static double numOfBombs;
  
  /**
  * Calculates and outputs the amount of potential energy given the mass.
  */
  
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the mass in kg:");
    // Assign user input as mass
    try { 
      mass = userInput.nextDouble(); 
      if (mass >= 0) {
        // Calculate  the potential energy
        energy =  mass *  Math.pow(2.988 * Math.pow(10,8),2);
        // Calculates the number of kiloton bombs
        numOfBombs = energy / Math.pow(10,12) / 63 * 15;
        // Tells the user the potential energy and restates the mass
        System.out.println("An object that has a mass of " + mass 
            + "kg has a potential energy equivalent to " + numOfBombs + " kiloton bombs.");
      } else {
        // Informs user their input is invalid
        System.out.println("Invalid Input");
      }
    } catch (Exception e) {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
    }
  }
}