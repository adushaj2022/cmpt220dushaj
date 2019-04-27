package nineLabdushaj;

public class bin2Dec {
bin2Dec(){}
	
	public int bin2Deci(String binaryString) {
		int number = 0;
		for (int k = 0; k < binaryString.length();k++) {
			if(binaryString.charAt(k) == '1') { 
				number+=2;
			
		} else if (binaryString.charAt(k) != '0') {
			throw new NumberFormatException();
			
		}
			number *= 2;
	

	
	}
		number /=2;
		return number;
}
}



