package blatt11;

public class Vehicle {
	protected String name;
	protected int wheels;
	protected String fuel;
	protected static int anzahl;


	public Vehicle(String inName, int inWheels, String inFuel) { // Initialisierung der Attribute	
		name = inName;
		wheels = inWheels;
		fuel = inFuel;
		vehicleCounter();
	}

	public int getWheels() { // #Räder zurückgeben
		return(wheels);
	}
	
	public void print() { // Treibstoff und #Räder ausgeben
		System.out.print(toString() + "\n");
	}
	
	public static int compare(Vehicle a, Vehicle b) {
		if (a.getWheels() > b.getWheels()) {
			return(1);
		}
		else if (a.getWheels() == b.getWheels()) {
			return(0);
		}
		else {
			return(-1);
		}
	}
	
	protected void vehicleCounter() {
		anzahl = anzahl + 1;
	}
	
	public static int getAnzahl() {
		return (anzahl);
	}
	
	public String toString() {
		String ausgabe = name + ",\tAnzahl Reifen:\t" + getWheels() + ",\tTreibstoff:\t" + fuel;
		return (ausgabe);
	}
}