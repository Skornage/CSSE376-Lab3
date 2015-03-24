import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {
	
	public static List<Integer> generate(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int prime = 2;
		while (prime <= num) {
			if (prime % 2 != 0)
				primes.add(prime);
			prime++;
		}
		return primes;
	}

}
