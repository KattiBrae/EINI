package einiblatt05;

public class For_break_summe {
	//Idee: Addiere alle Zahlen von 1 bis 20 aufeinander, aber brich ab, wenn die Summe der bisherigen Zahlen 50 übersteigt
	public static void main(String[] args) {
		for (int i = 1, sum = 0; i <= 20; i++) {
			sum = sum + i;
			if (sum > 50) {
				break;	//bricht die Schleife ab, obwohl die Schleifenbedingung noch nicht erreicht wurde
			}
			System.out.print(sum + ", ");
		}
	}
}
