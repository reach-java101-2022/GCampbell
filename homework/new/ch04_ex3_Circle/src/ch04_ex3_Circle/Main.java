/**
  * @Author gcamp
  * @date Feb 10, 2023
  * @filename Main.java
  * @project ch04_ex3_Circle
 */
package ch04_ex3_Circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter Circle Radius: ");
			double r = Double.parseDouble(sc.nextLine());
			
			Circle c = new Circle(r);
//			c.setRadius(r);
			
			double d = c.getDiameter();
			
			double cir = c.getCircumference();
			
			System.out.println("Your diameter:      " + d +
					  "\n" +   "Your Circumference: " + cir);
			
			
			System.out.print("Continue? (y/n): ");
			
			cont = sc.nextLine();
		}
		System.out.println("byebye");
	}

}
