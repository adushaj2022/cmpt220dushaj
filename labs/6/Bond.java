package lab6;

public class Bond {
	//Data attributes
	    double coupon;
	    int payments;
	    double interest;
	   double valueMaturity;
	  
	   //No-arg constructor
	    Bond() {
	       coupon = 0;
	       payments = 0;
	       interest = 0;
	       valueMaturity = 0;
	   }
	  
	   //Arg-Constructor
	    Bond(double coupon, int payments, double interest, double valueMaturity) {
	       this.coupon = coupon;
	       this.payments = payments;
	       this.interest = interest;
	       this.valueMaturity = valueMaturity;
	   }
	  
	   //Method that returns the price of the bond
	    double getPrice() {
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

