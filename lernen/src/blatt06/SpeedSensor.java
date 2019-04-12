package blatt06;

public class SpeedSensor {
	public static void main(String[] args) {
		double currentMeters = 50;
		double currentSeconds = 2;

		System.out.println("Geschwindigkeit (m/s): " + currentMeters / currentSeconds);
		System.out.println("Geschwindigkeit (km/h): " + velocity(currentMeters, currentSeconds));
		System.out.println("Bremsweg in m: " + breakingDistance(currentMeters, currentSeconds));
	}

	public static double velocity(double currentMeters, double currentSeconds) {
		double kmh;
		kmh = (60 * 60 * currentMeters) / (currentSeconds * 1000);
		return (kmh);
	}

	public static double breakingDistance(double currentMeters, double currentSeconds) {
		double distance;
		distance = 0.5 * (3.6 * currentMeters / (10 * currentSeconds)) * (3.6 * currentMeters / (10 * currentSeconds));
		return (distance);
	}
}
