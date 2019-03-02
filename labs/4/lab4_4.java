package lab4_4;

public class lab4_4 {

	public static void main(String[] args) {
		String s="The keys to the house";
	       int[] a=new int[26];
	       int[] b=new int[26];
	       for(int i=0;i<26;i++)
	       {
	           a[i]=0;
	       }
	       for(int i=0;i<26;i++)
	       {
	           b[i]=0;
	       }
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)-65>=0&&s.charAt(i)-65<26)
	            {
	                a[s.charAt(i)-65]++;
	            }
	            if(s.charAt(i)-97>=0&&s.charAt(i)-97<26)
	            {
	                b[s.charAt(i)-97]++;
	            }
	        }
	        for(int i=0;i<26;i++)
	        {
	            if(b[i]!=0)
	            System.out.printf("Total occurence of %c is %d\n",i+97,b[i]);
	            if(a[i]!=0)
	            System.out.printf("Total occurence of %c is %d\n",i+65,a[i]);

	        }
	      
	   }
	

	}


