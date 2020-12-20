/* Peter Abdulmasih
*
* Mr. Drass
*
* October 11, 2018
*
* The purpose of this program is to ask the user for the radius of the circle, then it will compute the area of it.
*
* Original Version: 10/3/2018
*/

import java.util.Scanner;
   public class ComputeRadius{
      public static void main (String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println ("Please enter the radius of the circle.");  // Prints the directions for the user in the console, asking the user for the radius of the circle.
         final double Pi = 3.14;                                         // Sets the variable Pi as a constant, which is set at 3.14.
         double Radius = input.nextDouble();                             // Sets the variable for the radius of the circle, which is the only input on the user's side.
         double Area = ((Radius * Radius)* Pi);                          // Sets the variable Area as an equation in which Radius is squared, and Pi is multiplied to that. The double parenthesis allows for Radius to be squared before Pi is multipllied.
         System.out.println ("The area of your circle is: " + Area);     // The system prints the result due to the equation.
   }      
}