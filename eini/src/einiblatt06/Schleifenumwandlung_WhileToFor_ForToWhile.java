package einiblatt06;

public class Schleifenumwandlung_WhileToFor_ForToWhile {
	// Idee: Addiere 17 mal 2 auf 0
/*
	// WHILE
	public static void main(String[] args) {
		int a = 0; // a Ausgabevariable, muss vorher deklariert und initialisiert werden
		int b = 0; // b Laufvariable, muss vorher deklariert und initialisiert werden
		while (b < 17) {
			a = a + 2;
			b++;
		}
		System.out.println("a: " + a);
	}
*/
/*
	// FOR
	public static void main(String[] args) {
		int a = 0; // a Ausgabevariable, muss vorher deklariert und initialisiert werden, da sonst nur im Schleifenkörper bekannt
		for (int b = 0; b < 17; b++) { // b Laufvariable, muss nur im Schleifenkörper bekannt sein
			a = a + 2;
		}
		System.out.println("a: " + a);	// Zur Ausgabe hier muss a VOR der Schleife deklariert und initialisiert werden
	}
*/
}
