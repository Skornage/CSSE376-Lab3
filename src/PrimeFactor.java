import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public static List<Integer> getPrimeFactors(int value) {
		List<Integer> primes = new ArrayList();
		int check = 2;
		int i = value;
		while (i > 1) {
			for (; i % check == 0; i = i / check) {
				primes.add(check);
			}
			check++;
		}
		
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
