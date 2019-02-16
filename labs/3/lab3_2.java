package lab3_2;

public class lab3_2 {

	public static void main(String[] args) {
			int totalcheck = 100;
			int divisor = 0;
			
			while (totalcheck < 501) {
				totalcheck += 1;
				
				
				if ((totalcheck % 5 == 0 ^ totalcheck % 7 == 0)) {
					divisor += 1;
					System.out.print(totalcheck);
					System.out.print("    ");
					
				}
				if ((divisor == 10)) {
					System.out.println("");
					divisor = 0;
				}
				
			}
	}

}
