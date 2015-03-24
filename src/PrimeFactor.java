import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		for (int check = 2; value > 1; check++) {
			for (; value % check == 0; value /= check) {
				primes.add(check);
			}
		}
		return primes;
	}

}
