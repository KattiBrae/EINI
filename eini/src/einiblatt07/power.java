package einiblatt07;

public class power {
	public static void main(String[] args) {
		double b = 3.0;
		double e = 5.0;
		System.out.println(b + " hoch " + e + ": " + pow(b, e)); // System.out.println(" " + pow(5.0, 1.0));
	}

	public static double pow(double b, double e) {
		if (e == 0) {
			return (1);
		} else if (e % 2 == 0) {
			return (pow(b, e / 2.0) * pow(b, e / 2.0));
		} else {
			return b*pow(b, e - 1.0);			//hatte vergessen mal b zu nehmen
		}
	}
}