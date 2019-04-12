package einiblatt07;

public class rekursion {
	public static int fakultaet(int x) {
		if (x == 0) {
			return (1);
		} 
		else {
			return (x * fakultaet(x - 1));
		}
	}

	public static void main(String[] args) {
		// int x=8;
		// fakultaet(x);
		System.out.println("Fakultaet" + fakultaet(8));
	}

}
