package blatt10;

// Funktioniert noch nicht!!
public class MinRec {
	private static int n = 0;

	public static void main(String[] args) {
		int index = 3;
		int[] array = { 30, 10, 50, 20, 40, 1, 60, 47, 12, 51, 65, 73, 23, 3, 19, 31 };

		printArray(array);
		System.out.print("\n");

		System.out.println(minArray(index, array));
	}

	public static int minArray(int index, int[] array) {
		int minimum = 0;

		if (array[index] <= array[index + n] && index + n < array.length - 1) {
			minimum = array[index];
			minArray(index + 1, array);
			n++;
			return (minimum);
		} else if (array[index] > array[index + n] && index + n < array.length - 1) {
			minimum = array[index + 1];
			minArray(index + 1, array);
			return (minimum);
		} else {
			return (0);
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
