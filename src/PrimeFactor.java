import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {
	
	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		if (value > 1) {
			primes.add(2);
		}
		return primes;
	}

}
