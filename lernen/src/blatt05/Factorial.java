package blatt05;

public class Factorial {
	public static void main(String[] args) {
		long factorial = 1;
		// Deklaration der Fakultät
		int n = 10;
		// Fakultät der Zahl n
		
		for (int i = 1; i <= n; i++) {
		// Schleife: von i = 1 bis i = n in einer-Schritten rechne "neue Fakultät = Fakultät * i"
			factorial = factorial * i;
		}
		System.out.println("Fakultät von " + n + ": " + factorial);
		// Ausgabe
	}
}
