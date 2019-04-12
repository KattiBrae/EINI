package blatt06;

public class Funktionen {
	public static void main(String[] args) {
		double ergebnis = sqrt(16.0);
		printer(ergebnis);
		printbla();
	}

	static double sqrt(double x) {
		double uG = 0, oG = x + 1, m, epsilon = 0.00001;
		do {
			m = (uG + oG) / 2;
			if (m * m > x) {
				oG = m;
			} else
				uG = m;
		} while (oG - uG > epsilon);
		return (m);
	}
	
	static void printer(double ergebnis) {
		System.out.println(ergebnis);
	}
	
	static void printbla() {
		System.out.println("Bla Bla Bla");
	}
}
