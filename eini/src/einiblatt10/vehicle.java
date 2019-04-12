package einiblatt10;

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

	public void print() {
		/* Ausgabe der Daten */
		System.out.println(name);
		System.out.println("Reifen " + wheels);
		System.out.println("Treibstoff " + fuel + "\n");
		System.out.println("Anzahl Autos: " + car.getCarCounter() );
	}
}