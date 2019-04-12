package blatt08;

public class EinfacheSortierung {
	public static void main(String[] args) {
		// Beliebiger Array
		int[] A = { 8, 20, 15, 6, 12, 16, 5, 19, 3, 7 };

		// Unsortierte Ausgabe
		System.out.println("Unsortiert: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t" + A[i]);
		}
		System.out.println("\n\n");
		
		// Sortieralgorithmus
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					int n = A[i];
					A[i] = A[j];
					A[j] = n;
				}
			}
		}
		
		// Sortierte Ausgabe
		System.out.println("Sortiert: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t" + A[i]);
		}
	}
}
