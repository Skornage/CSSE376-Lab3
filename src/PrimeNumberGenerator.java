import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {
	
	public static List<Integer> generate(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int prime = 2;
		while (prime < num) {
			if (isPrime(prime)) {
				primes.add(prime);
			};
			prime++;
		}
		return primes;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
