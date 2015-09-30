package Quiz3;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTests {
	static Triangle t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test() {
		
		t = new Triangle(6, 8, 12);
		assertTrue(t.getArea() == 21.33);
		assertTrue(t.getPerimeter() == 26);
		
		t = new Triangle(4, 9, 6);
		assertTrue(t.getArea() == 9.56);
		assertTrue(t.getPerimeter() == 19);
		
		t = new Triangle(10, 17, 25);
		assertTrue(t.getArea() == 61.18);
		assertTrue(t.getPerimeter() == 52);
		
		t = new Triangle(18.5, 25.6, 30);
		assertTrue(t.getArea() == 235.35);
		assertTrue(t.getPerimeter() == 74.09);

	}

}
