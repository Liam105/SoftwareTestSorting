import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {
	private static Sorting myTest = null;
	int[] a = new int[]{9,2,6,3,1,5,4,7,11,8,13};
	int[] b = new int[]{9,2,6,3,1,5,4,7,11,8,13};
	int[] c = new int[]{9,2,6,3,10,12,4,7,11,8,13};
	int[] d = new int[]{9,2,6,3,10,12,4,7,11,8,5};
	Object[] myObject = new Object[]{a,c};
	@Before
	public void setUp() throws Exception {
		myTest = new Sorting();
	}
	

	@Test
	public void testIsSorted() {
		assertEquals(false,myTest.isSorted(a));
		myTest.insertionSort(a);
		assertEquals(true,myTest.isSorted(a));
		myTest.quicksort(b);
		assertEquals(true,myTest.isSorted(b));
		myTest.quicksort(c);
		assertEquals(true,myTest.isSorted(c));
		myTest.quicksort(d);
		assertEquals(true,myTest.isSorted(d));
		myTest.swapReferences(myObject,0,1);
		assertEquals(c,myObject[0]);
		
	}

}
