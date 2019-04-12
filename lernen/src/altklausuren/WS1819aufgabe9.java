package altklausuren;

public class WS1819aufgabe9 {
	public static void main(String[] args) {
		int[] a = { 4, 8, 12, 7, 9 };
		int[] b = { 40, 6, 2, 6, 25, 5 };

		System.out.print(minof2arr(a, b));
	}

	public static int minof2arr(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int n = 1; i < n && n < a.length; n++) {
				if (a[i] > a[n]) {
					int template = a[i];
					a[i] = a[n];
					a[n] = template;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int n = 1; i < n && n < b.length; n++) {
				if (b[i] > b[n]) {
					int template = b[i];
					b[i] = b[n];
					b[n] = template;
				}
			}
		}
		if (a[0] < b[0]) {
			return (a[0]);
		} else {
			return (b[0]);
		}
	}
}
