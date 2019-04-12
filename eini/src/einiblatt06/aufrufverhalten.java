package einiblatt06;

public class aufrufverhalten {
	public static void add5toint(int x)
	{
		x=x+5;
		System.out.println("Funktion add5toint " + x);  //Ausgelesen wenn main die Fkt aufruft
	}
	public static void main(String[] args) 
	{
		int x=8;
		System.out.println("x vor Funktion " + x);  //Als erstes ausgelesen
		add5toint(x);								//Als zweites ausgelesen, Überweisung in Fkt 
		System.out.println("x nach Funktion " + x);	//Als letztes ausgelesen
	}
}
