package einiblatt11;

public class car extends vehicle {
	public int HorsePower;
	public String Manufacturer;
	public String Model;
	public static final double WATT_PER_HORSEPOWER = 735.5; //Konstante in der Datei, kann nicht mehr verändert werden
	
	//neu
	private static int carCounter;
	
	public car(int inHorsePower, String inManufacturer, String inModel) {
		super(4, "Benzin", "PKW");
		HorsePower = inHorsePower;
		Manufacturer = inManufacturer;
		Model = inModel;
		//Speichert neue Daten in die Variablen
		
		//neu
		carCounter++;	
		
	}
	
	public double getPower() {
	return(WATT_PER_HORSEPOWER*HorsePower/1000);
	/* Berechnet die Leistung über die Pferdestärken
	gibt die Leistung zurück */
	}
	
	public String toString() {
		return("Hersteller: " + Manufacturer + "\n" + "Modell: " + Model + "\n" + "Leistung: " + getPower() + "\n");
	}
	
	/*
	public void carprint() {
		System.out.println("Hersteller "+ Manufacturer);
		System.out.println("Modell " + Model);
		System.out.println("Leistung " + getPower() + "\n");
	}
	*/
	
	
	//neu
	public static int getCarCounter() {
		return(carCounter);
	}
}
