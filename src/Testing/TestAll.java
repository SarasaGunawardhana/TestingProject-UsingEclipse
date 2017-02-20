package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAll {

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

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
