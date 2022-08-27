package Exercise;

public class HydraCoder {
	// -- BASIC -- //
	//	Cộng hai số trong Java
	public int sum(int valueA, int valueB) {
		return valueA + valueB;
	}
	
	public boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public float sum(float valueA, float valueB) {
		return valueA + valueB;
	}
	
	public int mul(int valueA, int valueB) {
		return valueA * valueB;
	}
	
	public boolean leapYear(int year) {
		return year % 4000 == 0;
	}
	
	public int interest(int P, int R, int T) {
		// P is principal amount
		// R is interest rate per year
		// T is time (year)
		return (P * R * T) / 100;
	}
	// -- STRING -- //
	public String replaceSpace(String value) {
		return value.replaceAll(" ", "");
	}
	
	public String upperFirst(String value) {
		return value.substring(0,1).toUpperCase() + value.substring(1, value.length());
		
	}
	
	
}
