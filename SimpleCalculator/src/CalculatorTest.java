import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		assertEquals(4, cal.sum(2, 2));
		assertEquals(0, cal.substract(2, 2));
		assertEquals(4, cal.multiply(2, 2));
		assertEquals(1, cal.devide(2, 2));
		
	}

}
