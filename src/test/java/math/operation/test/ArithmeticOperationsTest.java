package math.operation.test;

import org.junit.Test;

import math.operation.ArithmeticOperations;

import static org.junit.Assert.assertEquals;


/**
 * @author 38631
 *
 */
public class ArithmeticOperationsTest {
	
	@Test
	public void testAdd()
	{
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(4, 6);
		Integer expected = 10;
		assertEquals("assert equals operations.add(4, 6)",expected, actual);
	}


}
