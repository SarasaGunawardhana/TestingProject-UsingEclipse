package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		Calculator c1= new Calculator();
		int tot=c1.addNumber(10, 20);
		assertEquals(tot, 30);
	}

}
