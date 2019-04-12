package blatt10;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Fahrrad", 2, "feet");
		Vehicle plane = new Vehicle("Flugzeug", 3, "kerosine");
		Vehicle spaceX = new Vehicle("Raumschiff", 0, "hydrogen");
		Vehicle laser = new Vehicle("Boot", 0, "wind");
		
		Car rostlaube = new Car("VEB", "Trabant", 18);
		Car nussschale = new Car("Brütsch", "Mopetta", 10);
		Car traumwagen = new Car("Mercedes", "A-Klasse", 90);
		Car formel1 = new Car("Ferrari", "Vettel's Kiste", 1000);
		
		bike.print();
		plane.print();
		spaceX.print();
		laser.print();
		rostlaube.print();
		nussschale.print();
		traumwagen.print();
		formel1.print();
		
		
		System.out.print(Vehicle.compare(bike, plane) + "\n");
		System.out.print(Car.compare(formel1, nussschale) + "\n");
		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getAnzahl());
		System.out.println("Anzahl Autos: " + Car.getAnzahl());		
	}
}
