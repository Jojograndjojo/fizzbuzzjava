package fizzbuzzjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzzTest {

	@Test
	public void testReturnsNumber() {
		fizzbuzz testObject = new fizzbuzz();
		assertEquals(1,testObject.evaluate(1));
	}
	
	@Test
	public void testReturnsFizzWhenNumberIsDivisibeBy3() {
		fizzbuzz testObject = new fizzbuzz();
		assertEquals("Fizz",testObject.evaluate(3));
	}
	
	@Test
	public void testReturnsBuzzWhenNumberIsDivisibleBy5() {
		fizzbuzz testObject = new fizzbuzz();
		assertEquals("Buzz",testObject.evaluate(5));
	}
	
	@Test
	public void testReturnsFizzBuzzWhenNumberIsDivisibleBy3and5() {
		fizzbuzz testObject = new fizzbuzz();
		assertEquals("FizzBuzz",testObject.evaluate(15));
	}

}
