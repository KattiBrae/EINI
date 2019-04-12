package einiblatt10;

public class vehicletest {

	public static void main(String[] args) {
	
		vehicle bike = new vehicle(2, "Manpower", "Fahrrad");
		vehicle plane = new vehicle(3, "Kerosin", "Flugzeug");
		vehicle uss_orville = new vehicle(0, "Wasserstoff", "Raumschiff");
		
		car fiesta = new car(30, "Ford", "Fiesta");
		car knightrider = new car(800, "Ford", "KIT");
		car knutschkugel = new car(10, "Toyota", "Aygo");
		
		bike.print();
		plane.print();
		uss_orville.print();
		
		fiesta.print();
		knightrider.print();
		knutschkugel.print();
		
	}
}
