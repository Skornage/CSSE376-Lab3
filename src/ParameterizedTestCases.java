import java.util.Arrays;
import java.util.Collection;
 
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTestCases {
   private Integer inputNumber;
   private List<Integer> expectedResult;

   public ParameterizedTestCases(Integer inputNumber, 
      List<Integer> expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }
   
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 1, list() },
         { 2, list(2)}
      });
   }

   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, PrimeNumberGenerator.generate(inputNumber));
   }
   
   private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
   
}