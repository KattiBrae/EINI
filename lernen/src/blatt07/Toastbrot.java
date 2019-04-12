package blatt07;

public class Toastbrot {
	public static void main(String[] args) {
		double laenge = 37;
		double scheibendicke = 1.2;
		int scheibenanzahl = 1;

		toastbrot(laenge, scheibendicke, scheibenanzahl);
	}

	public static int toastbrot(double laenge, double scheibendicke, int scheibenanzahl) {
		if (laenge - scheibendicke >= 0) {
			System.out.println("akutuelle Scheibenanzahl " + scheibenanzahl + "\n" + "Schneide Scheibe ab \n");
			return (toastbrot(laenge - scheibendicke, scheibendicke, scheibenanzahl + 1));
		} else {
			return (0);
		}
	}
}
