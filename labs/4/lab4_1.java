package lab4_1;

public class lab4_1 {

	public static void main(String[] args) {
		System.out.print("in"+ "\t" + "cm" + "\t" + "cm" + "\t" + "in" + "\n");
		System.out.print("----------------------------\n");
		int count = 1;
		
		for (int i =1; i<= 50; i ++) {
			double number = i * 2.54;
			double number2 = count * 0.393701;
			count = count + 5;
			System.out.printf("%2d\t%6.2f | %3d\t%5.2f \n", i, number, count, number2);
			
			
		}

	}

}
