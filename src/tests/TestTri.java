package tests;
import org.junit.Assert;

import tpTest.TriTableau;

import org.junit.*;

public class TestTri {
	
	private int[] sortedValues = {2, 3, 10, 11, 20, 67, 76, 87};
	private int[] values = {10, 2, 3, 76, 20, 11, 87, 67};
	private TriTableau tritableau = new TriTableau(values);
	
	@Test
	public void testTriSelection () {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triSelection());
	}
	
	@Test
	public void testTriInsertion() {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triInsertion());
		int[] tab0= {};
		int[] tab1= {2,3,1,4};
		int[]tab2= {1,2,3,4};
		tritableau.setTab(tab0);
		Assert.assertArrayEquals(tab0, tritableau.triInsertion());
		tritableau.setTab(tab1);
		Assert.assertArrayEquals(tab2, tritableau.triInsertion());
		tritableau.setTab(tab2);
		Assert.assertArrayEquals(tab2, tritableau.triInsertion());
	}
	
	@Test
	public void testTriShell() {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triShell());
	}
	
	@Test
	public void testTriBulle() {
		Assert.assertArrayEquals(this.sortedValues, tritableau.triBulle());
	}
}
