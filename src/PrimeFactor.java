import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {
	
	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		int i;
		for (i = value; i % 2 == 0; i = i / 2) {
			primes.add(2);
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
