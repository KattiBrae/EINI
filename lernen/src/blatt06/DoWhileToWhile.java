package blatt06;

public class DoWhileToWhile {
	public static void main(String[] args) {
/*		int o = 7;
		int p = 256;
		do {
			p = p - 20;
			o--;
		} while (o > 0);
		System.out.println("p :" + p);
*/
		int o = 7;
		int p = 256;
		p = p - 20;
		o--;
		while (o > 0) {
			p = p - 20;
			o--;
		}
		System.out.println("p :" + p);

	}
}
