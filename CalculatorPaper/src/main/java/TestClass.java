import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestClass {
	@Test
	public void cubeValueTest() {
		CalClass c = new CalClass();
		assertEquals(c.cube(2),8);
	}
	@Test
	public void PositiveSquareValue() {
		CalClass c = new CalClass();
		assertEquals(c.square(2),4);
		
	}
	@Test
	public void negativeSquareValue() {
		CalClass c = new CalClass();
		assertEquals(c.square(-2),4);
		
	}
	@Test
	public void zeroSquareValue() {
		CalClass c = new CalClass();
		assertEquals(c.square(0),0);
		
	}
	@Test
	public void findmaxValueTest() {
		CalClass c = new CalClass();
		assertEquals(c.findMax(2,3,4),4);
	}
	@Test
	public void negativefindmaxValueTest() {
		CalClass c = new CalClass();
		assertEquals(c.findMax(-2,-3,-4),-2);
	}
	@Test
	public void zerofindmaxValueTest() {
		CalClass c = new CalClass();
		assertEquals(c.findMax(0,0,0),0);
	}
}