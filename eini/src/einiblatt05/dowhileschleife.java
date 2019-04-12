package einiblatt05;

public class dowhileschleife {
	public static void main(String[] args)
	{
		int v=0, j=1, a=6, b=a-1, i=0;
//v vorherige, j jetzige, a anzahl, i hilfsvariable
		System.out.println("Fib " + 1);
/*		do
		{

//			System.out.println("Vorher "+ v);
//			System.out.println("Jetzt "+ j);
			i=v+j;
			v=j;
			j=i;
			b--;
			System.out.println("Fib " + i);
		}
		while(b>0);
*/
		do
		{

//			System.out.println("Vorher "+ v);
//			System.out.println("Jetzt "+ j);
			i=v;
			v=j;
			j=j+i;
			b--;
			System.out.println("Fib " + j);
		}
		while(b>0);

		
		//beide schleifen funktionieren. juhuuu
		
	}

}
