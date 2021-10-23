package chain;

import static org.junit.Assert.*;

import org.junit.Test;

public class priceUnitTest {

	@Test
	public void test() {
		Builder_Services build = new Builder_Services();
		double i =  build.PriceOfPackage(8,4);
		assertEquals(32,i);
	}
}
