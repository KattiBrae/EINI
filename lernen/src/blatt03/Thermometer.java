package blatt03;

public class Thermometer {
	public static void main(String[] args) {
		double fahrenheit;
		// Deklaration Fahrenheit
		double celsius = 28.0;
		// Deklaration Celsius

		fahrenheit = 9 * celsius / 5 + 32;
		// Umrechnung Celsius - Fahrenheit
		
		//celsius = 5 * ( fahrenheit - 32 ) / 9;
		// Umrechnung Fahrenheit - Celsius
		
		System.out.println("Celsius: " + celsius);
		System.out.println("Fahrenheit: " + fahrenheit);
	}

}
