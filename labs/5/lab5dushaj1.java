package lab5dushaj2;

import java.util.Scanner;

public class lab5dushaj2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] data = new double[10];
		double spot_holder;
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("Enter 10 numbers: ");
			spot_holder = input.nextDouble();
			data[i] = spot_holder;
			
		}
		System.out.println("The max is: " + max(data));
	}

	private static double max(double[] dataL) {
		double maxx = 0;
		for (int j = 0; j < dataL.length; j++) {
			if (maxx < dataL[j]) {
				maxx = dataL[j];
				
			}
		}
		return maxx;
	

}
}