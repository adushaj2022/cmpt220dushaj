package lab3_4;

public class lab3_4 {

	public static void main(String[] args) {
		int total = 0;
		int i;
		for (i = 50; i < 100; i++) {
			System.out.print("The ASCII value of " + (char)i + "  =   " + i + "    ");
			total+=1;
			if (total % 20 == 0) {
				System.out.print("\n" + "    ");
			}
			

		}
	}

}
