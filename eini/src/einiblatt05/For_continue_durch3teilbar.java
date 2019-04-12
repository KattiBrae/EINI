package einiblatt05;

public class For_continue_durch3teilbar {
	// Idee: Ausgabe von allen durch 3 teilbaren Zahlen zwischen 1 und 20
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if ((i % 3) != 0) { // wenn i nicht durch 3 teilbar, dann:
				continue; // springe zur nächsten Zahl
			}
			System.out.println(i); // wenn i durch 3 teilbar, gib sie aus
		}
	}

}