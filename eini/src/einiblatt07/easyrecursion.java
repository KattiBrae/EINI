package einiblatt07;

public class easyrecursion {
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Zahlenreihe " + recursion(n));
	}

	public static int recursion(int n) {
		if (n > 1) {
			return (recursion(n-1));
		} else {
			return (1);
		}
	}
}