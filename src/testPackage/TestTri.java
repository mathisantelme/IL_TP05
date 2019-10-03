package testPackage;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import tpTest.TriTableau;

public class TestTri {
	
	private int[] sortedValues = {2, 3, 10, 11, 20, 67, 76, 87};
	private int[] values = {10, 2, 3, 76, 20, 11, 87, 67};
	private TriTableau tritableau = new TriTableau(values);
	
	@Test
	public void testTriSelection () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triSelection());
	}
	
	@Test
	public void testTriBulle () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triBulle());
	}
	
	@Test
	public void testInsertion () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triInsertion());
		int [] tabInsertion= {0};
		tritableau.setTab(tabInsertion);
		Assert.assertArrayEquals(tabInsertion, tritableau.triInsertion());
	}
	
	@Test
	public void testTriShell () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triShell());
	}
	
	@Test
	public void testToString() {
		assertEquals("{10, 2, 3, 76, 20, 11, 87, 67, }",tritableau.toString());
	}
	
	
	
	
}
