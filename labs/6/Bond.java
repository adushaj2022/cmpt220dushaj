package lab6;

public class Bond {
	//Data attributes
	   private double coupon;
	   private int payments;
	   private double interest;
	   private double valueMaturity;
	  
	   //No-arg constructor
	   public Bond() {
	       coupon = 0;
	       payments = 0;
	       interest = 0;
	       valueMaturity = 0;
	   }
	  
	   //Arg-Constructor
	   public Bond(double c, int p, double i, double v) {
	       coupon = c;
	       payments = p;
	       interest = i;
	       valueMaturity = v;
	   }
	  
	   //Method that returns the price of the bond
	   public double getPrice() {
	       double price;
	      
	       //Applying formula
	       price = ( coupon * ( 1 - ( 1 / Math.pow(1+interest, payments) ) ) ) + ( valueMaturity * ( 1 / Math.pow(1+interest, payments) ) );
	      
	       return price;
	   }  
	


	//Driver class
	
	   //Main method
	   public static void main(String[] args) {
	       //Creating a Bond object
	       Bond b = new Bond(500, 100, 0.05, 10000);
	      
	       //Getting price
	       System.out.printf("\n Price: $%.2f \n", b.getPrice());
	   }
	   }

