package testPackage;

import org.junit.*;
import org.junit.Assert;
import tpTest.TriTableau;

public class TestTri {
	
	private int[] sortedValues = {2, 3, 10, 11, 20, 67, 76, 87};
	private int[] values = {10, 2, 3, 76, 20, 11, 87, 67};
	private TriTableau tritableau = new TriTableau(values);
	
	@Test
	public void testTriSelection () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triSelection());
	}
}
