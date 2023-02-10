/**
  * @Author gcamp
  * @date Feb 10, 2023
  * @filename Circle.java
  * @project ch04_ex3_Circle
 */
package ch04_ex3_Circle;

public class Circle {
	public double radius, diameter, circumference;
	public Circle() {
		radius = 0;
	}
	public Circle( double rad ) {
		radius = rad;
	}
	
	
	public double getRadius() {
		return radius;
	}		

	
	public double getDiameter() {
		diameter = radius * 2;
		return diameter;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		circumference = 2 * 3.14159 * radius;
		return circumference;
	}
}


