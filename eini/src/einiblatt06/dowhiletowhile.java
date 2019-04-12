package einiblatt06;

public class dowhiletowhile {
	public static void main(String[] args) 
	{
/*		int o = 7; int p = 256; 
		do 
		{
			p = p - 20;
			o--;
		}
		while(o > 0);
		System.out.println("p :" + p);
*/			
		
		
		int o=7, p=256;
		p=p-20;						//Wichtig: Muss vorher einmal ausgeführt werden!
		o--;						//Wichtig: Muss vorher einmal ausgeführt werden!
		while(o>0)
		{
			p=p-20;
			o=o-1;
		}
		System.out.println("p :" + p);
				
	}
}
