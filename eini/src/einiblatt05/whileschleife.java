package einiblatt05;

public class whileschleife {
	public static void main(String[] args) {
		int c = 13;
		while (c >= 1) {
			if (c == 1) {
				break;
			} else if (c % 2 == 0) {
				c = c / 2;
			} else if (c % 2 == 1) {
				c = c * 3 + 1;
			}
			System.out.println(c);
		}
	}
}
