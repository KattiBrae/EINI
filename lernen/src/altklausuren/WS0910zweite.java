package altklausuren;

public class WS0910zweite {
	public static void main(String[] args) {
		char[] array1 = {'a', 'b', 'c', 'd', 'e', 'f'};

		System.out.print(palindrom(array1));
	}

	public static boolean palindrom(char[] array1) {
		char[] array2;
		int m = 0;
		
		array2 = new char[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array2[array1.length - i] = array1[i];
		}

		for (int n = 0; n < array1.length; n++) {
			if (array1[n] == array2[n]) {
				m = m + 1;
			} else {
				m = 0;
			}
		}
		
		if (m == array1.length) {
			return (true);
		}
		else {
			return (false);
		}
	}

}
