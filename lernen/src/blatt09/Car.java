package blatt09;

public class Car {
	public static final double WATT_PER_HORSEPOWER = 735.5;
	private String manufacturer;
	private String model;
	private int horsepower;

	public Car(String inManufacturer, String inModel, int inHorsepower) {
		manufacturer = inManufacturer;
		model = inModel;
		horsepower = inHorsepower;
	}

	public double getPower(int horsepower) {
		double watt;
		watt = horsepower * WATT_PER_HORSEPOWER;
		return (watt);
	}

	public void print() {
		System.out.print("Autohersteller: " + manufacturer + ", Modell: " + model + ", Leistung[Watt]: "
				+ getPower(horsepower) + "\n");
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
}
