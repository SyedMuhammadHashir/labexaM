import static org.junit.Assert.*;

import org.junit.Test;

public class Odd {

	@Test
	public void test() {
		Main Odd = new Main();
		boolean check=Odd.CheckingOdd(3);
		assertEquals(3,check);
	}
}
