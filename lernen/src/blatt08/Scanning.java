package blatt08;

import java.util.Scanner;

public class Scanning {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Scanner Eingabe
		System.out.println("Wie lang soll der Array sein?");
		int n = scanner.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) { // Für jeden Eintrag eine Eingabe
			System.out.println("Geben Sie die nächste Zahl ein.");
			A[i] = scanner.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) {
					int m = A[i];
					A[i] = A[j];
					A[j] = m;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		scanner.close();
	}

}
