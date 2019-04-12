package einiblatt04;

public class switchreloaded { 			// switch-operation: gruppiert Bedingungen
	public static void main(String[] args) {
		int number;

		number = 8;

		switch (number) {
		case 0:				//erste Gruppierung/erster Fall: Zahl ist 1
			System.out.println("zero");				//dann wird das ausgegeben
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:					//Gruppierung mehrerer Zahlen zu dem Bereich 5-7
		case 6:
		case 7:
			System.out.println("between five and seven");
			break;
		default:
			System.out.println("greater seven");
			break;
		}

	}
}
