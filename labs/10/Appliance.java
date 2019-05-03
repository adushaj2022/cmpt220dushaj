package dushajLab10;

public class Appliance implements Comparable {
	double voltage;
	String Color;
	String madeIn;
	double price;
	
	Appliance(){}
	Appliance(double voltage, String Color, String madeIn, double price){
		this.voltage = voltage;
		this.Color = Color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	
	
	double getVoltage(){
		return this.voltage;
	}
	String getColor() {
		return this.Color;
	}
	String getMadeIn() {
		return this.madeIn;
	}
	public int compareTo(Appliance arg0) {
		return 0;
	}
	
	double getPrice() {
		return this.price;
	}

	
	void setPrice(int price) {
		this.price = price;
	}
	 @Override
	   public int compareTo(Object arg0) {
	       // Override method from comparable interface and sort the objects
	       if(arg0 !=null) {
	           if(arg0 instanceof Appliance) {
	               Appliance app = (Appliance)arg0;
	               if(this.price > app.price) {
	                   return 1;
	               }else if (this.price < app.price){
	                   return -1;
	               }else {
	                   return 0;
	               }              
	           }else {
	               return 0;
	           }
	       }
		return 0;
		

	       }
	@Override
	public String toString() {
		return super.toString();
	}

}
