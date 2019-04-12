package blatt07;

public class Basisumrechnung {
	public static void main(String[] args) {
		int n = 122;
		int b = 2;
		int i = 1;

		printInBase(n, b, i);
	}

	public static int printInBase(int n, int b, int i) {
		if (n > 0) {
			System.out.print(n % b + " ");
			return (printInBase(n / b, b, i + 1));
		} else {
			return (0);
		}
	}

}
