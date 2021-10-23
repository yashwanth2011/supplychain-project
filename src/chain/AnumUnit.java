package chain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnumUnit {

	@Test
	public void test() {
		Finance finance = new Finance();
		double out =  finance.Check_Price_Anum(8);
		assertEquals(32,out);
	}

}
