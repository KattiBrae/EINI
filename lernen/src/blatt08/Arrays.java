package blatt08;

public class Arrays {
	public static void main(String[] args) {
		// gibt einen Array mit aufsteigenden Zahlen von 0 bis Länge = 20 aus
		int laenge = 20;
		int[] A;
		A = new int[laenge];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t" + A[i] + ",");
		}

	}
}
