package blatt06;

public class BiggestVolume {
	public static double firstCube(double firstHeight, double firstWidth, double firstDepth) {
		double volume;
		volume = firstHeight * firstWidth * firstDepth;
		return (volume);
	}

	public static double secondCube(double secondHeight, double secondWidth, double secondDepth) {
		double volume;
		volume = secondHeight * secondWidth * secondDepth;
		return (volume);
	}

	public static double thirdCube(double thirdHeight, double thirdWidth, double thirdDepth) {
		double volume;
		volume = thirdHeight * thirdWidth * thirdDepth;
		return (volume);
	}

	public static boolean firstGreaterSecond(double firstHeight, double firstWidth, double firstDepth,
			double secondHeight, double secondWidth, double secondDepth) {
		boolean wahr;
		wahr = (firstCube(firstHeight, firstWidth, firstDepth)) >= (secondCube(secondHeight, secondWidth, secondDepth));
		return (wahr);
	}

	public static boolean secondGreaterThird(double secondHeight, double secondWidth, double secondDepth,
			double thirdHeight, double thirdWidth, double thirdDepth) {
		boolean wahr;
		wahr = (secondCube(secondHeight, secondWidth, secondDepth)) >= (thirdCube(thirdHeight, thirdWidth, thirdDepth));
		return (wahr);
	}

	public static boolean thirdGreaterFirst(double thirdHeight, double thirdWidth, double thirdDepth,
			double firstHeight, double firstWidth, double firstDepth) {
		boolean wahr;
		wahr = (thirdCube(thirdHeight, thirdWidth, thirdDepth)) >= (firstCube(firstHeight, firstWidth, firstDepth));
		return (wahr);
	}

	public static void main(String[] args) {
		double firstHeight = 16.5, firstWidth = 27.5, firstDepth = 38.0;
		double secondHeight = 28.0, secondWidth = 28.0, secondDepth = 28.0;
		double thirdHeight = 40.2, thirdWidth = 22.5, thirdDepth = 18.5;

		System.out.println("Volumen 1: " + firstCube(firstHeight, firstWidth, firstDepth));
		System.out.println("Volumen 2: " + secondCube(secondHeight, secondWidth, secondDepth));
		System.out.println("Volumen 3: " + thirdCube(thirdHeight, thirdWidth, thirdDepth));
		
		if ((firstGreaterSecond(firstHeight, firstWidth, firstDepth, secondHeight, secondWidth, secondDepth))
				&& !(thirdGreaterFirst(thirdHeight, thirdWidth, thirdDepth, firstHeight, firstWidth, firstDepth))) {
			System.out.println("Volume number 1 is the biggest");
		} else if (!firstGreaterSecond(firstHeight, firstWidth, firstDepth, secondHeight, secondWidth, secondDepth)
				&& (secondGreaterThird(secondHeight, secondWidth, secondDepth, thirdHeight, thirdWidth, thirdDepth))) {
			System.out.println("Volume number 2 is the biggest");
		} else {
			System.out.println("Volume number 3 is the biggest");
		}
	}

}
