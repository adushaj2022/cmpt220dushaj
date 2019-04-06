package labseven;
import java.util.Scanner;
public class stackIntegers {

	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		System.out.print("Enter an integer Value: ");
		int userN = y.nextInt();
		StackOfintegers stack = new StackOfintegers();
		
		for(int i = 2; i < userN; i++) {
			while(userN % i == 0) {
				
				stack.push(i);
				userN = userN / i;
				
			}
		}
		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop()+ " ");
		}
	}

}
