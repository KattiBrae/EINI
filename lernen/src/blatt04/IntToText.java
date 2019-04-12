package blatt04;

public class IntToText {
	public static void main(String[] args) {

		
		int number = 3; 
		if (number == 0) { 
			System.out.println("zero"); 
		} 
		else if (number == 1) { 
			System.out.println("one"); 
			} 
		else if (number == 2) {
			System.out.println("two"); 
		} 
		else if (number == 3) {
			System.out.println("three"); 
		} 
		else if (number == 4) {
			System.out.println("four"); 
		} 
		else if (number >= 5 && number <= 7) {
			System.out.println("between 5 and 7"); 
		}
		else if (number > 7) {
			System.out.println("greater than 7"); 
		} 
		else { 
			System.out.println("other"); 
		}
		 
		/*
		int number = 3;
		switch (number) {
		case 0:
			System.out.println("zero");
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
		case 5: case 6: case 7:
			System.out.println("between 5 and 7");
			break;
		default:
			System.out.println("greater than 7");
			break;
		}
		*/
	}
}
