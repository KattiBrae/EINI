package blatt07;

public class EasyRecursion {
	public static void main(String[] args) {
		int n = 9;
		int i = 0;
		descendingPrint(n);
		System.out.println("\n");
		ascendingPrint(i, n);
	}

	public static int descendingPrint(int n) {
		if (n >= 0) {
			System.out.print(n + ", ");
			return (descendingPrint(n - 1));
		} else {
			return (0);
		}
	}

	public static int ascendingPrint(int i, int n) {
		if (i <= n) {
			System.out.print(i + ", ");
			return (ascendingPrint(i + 1, n));
		} else {
			return (0);
		}
	}

}
