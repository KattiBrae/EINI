package blatt05;

public class Collatz {
	public static void main(String[] args) {

		int collatz = 13;
		while (collatz >= 1) {
			if (collatz == 1) {
				break;
			}
			else if (collatz % 2 == 0) {
				collatz = collatz / 2;
			} 
			else if (collatz % 2 != 0) {
				collatz = collatz * 3 + 1;
			}
			System.out.print(collatz + ", ");
		}
	}
}
