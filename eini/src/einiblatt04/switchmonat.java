package einiblatt04;

public class switchmonat {
	public static void main(String[] args) {
		int m = 12;

		switch (m) {
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("März");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mai");
			break;
		case 6:
			System.out.println("Juni");
			break;
		case 7:
			System.out.println("Juli");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Dezember");
			break;
		default:
			System.out.println("Ungültige Eingabe");
			break;
		}

		switch (m) {
		case 1: // erstes Quartal mit Monaten Jan, Feb, Mär
		case 2:
		case 3:
			System.out.println("1. Quartal");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("2. Quartal");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("3. Quartal");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("4. Quartal");
			break;
		default:
			System.out.println("Ungültige Eingabe");
			break;
		}
	}
}
