package blatt07;

public class PapierEasyRecursion {
	public static void main(String[] args) {
		int n = 8;
		int i = 1;

		descendingPrint(n);
		System.out.print("\n");
		ascendingPrint(n, i);
	}

	public static int descendingPrint(int n) {
		if (n > 0) {
			System.out.print(n + ", ");
			return(descendingPrint(n-1));
		}
		else {
			return(0);
		}
	}
	
	public static int ascendingPrint(int n, int i) {
		if (i<=n) {
			System.out.print(i + ", ");
			return(ascendingPrint(n, i+1));
		}
		else {
			return(0);
		}
	}

}

// Juhuuu, es hat geklappt