package dushajLab10;

public class Manager1 implements PrintableInterface {
	private String name;
	private long deptNumber;

	public Manager1(String name,long deptNumber)
	{
	  this.name = name;
	  this.deptNumber = deptNumber;
	}
	public void print()
	{
	  System.out.println("Manager : Name :"+name +" Department Number : "+deptNumber);
	}
	}


