package lab5dushaj4;
import java.util.Arrays;
import java.util.Scanner;

public class lab5dushaj4 {

  
    public static boolean areIdentical(int [] arr1, int [] arr2){
        //If both the arrays are not of same size, return false
        if(arr1.length!=arr2.length){
            return false;
        }
        //Sort both the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            //If any element is not matching return false
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the array size: ");
        int arraysize = input.nextInt();
        int spaceholder;
        int [] data = new int[arraysize];
        for (int y = 0; y < data.length; y++) {
        	System.out.print("Enter a number: ");
        	spaceholder = input.nextInt();
        	data[y] = spaceholder;
        	
        }
        System.out.print("Enter the array size: ");
        int arraysize2 = input.nextInt();
        int spaceholder2;
        int [] data2 = new int[arraysize2];
        for (int q = 0; q < data2.length; q++) {
        	System.out.print("Enter a number: ");
        	spaceholder2 = input.nextInt();
        	data2[q] = spaceholder2;
        
      
    }
        System.out.print(Arrays.toString(data)+ " and " + Arrays.toString(data2)+ "Are identical: " + areIdentical(data,data2));
        
        


    }
	}


