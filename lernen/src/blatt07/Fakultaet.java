package blatt07;

public class Fakultaet {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n + "! = " + fakultaet(n));
	}

	public static long fakultaet(int n) {
		if (n > 0) {
			return (n * fakultaet(n - 1));
		} else {
			return (1);
		}
	}
}
