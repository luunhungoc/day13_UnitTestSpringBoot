package demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
public class Day13UnitTestSpringBootApplicationTests {

	@Autowired
	MathService mathService;

	@Test
	public void testAdd_UC001(){
		int actualResult=mathService.add(2, 3);
		int expectedResult=5;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testAdd_UC002(){
		int actualResult=mathService.mathHelper.add(-9,3);
		int expectedResult=-6;
		assertEquals(expectedResult,actualResult);
	}


	@Test
	public void testDivide_UC001(){
		double actualResult= mathService.divide(7,2);
		double expectedResult=3.5;
		assertEquals(expectedResult,actualResult,0.0001);
	}

	@Test
	public void testDivide_UC002(){
		assertThrows(ArithmeticException.class, () -> {
			mathService.divide(2,0);
		});
	}
}
