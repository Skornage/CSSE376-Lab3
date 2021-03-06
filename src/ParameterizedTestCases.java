import java.util.Arrays;
import java.util.Collection;
 
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized;
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
         { 3, list(2) },
         { 4, list(2, 3) },
         { 6, list(2, 3, 5) },
         { 8, list(2, 3, 5, 7) },
         { 12, list(2, 3, 5, 7, 11) },
         { 43, list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41) }
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