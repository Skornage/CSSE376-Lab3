import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class FirstTestClass {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void test1Empty() {
		assertEquals(list(), PrimeFactor.getPrimeFactors(1));
	}
	
	@Test
	public void test2() throws Exception {
		assertEquals(list(2), PrimeFactor.getPrimeFactors(2));
	}
	
	@Test
	public void test3() throws Exception {
		assertEquals(list(3), PrimeFactor.getPrimeFactors(3));
	}
	
	@Test
	public void test4() throws Exception {
		assertEquals(list(2, 2), PrimeFactor.getPrimeFactors(4));
	}

}
