package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class cc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Started Before Testing ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Started After ");
	}

	@Test
	public void testAddNumber() {
		Calculator c1= new Calculator();
		int tot=c1.addNumber(10, 20);
		assertArrayEquals(tot, 30);
	}



	@Test
	public void testSubtractionNumber() {
		Calculator c1= new Calculator();
		int tot=c1.addNumber(40, 20);
		assertArrayEquals(tot, 20);
	}

	@Test
	public void testDivideNumber() {
		Calculator c1= new Calculator();
		int tot=c1.addNumber(100, 20);
		assertArrayEquals(tot, 5);
	}

	private void assertArrayEquals(int tot, int i) {
		// TODO Auto-generated method stub
		
	}

	


}
