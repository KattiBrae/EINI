package blatt07;

public class Euklid {
	public static void main(String[] args) {
		int m = 36;
		int n = 18;
		
		System.out.print(euclid(m, n));
	}

	public static int euclid(int m, int n) {
		if (m == n) {
			return n;
		} else if (m > n) {
			return euclid(m - n, n);
		} else {
			return (euclid(m, n - m));
		}
	}
}
