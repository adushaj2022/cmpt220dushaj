package dushajLab10;

public class Rectangle implements PrintableInterface {
	int length;
	int width;
	Rectangle(){}
	Rectangle(int lenght, int width){
		this.length = length;
		this.width = width;
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void print() {
		System.out.print("Rectangle [length=" + length + ", width=" + width + "]" + "\n"+ "Area: " + width*length);
		
	}
	
	
	

}
