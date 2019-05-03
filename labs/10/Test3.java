package dushajLab10;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int i =0;
		Appliance appliances[] = new Appliance[40];
	       
	       appliances[0] = new TV("Apple 15", "Curved", true, 450, "White", "Europe", 670);
	       appliances[1] = new TV("Apple 1", "Curved", true, 540, "White", "USA", 780);
	       appliances[2] = new TV("Apple 2", "Curved", true, 560, "White", "Europe", 845);
	       appliances[3] = new TV("Apple 3", "Curved", true, 510, "White", "Europe", 799);
	       appliances[4] = new TV("Apple 4", "Curved", true, 490, "White", "Europe", 875);
	       appliances[5] = new TV("Apple 5", "Curved", true, 400, "White", "Europe", 900);
	       appliances[6] = new Telephone("Iphone 6", true, false, 840, "White", "Europe", 200);
	       appliances[7] = new Telephone("Iphone 7", false, false, 400, "Red", "Europe", 575);
	       appliances[8] = new Telephone("Motorolla ", false, true, 499, "Blue", "Europe", 900);
	       appliances[9] = new Telephone("Apple 6", false, true, 720, "Green", "Europe", 500);
	       appliances[10] = new Telephone("Apple 7", true, true, 330, "White", "Europe", 550);
	       appliances[11] = new Toaster("KitchenAid", "triple", true, 330, "White", "Europe", 34);
	       appliances[12] = new Toaster("Westbend", "double", true, 330, "White", "Europe", 42);
	       appliances[13] = new Toaster("Kitchenbend", "double", true, 330, "White", "Europe", 35);
	       appliances[14] = new Toaster("Culinar arts", "triple", true, 330, "White", "Europe", 20);
	       appliances[15] = new TV("Apple 15", "Curved", true, 450, "White", "Europe", 55);
	       appliances[16] = new TV("Apple 1", "Curved", false, 540, "White", "Europe", 55000);
	       appliances[17] = new TV("Apple 2", "Curved", true, 560, "White", "Europe", 556);
	       appliances[18] = new TV("Apple 3", "Curved", false, 510, "White", "Europe", 700);
	       appliances[19] = new TV("Apple 4", "Curved", true, 490, "White", "Europe", 760);
	       appliances[20] = new TV("Apple 5", "Curved", true, 400, "White", "Europe", 800);
	       appliances[21] = new Telephone("Iphone 6", false, true, 840, "White", "Europe", 700);
	       appliances[22] = new Telephone("Iphone 7", false, true, 400, "Red", "Europe", 575);
	       appliances[23] = new Telephone("Motorolla ", true, false, 499, "Blue", "Europe", 900);
	       appliances[24] = new Telephone("Apple 6", false, true, 720, "Green", "Europe", 500);
	       appliances[25] = new Telephone("Apple 7", false, false, 330, "White", "Europe", 550);
	       appliances[26] = new Toaster("KitchenAid", "triple", true, 330, "White", "Europe", 80);
	       appliances[27] = new Toaster("Westbend", "triple", true, 330, "White", "Europe", 30);
	       appliances[28] = new Toaster("Kitchenbend", "triple", false, 330, "White", "Europe", 50);
	       appliances[29] = new Toaster("Culinar arts", "triple", true, 330, "White", "Europe", 90);
	       appliances[30] = new TV("Apple 3", "Curved", true, 510, "White", "Europe", 5845000);
	       appliances[31] = new TV("Apple 4", "Curved", true, 490, "White", "Europe", 500);
	       appliances[32] = new TV("Apple 5", "Curved", true, 400, "White", "Europe", 5500);
	       appliances[33] = new Telephone("Iphone 6", false, true, 840, "White", "Europe", 100);
	       appliances[34] = new Telephone("Iphone 7", false, true, 400, "Red", "Europe", 575000);
	       appliances[35] = new Telephone("Motorolla ", false, true, 499, "Blue", "Europe", 9000);
	       appliances[36] = new Telephone("Apple 1", false, true, 720, "Green", "Europe", 5000);
	       appliances[37] = new Telephone("Apple 90", true, true, 330, "White", "Europe", 550500);
	       appliances[38] = new Toaster("KitchenAid", "double", true, 330, "White", "Europe", 1200);
	       appliances[39] = new Toaster("Westbend", "triple", true, 330, "White", "Europe", 3000);


	     
	       
	       Arrays.sort(appliances);
	       for(Appliance app:appliances) {
	    	   i++;
	           System.out.println("#"+i + "\t" + app);
	       }

	   }

	}


