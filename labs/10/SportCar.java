package dushajLab10;

public class SportCar implements PrintableInterface {
	 String name;
	 long number;
	 SportCar(){}

	public SportCar(String name,long number)
	{
	  this.name = name;
	  this.number = number;

}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public void print()
	{
	  System.out.println("Sports Car : Name : "+name +" Number : "+number);
	}
}
