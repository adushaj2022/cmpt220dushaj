package dushajSeven;

public class testCircle {

	public static void main(String[] args) {
	     	Circle c1 = new Circle(2, 2, 5.5);
	       //display the area of the circle using getArea method
	       System.out.println("Area is " + c1.getArea());
	       //display the area of the circle using getPerimeter method
	       System.out.println("Perimeter is " + c1.getPerimeter());
	       
	       //Test the first condition
	       System.out.println(c1.contains(3, 3));
	       //Test the second condition
	       System.out.println(c1.contains(new Circle(4, 5, 10.5)));
	       //Test the third condition
	       System.out.println(c1.overlaps(new Circle(3, 5, 2.3)));
	      

	   }

	{

	}

}
