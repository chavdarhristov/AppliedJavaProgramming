import static org.junit.Assert.*;

import org.junit.Test;


public class BucketTest 
{
	@Test
	public void Sort() 
	{
		Sort sort = new Sort();
		int[] A = {78,17,39,26,72,94,21,4,47,12,68,87};
		int[] B = {4,12,17,21,26,39,47,68,72,78,87,94};
		sort.bucketSort(A, 5);
		assertArrayEquals(B, A);
	}

}
