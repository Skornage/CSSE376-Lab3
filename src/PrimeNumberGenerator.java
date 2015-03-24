import java.util.ArrayList;
import java.util.List;


public class PrimeNumberGenerator {
	
	public static List<Integer> generate(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if (num > 1) {
			primes.add(2);
		} 
		if (num > 3) {
			primes.add(3);
		}
		return primes;
	}

}
