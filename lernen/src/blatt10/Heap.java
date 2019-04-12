package blatt10;

public class Heap {

	private int[] array; // Array
	private int insertPosition; // Die Stelle, an die einsortiert wird

	public Heap(int size) {
		this.array = new int[size + 1];
		this.insertPosition = 1;
	}

	/* Legt eine neue Zahl in den Heap und sortiert sie ein */
	public void put(int number) {
		this.array[this.insertPosition] = number;
		insert(insertPosition);
		this.insertPosition++; // Stelle, an der einsortiert wird, wird erhöht
	}

	/*
	 * Entfernt das oberste Element vom Heap und stellt die Heap-Eigenschaft wieder
	 * her
	 */
	public int pop() {
		int result = this.array[1]; // speichere Wurzel als result
		this.array[1] = this.array[insertPosition - 1]; // letzter Eintrag wird zur Wurzel
		this.array[insertPosition - 1] = 0; // letzter Eintrag wird gelöscht
		this.insertPosition--; // letzte Position wird gelöscht
		this.heapify(1); // Sortierung
		return result;
	}

	/* Gibt die Anzahl der vom Heap verwalteten Zahlen zurÃ¼ck */
	public int getSize() {
		return this.insertPosition - 1;
	}

	/*
	 * Sortiert eine Zahl am index in den Heap ein TAUSCHT VATER UND SOHN WENN NÖTIG
	 */
	private void insert(int index) {
		if (index > 1) {
			/* Ergänztes Skript */
			int parent = index / 2;
			if (this.array[index] < this.array[parent]) {
				swap(index, parent, this.array);
				insert(parent);
			}

		}
	}

	/* Sortiert die Wurzel nach entfernen des Elementes in den Heap ein */
	private void heapify(int index) {

		int leftChild = 0; /* ErgÃ¤nze: Linkes Kind bestimmen */
		leftChild = 2 * index;
		int rightChild = 0; /* ErgÃ¤nze: Rechtes Kind bestimmen */
		rightChild = 2 * index;

		if (leftChild < this.insertPosition && rightChild >= this.insertPosition) {
			if (array[leftChild] < array[index]) {
				swap(index, leftChild, this.array);
			}
		} else if (rightChild < this.insertPosition) {
			int smallestChild = 0; /* ErgÃ¤nze: Kleineres der beiden Kinder bestimmen */
			if (this.array[leftChild] <= this.array[rightChild]) {
				smallestChild = leftChild;
			} else {
				smallestChild = rightChild;
			}

			if (this.array[smallestChild] < array[index]) {
				swap(smallestChild, index, this.array);
				heapify(smallestChild);
			}
		}
	}

	/* Tauscht zwei Werte im Ã¼bergebenen Array an den Position x und y */
	private static void swap(int x, int y, int[] array) {
		int template = array[x];
		array[x] = array[y];
		array[y] = template;
	}

	/* Gibt ein Ã¼bergebenes Array aus */
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	/* Programm zum testen. Hier muss nichts geÃ¤ndert werden */
	public static void main(String[] args) {
		int[] a = { 52, 34, 2, 7, 14, 25, 12, 87, 90, 13, 72, 14, 74 };
		Heap heap = new Heap(a.length);
		for (int i = 0; i < a.length; i++) {
			heap.put(a[i]);
		}
		printArray(a);
		printArray(heap.array);
		for (int i = 0; i < a.length; i++) {
			int next = heap.pop();
			if (i == a.length - 1) {
				System.out.println(next);
			} else {
				System.out.print(next + ", ");
			}
		}
	}
}