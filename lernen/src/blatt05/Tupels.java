package blatt05;

public class Tupels {
	public static void main(String[] args) {
		int n = 2;
		int m = 4;

		/*
		for (int i = 1; i <= n; i++) {
			// Schleife zählt 1, 2 für i
			for (int j = 1; j <= m; j++) {
				// Schleife zählt 1, 2, 3, 4 für j
				if (i == j) {
					continue;
					// falls i=j den Wert überspringen
				}
				System.out.println("(" + i + ", " + j + ")");
				// Ausgabe
			}
		}
		*/
		
		for (int i = 1; i <= n; i++) {
			// Schleife zählt 1, 2 für i
			for (int j = 1; j <= m; j++) {
				// Schleife zählt 1, 2, 3, 4 für j
				if (i >= j) {
					continue;
					// falls i>=j den Wert überspringen 
				}
				System.out.println("(" + i + ", " + j + ")");
				// Ausgabe
			}
		}
		
	}
}
