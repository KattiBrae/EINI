package altklausuren;

import altklausuren.Parkplatz;

public class Parkhaus extends Parkplatz {
	private boolean einfahrtFrei;

	public Parkhaus(int freiePlaetze) {
		super(freiePlaetze);
		plaetze = freiePlaetze;
		einfahrtFrei = true;
	}

	public void sperre(boolean einfahrtFrei) {
		einfahrtFrei = false;
	}

	public boolean parken(int plaetze, int belegt) {
		if (einfahrtFrei == true) {
			plaetze = plaetze - 1;
			belegt = belegt + 1;
			if (plaetze > 0) {
				return (true);
			} else {
				return (false);
			}
		} else {
			return (false);
		}
	}

}
