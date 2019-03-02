package lab4_2;

import java.util.Random;

public class lab4_2 {

	public static void main(String[] args) {
		String spaceholder = " ";
		  Random random = new Random();
		  int count = -1;

	        
	        for (int i = 0; i < 25; i++) {
	        	count = count + 1;
	           
	            int n = random.nextInt(26);

	            
	            char value = (char) (n + 97);
	            spaceholder = spaceholder + value;
	            if (count % 5 == 0) {
	            	System.out.print("\n");
	            
	            
	           
	            
	            
	  	           
	            	
	            }
	            System.out.print(value);
	        }
	        
	    }

	}

