package altklausuren;

public class WS1819aufgabe7 {
	public static void main(String[] args) {
		int b = 8;
		int e = 3;
		
		System.out.println(pow(b, e));
	}

	public static long pow(int b, int e) {
		if (e == 0) {
			return (1);
		} else if (e % 2 == 0) {
			return (pow(b, e / 2) * pow(b, e / 2));
		} else {
			return (b * pow(b, e - 1));
		}
	}
}
