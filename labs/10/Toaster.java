package dushajLab10;

public class Toaster extends Appliance{
	   private String brand;
	   private String model;
	   private boolean isOven;
	   
	   
	   public Toaster(String brand, String model, boolean isOven, double voltage, String color, String madeIn,
	           double price) {
	       super(voltage, color, madeIn, price);
	       this.brand = brand;
	       this.model = model;
	       this.isOven = isOven;
	   }

	   public Toaster() {
	       super(0, "Null", "Null", 0);
	   }
	 
	   public String getBrand() {
	       return brand;
	   }

	   public void setBrand(String brand) {
	       this.brand = brand;
	   }

	   public String getModel() {
	       return model;
	   }

	   public void setModel(String model) {
	       this.model = model;
	   }

	   public boolean isOven() {
	       return isOven;
	   }

	   public void setAutomatic(boolean isOven) {
	       this.isOven = isOven;
	   }

	   @Override
	   public String toString() {
	       return "Toaster [brand=" + brand + ", model=" + model + ", isOven=" + isOven + ", getPrice()="
	               + getPrice() + "]";
	   }
	  

}
