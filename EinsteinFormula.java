// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The EinsteinFormula program implements an application that calculates how much 
* potential energy given the mass.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-18 
*/

public class EinsteinFormula {
  // Create variables 
  static double mass;
  static double energy;
  
  /**
   * Calculates and outputs the amount of potential energy given the mass.
   */
   
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the mass:");
    // Assign user input as mass
    try { mass = userInput.nextDouble(); 
      if (mass >= 0) {
      // Calculate the potential energy
      energy =  mass *  Math.pow(2.998,2);
      // Tells the user the potential energy and restates the mass
      System.out.println("The potential energy of an object with a mass of " + mass + " is " + energy + " joules.");
      } else {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
      }
    } catch(Exception e) {
      // Informs user their input is invalid
      System.err.println("Invalid Input");
    }
  }
}