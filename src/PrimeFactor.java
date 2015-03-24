import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		int check = 2;
		while (value > 1) {
			for (; value % check == 0; value /= check) {
				primes.add(check);
			}
			check++;
		}
		
		if (value > 1) {
			primes.add(value);
		}
		return primes;
	}

}
