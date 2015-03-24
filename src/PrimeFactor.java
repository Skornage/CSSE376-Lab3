import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {
	
	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		if (value % 2 == 0) {
			primes.add(2);
			value = value / 2;
		}
		if (value > 1) {
			primes.add(value);
		}
		return primes;
	}

}
