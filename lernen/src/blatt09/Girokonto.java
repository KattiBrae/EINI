package blatt09;

public class Girokonto {
	public static String bankleitzahl = "12345678";
	private int kontostand; 				// kontostand ist ohne meine Funktion vom User nicht einsehbar/änderbar
	private boolean istGesperrt;
	private String inhaber;
	
	public Girokonto(String inInhaber) {					// Konstruktor
		kontostand = 0;										// Konto startet bei 0€
		inhaber = inInhaber;								// setting des Inhabers
	}
	
	public void setKontostand(int cent) {					// Ändern des Kontostands = Einzahlung/Auszahlung
		kontostand = kontostand + cent;
	}
	
	private int getKontostand() {							// getter für den Kontostands
		return (kontostand);
	}
	
	public void sperreKonto() {								// Sperren des Kontos mit Notification
		istGesperrt = true;
		System.out.print("Das Konto von " + getInhaber() + " wurde gesperrt.");
	}
	
	public void entsperreKonto() {							// Entsperren des Kontos
		istGesperrt = false;
	}
	
	public boolean istGesperrt() {							// getter für den Zustand der Sperrung
		return (istGesperrt);
	}
	
	public String getInhaber() {							// getter für den Namen des Inhabers
		return(inhaber);
	}
	
	public void kontostandAnzeigen() {						// Ausgabe des Kontostands vom Inhaber in €
		double betrag = getKontostand();
		System.out.print(getInhaber() + ": " + betrag/100 + "€\n");
	}

}
