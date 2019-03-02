package lab4_5;

import java.util.Random;

public class lab4_5 {

	public static void main(String[] args) {
		  double avg=0;
	      int[] a=new int[1000];
	    
	        Random rand = new Random();

	    for(int i=0;i<1000;i++)
	        {
	            a[i] = rand.nextInt(10000);
	      
	            avg=avg+a[i];
	        }
	        avg=avg/1000.0;
	        int count1=0,count2=0;
	    for(int i=0;i<1000;i++)
	    {
	        if(a[i]<avg)
	        count1++;
	        if(a[i]>avg)
	        count2++;
	    }
	    System.out.println("Total integers less than average are "+count1);
	    System.out.println("Total integers greater than average are "+count2);
	   }
	

	}


