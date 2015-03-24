import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {
	
	public static List<Integer> generate(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if (num > 1) {
			primes.add(2);
		} 
		int prime = 3;
		while (prime < num) {
			primes.add(prime);
			prime += 2;
		}
		return primes;
	}

}
