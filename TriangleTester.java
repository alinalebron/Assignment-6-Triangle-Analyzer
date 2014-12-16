
import java.util.Scanner;
import javax.swing.JOptionPane;

/* This is a test class for the Triangle Analyzer class.
 */
public class TriangleTester
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(
                    "Enter the lengths of the 3 sides of the first triangle, "
                    + "separated by spaces\n(or click Cancel to quit)");

        while (input != null)
        {
            Scanner inputScan = new Scanner(input);
            int side1 = inputScan.nextInt();    // length of first side
            int side2 = inputScan.nextInt();    // length of second side
            int side3 = inputScan.nextInt();    // length of third side

             // TO DO:
             
             // 1. Create a Triangle Analyzer object using side1, side2, 
             //    and side3
             
              Triangle triangleOne = new Triangle(side1, side2, side3) ;
             
             // 2. Call the accessor methods to get the lengths of the sides 
             //    and print them
             
              System.out.println (triangleOne.getSides() + "\n") ;
              
              
             // 3. Call the method that returns the type of triangle (or an 
             //    appropriate message if the sides do not form a triangle) 
             //    and print it
              
              System.out.println (triangleOne.triangleType() + "\n") ;
             
             // 4. If the side lengths do form a triangle, call the method that 
             //    computes and returns the area and print it, rounded to 2 
             //    decimal places 
              
              System.out.printf("The area is: %5.2f" + "\n", 
                                triangleOne.getArea());
              
              System.out.println("\n") ;
                        
            input = JOptionPane.showInputDialog(
                "Enter the lengths of the 3 sides of the next triangle, "
                + "separated by spaces\n(or click Cancel to quit)");
        }
    }
}
