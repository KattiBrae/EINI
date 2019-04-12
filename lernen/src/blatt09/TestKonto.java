package blatt09;

import blatt09.Girokonto;

public class TestKonto {
	public static void main(String[] args) {

		System.out.println("BLZ: " + Girokonto.bankleitzahl);
		
		
		Girokonto magnetosKonto = new Girokonto("Magneto"); // neues Konto erstellt mit Namen magnetosKonto auf den Inhaber Magneto
		Girokonto beastsKonto = new Girokonto("Beast");
		
		magnetosKonto.setKontostand(10000);
		magnetosKonto.setKontostand(-5000);
		
		beastsKonto.setKontostand(-500);
		beastsKonto.setKontostand(499);		
		
		magnetosKonto.kontostandAnzeigen();
		beastsKonto.kontostandAnzeigen();
		
		
		beastsKonto.sperreKonto();
	}
}
