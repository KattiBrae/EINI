package einiblatt11;

public class vehicle {

	private int wheels;
	private String fuel;
	private String name;

	public vehicle(int inWheels, String inFuel, String inName) {
		/* vehicle: Konstruktor,
		 * initialisiere die neuen Werte für Reifen und Treibstoff */
		wheels = inWheels;
		fuel = inFuel;
		name = inName;
	}

	public int getWheels() {
		/* um die Reifenanzahl in der globalen, äußeren Funktion abrufen zu können */
		return (wheels);
	}

	public String toString() {
		return("Anzahl Autos: " + car.getCarCounter() + "\n" + "\n" + name + "\n" + "Reifen " + wheels + "\n" + "Treibstoff :" + fuel + "\n");
	}
	/*
	public void print() {		//Ausgabe der Daten
		System.out.println("Anzahl Autos: " + car.getCarCounter() + "\n");
		System.out.println(name);
		System.out.println("Reifen " + wheels);
		System.out.println("Treibstoff " + fuel + "\n");
	
	}*/
}