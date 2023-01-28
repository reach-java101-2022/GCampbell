/**
  * @Author gcamp
  * @date Jan 28, 2023
  * @filename Rectangle.java
  * @project ch04_ex2_AreaAndPerimeter
 */
package murach.rectangle;

import java.text.NumberFormat;

public class Rectangle {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
				
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		double area = width * length;
		return area;
	}
	
	public String getAreaFormatted() {
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);        
        String areaFormatted = number.format(width * length);
        return areaFormatted;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * (width + length);
		return perimeter;
	}
	
	public String getPerimeterFormatted() {
		NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);        
        String perimeterFormatted = number.format(2 * (width + length));
        return perimeterFormatted;
	}
	
}
