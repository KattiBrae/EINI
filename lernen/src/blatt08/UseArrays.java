package blatt08;

import blatt08.ArrayGenerator;									// Importierung der Bibliothek

public class UseArrays {
	public static void main(String[] args) {
		int length = 10;										// Wie lang soll der Array sein?
		
		System.out.print("Aufsteigende Zahlen \n");				// Absatz: Aufsteigender Array
		ArrayGenerator bla = new ArrayGenerator();				// Verwendung der Bibliothek
		int[] A = bla.generateAscendingArray(length);			// Generierung des Arrays
		ausgabe(A);												// Ausgabe der Daten
		
		System.out.print("Aufsteigende Zahlen mit Tausch des ersten und des letzten Eintrags \n");
		printArray(swap(A, 0, A.length - 1));					// Ausgabe des Arrays mit getauschten Einträgen

		System.out.print("\n\nZufallszahlen \n");				// Absatz: zufälliger Array
		ArrayGenerator blubb = new ArrayGenerator();			// Verwendung der Biliothek
		int[] B = blubb.generateRandomArray(length);			// Generierung des Arrays
		ausgabe(B);												// Ausgabe der Daten
	}

	public static void ausgabe(int[] A) {
		printArray(A);											// Ausgabe des Arrays
		System.out.print("\n");
		System.out.println("Minimum: " + arrayMin(A));			// Ausgabe des Minimums im Array
		System.out.println("Durchschnitt: " + average(A));		// Ausgabe des Durchschnitts im Array

	}
	
	public static void printArray(int[] A) {					// Funktion: Ausgabe von Arrays
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}

	public static int[] swap(int[] A, int i, int j) {			// Funktion: Tauschen von Array-Einträgen
		int n;
		n = A[i];
		A[i] = A[j];
		A[j] = n;
		return (A);
	}

	public static int arrayMin(int[] A) {						// Funktion: Berechnung des Maximums
		for (int i = 0; i < A.length; i++) {					// der Array wird sortiert und der erste Eintrag zurückgegeben
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					int n;
					n = A[i];
					A[i] = A[j];
					A[j] = n;
				}
			}
		}
		return (A[0]);
	}

	public static double average(int[] A) {						// Funktion: Berechnung des Durchschnitts
		double sum = 0;											// die Einträge des Arrays werden summiert und durch die Anzahl der Einträge geteilt
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}
		double mu = sum/A.length;
		return (mu);
	}

}
