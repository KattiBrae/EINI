package blatt08;
import java.util.Random;			// Import der Klasse, die verwendet werden soll

public class ArrayGenerator {
	public int[] generateAscendingArray(int length) {				// Array mit aufsteigenden Zahlen von 0 bis length
		int[] A;
		A = new int[length];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
		}
		return(A);
	}
	
	public int[] generateRandomArray(int length) {				// Array der Länge length mit Zufallszahlen
		int[] B;
		B = new int[length];
		
		for (int i = 0; i < B.length; i++) {					// Aufruf der Klasse Random mit randomNumbers aus der Funktion nextInt
		Random randomNumbers = new Random();
		B[i] = randomNumbers.nextInt(length);
		}
		return(B);
	}

}
