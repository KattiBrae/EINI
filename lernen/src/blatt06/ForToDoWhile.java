package blatt06;

public class ForToDoWhile {
	public static void main(String[] args) {
/*		int n = 7;
		int e = 1;
		for (int b = 0; b < 15 && n < 9; b = b + 2) {
			e = e + b * n - 2;
		}
		System.out.println("e: " + e);
*/	
		
		int n = 7;
		int e = 1;
		int b = 0;

		do {
			e = e + b * n - 2;
			b = b + 2;
		} while (b < 15 && n < 9);
		System.out.println("e: " + e);
	}
}
