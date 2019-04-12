package altklausuren;

public class Parkplatz {
	protected int plaetze;
	private int belegt;
	
	public Parkplatz(int freiePlaetze) {
		plaetze = freiePlaetze;
		belegt = 0;
	}

	public int getBelegt(int belegt) {
		return (belegt);
	}

	public boolean parken(int plaetze, int belegt) {
		plaetze = plaetze - 1;
		belegt = belegt + 1;
		if (plaetze > 0) {
			return (true);
		}
		else {
			return(false);
		}
	}
	
	public void ausparken(int plaetze, int belegt) {
		if (belegt > 0) {
			plaetze = plaetze + 1;
			belegt = belegt - 1;
		}
	}
	
	public void parkedruck( int plaetze, int belegt) {
		System.out.print( belegt + " von " + plaetze + " Plätzen belegt.");
	}

}
