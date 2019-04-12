package einiblatt04;

public class uhr {                    // timestamp und modulo-operation
	public static void main(String[] args) {
		long sec, min, h, time, days, month, year;

		time = 111;                    // timestamp = Sekundenzahl seit 1970
		sec = time % 60;                    // übrige Sekunden, die keine volle Minute ergeben
		min = (time / 60) % 60;                    // übrige Minuten, die keine volle Stunde ergeben
		h = (time / 3600) % 24;                    // übrige Stunden, die keinen vollen Tag ergeben
		days = time / (24 * 60 * 60) % 365;                    // übrige Tage, die kein volles Jahr ergeben
		month = time / (365 * 24 * 60 * 60 / 12) % 12;                    // Monat
		year = time / (365 * 24 * 60 * 60) + 1970;                    // Jahre AD

		System.out.println("Jahr " + year);
		System.out.println("Monat " + month);
		System.out.println("Tage " + days);
		System.out.println("Uhrzeit " + h + ":" + min + ":" + sec);
		System.out.println("Stunden " + h);
		System.out.println("Minuten " + min);
		System.out.println("Sekunden " + sec);
	}
}
