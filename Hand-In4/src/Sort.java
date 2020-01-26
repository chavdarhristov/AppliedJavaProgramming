
public class Sort 
{
	 public void bucketSort(int[] A, int m)
	   {

	      Bucket b1 = new Bucket(m);
	      Bucket b2 = new Bucket(m);
	      Bucket b3 = new Bucket(m);
	      Bucket b4 = new Bucket(m);
	      for (int i = 0; i < A.length; i++)
	      {
	         if (A[i] < 25)
	            b1.insert(A[i]);
	         else if (A[i] < 50)
	            b2.insert(A[i]);
	         else if (A[i] < 75)
	            b3.insert(A[i]);
	         else
	            b4.insert(A[i]);
	      }
	      b1.sort();
	      b2.sort();
	      b3.sort();
	      b4.sort();
	      int count = 0;
	      for (int j = 0; j <= 3; j++)
	      {

	         if (j == 0)
	            count = b1.copyBucketInto(A, 0);

	         if (j == 1)
	            count += b2.copyBucketInto(A, count);

	         if (j == 2)
	            count += b3.copyBucketInto(A, count);

	         if (j == 3)
	            count += b4.copyBucketInto(A, count);

	      }
	   }

}
