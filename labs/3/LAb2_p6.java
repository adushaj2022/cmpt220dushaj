package LAb2_p6;
import java.util.Random;
public class LAb2_p6 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int int3 = rand.nextInt(980)+2;
		int int4 = rand.nextInt(1000); 
		int int5 = rand.nextInt(10000); 

		String phone_number = String.format("%03d-%03d-%04d", int3, int4, int5);
		System.out.println("Phone number: " + "\n" +  phone_number);

	}

}
