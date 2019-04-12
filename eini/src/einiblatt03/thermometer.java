package einiblatt03;

public class thermometer {
	public static void main(String[] args) {
		// umrechnung von farenheit in celsius und andersherum
		double f; // initialisierung
		double c; // initialisierung
		c = 5;
/*		if (c == 0) // wenn c=0 ist führt er die folgende schleife aus (Berechnet die Umrechnung für
					// 0-10°C in einer-Schritten)
		{
			while (c < 10) // solange c<10 ist führt er diese Schleife aus bzw. er führt diese Schleife vom
							// Startwert c=0 bis 10 aus
			{
				c = c + 1; // Erhöhung von c um 1
				f = c * 9 / 5 + 32; // Umrechnung von Celsius in Farenheit

				System.out.println("Temperatur in Celsius " + c + "\n"); // Ausgabe von Celsius mit einem Zeilensprung
																			// am Ende
				System.out.println("Temperatur in Farenheit " + f); // Ausgabe von Farenheit
				System.out.println("Finished");
			}
		}*/ if (c >= 0) // wenn c>0 führt er die folgende schleife aus (Berechnet die Umrechnung für
							// c-21°C in einer-Schritten)
		{
			f = c * 9 / 5 + 32; // Berechnet die Umrechnung für c separat
			System.out.println("Temperatur in Celsius " + c);
			System.out.println("Temperatur in Farenheit " + f);
			System.out.println("Finished" + "\n");

			while (c <= 20) // solange c<=20 ist führt er diese Schleife aus bzw. er führt diese Schleife
							// vom Startwert c bis 21°C aus
			{
				c = c + 1;
				f = c * 9 / 5 + 32;

				System.out.println("Temperatur in Celsius " + c);
				System.out.println("Temperatur in Farenheit " + f);
				System.out.println("Finished" + "\n");
			}
		} else // wenn c<0 dann gibt er "Ungültig" aus
		{
			System.out.println("Ungültig");
		}
	}
}
