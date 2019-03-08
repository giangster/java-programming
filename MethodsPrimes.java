public class MethodsPrimes {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i <= 20; i++) {
			while (num > 0) {
				if (isPrime(num) == true) {
					num = num + 1;
					System.out.print(num + " ");
				}
			}
		}
	}

	private static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % i != 0) {
				isPrime = false;
			} else {
				isPrime = true;
			}
		}
		return isPrime;
	}
}
