package blatt06;

public class Aufrufe {
	public static void add5ToInt(int x) {
		x = x + 5;
		System.out.println("x in function add5ToInt: " + x); 
		}
	
	public static void main(String[] args) { 
		int x = 8;
		System.out.println("x before function call: " + x);
		add5ToInt(x);
		System.out.println("x after function call: " + x);
	}
}