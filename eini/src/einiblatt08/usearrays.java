package einiblatt08;

public class usearrays {
	public static void main(String[] args) {
		int[] a;			// initialisierung vom Array a, Schubladen können mit ints gefüllt werden
		a = new int[5];			//a hat 5 Schubladen
		for (int i = 0; i < a.length; i++) {		//Schleife zum Füllen der Schubladen mit dem Arrayindex
			a[i] = i+1;
		}
		print(a);				//Aufrufen der print-Fkt
		swap(a);
	}

	public static void print(int[] a) {				//Arrays werden aufgerufen so wie sie initialisiert werden: int[] a, nicht int a[]
		for (int i = 0; i < a.length; i++) {				//Schleife zum Auslesen der Arrayinhalte
		System.out.print(a[i] + " ");					//Ausgeben der Arrayinhalte
		}
		System.out.print("\n");
	}
	public static void swap(int[] a) {
		int d;
		d=a[a.length-1];
		a[a.length-1]=a[a.length-2];
		a[a.length-2]=d;
		print(a);
	}
}
