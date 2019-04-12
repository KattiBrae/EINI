package einiblatt07;

public class power2 {
	public static void main(String[] args) {
		double b = 3.0;
		double e = 5.0;
		System.out.println(b + " hoch " + e + ": " + power(b, e));
	}

	public static double power(double b, double e) {
		if (e == 0) {
			return (1);
		} else if (e % 2 == 0) {
			return (power(b, e / 2) * power(b, e / 2));
		} else {
			return (b * power(b, e - 1));
		}
	}
}
