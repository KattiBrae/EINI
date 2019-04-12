package blatt07;

public class Pow {
	public static void main(String[] args) {
		double b = 2.0;
		int e = 10;
		
		System.out.println(b + "^" + e + ": " + power(b, e));
	}
	
	public static double power(double b, int e) {
		if (e == 0) {
			return(1);
		}
		else if (e % 2 == 0) {
			return(power(b, e/2) * power(b, e/2));
		}
		else {
			return(b * power(b, e-1));
		}
	}

}
