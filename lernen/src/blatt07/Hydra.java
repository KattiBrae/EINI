package blatt07;

public class Hydra {
	public static void main(String[] args) {
		int schwerthiebe = 4;
		int anzahl = 3;
		System.out.println("Herkules steht der Hydra gegenüber. Die Hydra hat zu Beginn " + anzahl + " Köpfe. ");
		System.out.print("Die Anzahl der Drachenköpfe, die Herkules anfauchen, nachdem er " + schwerthiebe +
				" mal alle Köpfe abgeschlagen hat, liegt bei " + koepfe(schwerthiebe, anzahl) + ".");
	}

	public static int koepfe(int schwerthiebe, int anzahl) {
		if (schwerthiebe > 0) {
			return( koepfe(schwerthiebe - 1, anzahl * 2));
		}
		else {
			return(anzahl);
		}
	}
}
