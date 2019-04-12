package blatt11;

public class Car extends Vehicle {
	public static final double WATT_PER_HORSEPOWER = 735.5;
	private String manufacturer;
	private String model;
	private int horsepower;
	private static int anzahl;
	
	public Car(String inManufacturer, String inModel, int inHorsepower) {
		super("Auto", 4, "gasoline");
		manufacturer = inManufacturer;
		model = inModel;
		horsepower = inHorsepower;
		carCounter();
	}

	public double getPower(int horsepower) {
		double watt;
		watt = horsepower * WATT_PER_HORSEPOWER;
		return (watt);
	}

	public void print() {
		System.out.print(toString());
	}

	public static int compare(Car a, Car b) {
		if (a.getPower(a.horsepower) > b.getPower(b.horsepower)) {
			return (1);
		} else if (a.getPower(a.horsepower) == b.getPower(b.horsepower)) {
			return (0);
		} else {
			return (-1);
		}
	}

	private void carCounter() {
		anzahl = anzahl + 1;
	}

	public static int getAnzahl() {
		return (anzahl);
	}
	
	public String toString() {
		String ausgabe;
		ausgabe = super.toString() + ",\tAutohersteller: " + manufacturer + ",\t" + "Modell:\t" + model + ",\t" + "Leistung[Watt]:\t" + getPower(horsepower) + "\n";
		return (ausgabe);
	}
}
