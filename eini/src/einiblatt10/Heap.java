package einiblatt10;

public class Heap {

	private int[] array;
	private int insertPosition;

	/* Programm zum testen. Hier muss nichts geÃ¤ndert werden */
	public static void main(String[] args) {
		int[] a = { 52, 34, 2, 7, 14, 25, 12, 87, 90, 13, 72, 14, 74 }; // das ist unser Array
		Heap heap = new Heap(a.length);									// hier wird das Objekt heap in der Klasse Heap erstellt
		for (int i = 0; i < a.length; i++) {							// heap wird für jeden Eintrag im Array erstellt
			heap.put(a[i]);												// put-Funktion
		}
		printArray(a);													//print-Funktion, Ausgabe vom unsortierten Array
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

	/* Gibt ein Ã¼bergebenes Array aus */
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	
	/* Legt eine neue Zahl in den Heap und sortiert sie ein */
	public void put(int number) {
		this.array[this.insertPosition] = number;
		insert(insertPosition);
		this.insertPosition++;
	}

	/* Sortiert eine Zahl am index in den Heap ein */
	private void insert(int index) {
		if (index > 1) {
			//NEU
			int parent = index/2;
			if (this.array[index]<this.array[parent]) {				//wenn Vater größer als Kind ist
				swap (index, parent, this.array);					//dann...
				insert(parent);
			}
			//Ende NEU
		}
	}
	/*
	 * Entfernt das oberste Element vom Heap und stellt die Heap-Eigenschaft wieder
	 * her
	 */
	public int pop() {
		int result = this.array[1];
		this.array[1] = this.array[insertPosition - 1];
		this.array[insertPosition - 1] = 0;
		this.insertPosition--;
		this.heapify(1);
		return result;
	}

	
	/* Tauscht zwei Werte im Ã¼bergebenen Array an den Position x und y */
	private static void swap(int x, int y, int[] array) {
		// NEU
		int tmp = array [x];							//Ringtausch
		array [x] = array [y];							//Ringtausch
		array [y] = tmp;								//Ringtausch
		//Ende NEU
	}



	
	
	
	
	//Ab hier blödsinn
	
	
	
	
	
	
	/* Sortiert die Wurzel nach entfernen des Elementes in den Heap ein */
	private void heapify(int index) {

		//NEU
		int leftChild = index*2; /* ErgÃ¤nze: Linkes Kind bestimmen */
		int rightChild = index*2+1; /* ErgÃ¤nze: Rechtes Kind bestimmen */
		//Ende neu

		if (leftChild < this.insertPosition && rightChild >= this.insertPosition) {
			if (array[leftChild] < array[index]) {
				swap(index, leftChild, this.array);
			}
		} else if (rightChild < this.insertPosition) {
			/*  
			*
			*
			*/
			int smallestChild = 0; /* ErgÃ¤nze: Kleineres der beiden Kinder bestimmen */
			if (this.array[smallestChild] < array[index]) {
				swap (smallestChild)
				/* ErgÃ¤nze: Rekursiver Aufruf von heapify() mit passendem index */
			}
			/*  
			*
			*
			*/
		}
	}


	
	
	
	
	
	
	public Heap(int size) {
		this.array = new int[size + 1];
		this.insertPosition = 1;
	}


	/* Gibt die Anzahl der vom Heap verwalteten Zahlen zurÃ¼ck */
	public int getSize() {
		return this.insertPosition - 1;
	}

}
