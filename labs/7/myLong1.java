package dushajSeven;

// JA: No test class?
public class myLong1 {
long value ;
	
	myLong1(long value){
		this.value = value;
	}
	long getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 != 0;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if(value % i == 0)
				return false ; 
		}
		return true;
		
	}
	
	boolean equals(long value) {
		return this.value == value ;
	}
	
	boolean equals(myLong1 value) {
		return this.value == value.getValue();
	}
	
	long parselong(char ch[]) {
		String str = "";
		long num1;
		for(int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		num1 = Long.parseLong(str);
		return num1;
	}
	
	long parselong(String string1) {
		String str = string1;
		long num2;
		num2 = Long.parseLong(str);
		return num2;
	}
	
	

}


