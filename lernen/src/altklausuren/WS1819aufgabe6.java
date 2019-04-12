package altklausuren;

public class WS1819aufgabe6 {
	public static void main(String[] args) {
		int[] a = {7, 3, 8, 5, 2, 6};
		
		System.out.print(min(a));
	}
	
	public static int min(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int n = 1; i < n && n < a.length; n++) {
				if (a[i] > a[n]) {
					int template = a[i];
					a[i] = a[n];
					a[n] = template;
				}
			}
		}
	return (a[0]);
	}
}
