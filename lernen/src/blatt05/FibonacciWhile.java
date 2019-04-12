package blatt05;

public class FibonacciWhile {
	public static void main(String[] args) {
		int fibLast = 0;
		int fibCurrent = 1;
		int template;
		int count = 10 - 1;

		System.out.print(fibCurrent + ", ");

		while (count > 0) {
			template = fibLast + fibCurrent;
			// Zwischenspeicherung der Summe
			fibLast = fibCurrent;
			// Überschreiben der vorherigen Zahl mit der jetzigen Zahl
			fibCurrent = template;
			// Überschreiben der jetzigen Zahl mit der Summe beider Zahlen vorher

			System.out.print(fibCurrent + ", ");
			count--;
		}
	}
}
