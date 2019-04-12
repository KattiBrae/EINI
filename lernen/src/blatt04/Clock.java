package blatt04;

public class Clock {
	public static void main(String[] args) {
		long time = 500;
		long seconds = time % 60;
		long minutes = (time / 60) % 60;
		long hours = (time / (60 * 60)) % 24;
		long days = (time / (24 * 60 * 60)) % 365;
		long years = time / (365 * 24 * 60 * 60) + 1970;

		System.out.println("Jahr: " + years);
		System.out.println("Tage: " + days);
		System.out.println("Stunde: " + hours);
		System.out.println("Minute: " + minutes);
		System.out.println("Sekunde: " + seconds);
		
		// long secondsthisday = seconds + minutes * 60 + hours * 60 * 60;
		// System.out.println("Sekunden an diesem Tag: " + secondsthisday);
		
		
	}
}
