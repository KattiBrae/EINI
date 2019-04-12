package einiblatt05;

public class forschleife {
	public static void main(String[] args)
	{
		long x, n, i;
		for( x=1, n=8, i=1 ; n>=i ; i++)
		{	
		x=x*i;
		}
		System.out.println("Von unten hoch " + x);
	
		for( x=1, n=8, i=1 ; n>=i ; n--)
		{	
		x=x*n;
		}
		System.out.println("Von oben runter " + x);
	}

}
