package com.example;

/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024-02-16
 */
import java.util.Scanner;

// Class
public final class Einstein {

  /** This is a private constructor used to prevent instantiation. */
  private Einstein() {
    throw new UnsupportedOperationException("Cannot be instantiated.");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables and Constants
    final double SPEED_OF_LIGHT = 299792458.0;
    double mass;
    double restMassEnergy;

    // Display Message to User and Asks for mass
    System.out.println("This Program Calculates the rest mass Energy of a mass.");
    System.out.print("Please Enter a mass (kg): ");

    // Error Checking
    try {
      // Checks for Double in Console
      mass = sc.nextDouble();
      // Checks to see if it is positive
      if (mass > 0) {
        // Calculate Rest Mass Energy
        restMassEnergy = mass * Math.pow(SPEED_OF_LIGHT, 2);

        // Format String For Simplicity
        String formatString = "The Rest Mass Energy of " + String.format(("%.3f"), mass) + "(kg) is "
            + String.format(("%.3f"), restMassEnergy) + "(J)";

        // Display Formatted String
        System.out.println(formatString);
      }
      // If the Number is not positive
      else {
        System.out.println("Must be Positive.");
      }
    }
    // Any other Errors
    catch (Exception e) {
      System.out.println("Error " + e.getMessage());
    }
    // Close Scanner
    sc.close();
  }
}
