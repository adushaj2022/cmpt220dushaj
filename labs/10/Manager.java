package dushajLab10;

public class Manager extends Employee {
	Manager(String name, double age, double hourRate){
		super(name,age,hourRate);
		
	}
	@Override
	 public double salary(double hours) {
		double salary = hours * hourRate;
		return salary;
	}
		
	@Override
	 public String toString() {
	 return " Manager name= " + name + " age=" + age + " hourRate="
	 + hourRate;
	 }
	
	

}
