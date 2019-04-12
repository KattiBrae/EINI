package einiblatt09;

public class car {
	public int HorsePower;
	public String Manufacturer;
	public String Model;
	public static final double WATT_PER_HORSEPOWER = 735.5; //Konstante in der Datei, kann nicht mehr verändert werden
	
	public car(int inHorsePower, String inManufacturer, String inModel) {
		HorsePower = inHorsePower;
		Manufacturer = inManufacturer;
		Model = inModel;
		//Speichert neue Daten in die Variablen
	}
	
	public double getPower() {
	return(WATT_PER_HORSEPOWER*HorsePower/1000);
	/* Berechnet die Leistung über die Pferdestärken
	gibt die Leistung zurück */
	}
	
	public void print() {
		System.out.println("Hersteller "+ Manufacturer);
		System.out.println("Modell " + Model);
		System.out.println("Leistung " + getPower() + "\n");
	}
}
