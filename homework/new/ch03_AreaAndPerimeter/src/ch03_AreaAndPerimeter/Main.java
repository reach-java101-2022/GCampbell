/**
  * @Author gcamp
  * @date Jan 26, 2023
  * @filename Main.java
  * @project ch03_AreaAndPerimeter
 */
package ch03_AreaAndPerimeter;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.print("Enter Length: ");
        	double l = Integer.parseInt(sc.nextLine());
        			
        	System.out.print("Enter Width: ");
        	double w = Integer.parseInt(sc.nextLine());
        	
        	//math it
        	double area = l * w;
        	double perimeter = 2 * ( w + l );
        	System.out.println( 
        			"\n" + "Size:" + "\n" +		
        			"Area:      " + area + "\n" +
        			"Perimeter: " + perimeter + "\n"
        			);
        	
        	
        // see if the user wants to continue
           System.out.print("Continue? (y/n): ");
           choice = sc.nextLine();
           System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}
