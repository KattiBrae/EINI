package einiblatt01;

public class greeter2 {
	public static void main(String[] args) {
		char[] c = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10, 32, 84, 111, 98, 105, 32, 105, 115,
				116, 32, 99, 111, 111, 108 };
		// char[]=array mit buchstaben (characters)
		// Ascii bzw Unicode Buchstaben
		for (int i = 0; i < c.length; i++)
		// for=schleife
		// c.length limitiert wie viele Einträge im Array sind bzw wie viele das
		// Programm überprüft
		// i++ erhöhung des arrays um 1
		{
			System.out.write(c[i]);
		}
		System.out.flush();
		// erzwingt eine Ausgabe
	}
}
