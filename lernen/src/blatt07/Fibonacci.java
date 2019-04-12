package blatt07;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 20 - 1;
		int current = 1;
		int last = 1;
		int template = 0;

		System.out.print(last + ", ");
		fib(n, current, last, template);
	}

	public static int fib(int n, int current, int last, int template) {
		if (n > 0) {
			System.out.print(current + ", ");
			return (fib(n - 1, current + last, current, last));
		} else {
			return (0);
		}
	}
}
