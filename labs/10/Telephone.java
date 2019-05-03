package dushajLab10;

public class Telephone extends Appliance {
	private String brand;
	   private boolean isWireless;
	   private boolean isVoLTE;
	   // Two constructors
	   public Telephone(String brand, boolean isWireless, boolean isVoLTE, double voltage, String colour, String madeIn,
	           double price) {
	       super(voltage, colour, madeIn, price);
	       this.brand = brand;
	       this.isWireless = isWireless;
	       this.isVoLTE = isVoLTE;
	   }

	  
	   public String getBrand() {
	       return brand;
	   }

	   public void setBrand(String brand) {
	       this.brand = brand;
	   }

	   public boolean isWireless() {
	       return isWireless;
	   }

	   public void setCabled(boolean isWireless) {
	       this.isWireless = isWireless;
	   }

	   public boolean isVoLTE() {
	       return isVoLTE;
	   }

	   public void setVolte(boolean isVoLTE) {
	       this.isVoLTE = isVoLTE;
	   }

	   @Override
	   public String toString() {
	       return "Telephone [brand=" + brand + ", isWireless=" + isWireless + ", isVoLTE=" + isVoLTE + ", getPrice()="
	               + getPrice() + "]";
	   }

}
