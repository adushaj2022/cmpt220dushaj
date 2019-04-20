package dushaj8;

import java.util.Scanner;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	

	public Triangle(double side1,double side2,double side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s = (side1 + side2 + side3 ) / 2;
		double area = s*(s-side1)*(s-side2)*(s-side3);
		return area;
	}
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
	}

	
	public static void main(String[] args) {
		double s1, s2, s3;
		String color;
		boolean fill;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color: ");
		color = input.nextLine();
		
		System.out.println("Enter the sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("Fill triangle or not? ");
		fill = input.nextBoolean();
		
		Triangle tt = new Triangle(s1, s2, s3);
		tt.setColor(color);
		tt.setFilled(fill);
		
		System.out.println("Sides: " + tt.toString());
		System.out.println("Color: " + tt.getColor());
		System.out.println("Area: " + tt.getArea());
		System.out.println("Perimeter: " + tt.getPerimeter());
		System.out.println("Filled or Not ? " + tt.isFilled());
		
		
		
		
		
		
		
	
	}
}
	


