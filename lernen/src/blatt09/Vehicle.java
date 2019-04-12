package blatt09;

public class Vehicle {
	private String name;
	private int wheels;
	private String fuel;


	public Vehicle(String inName, int inWheels, String inFuel) { // Initialisierung der Attribute	
		name = inName;
		wheels = inWheels;
		fuel = inFuel;
	}

	public int getWheels() { // #Räder zurückgeben
		return(wheels);
	}

	public void print() { // Treibstoff und #Räder ausgeben
		System.out.print(name + ", Anzahl Reifen: " + getWheels() + ", Treibstoff: " + fuel + "\n");
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
}