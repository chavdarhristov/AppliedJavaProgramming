

public class Bucket
{
   private int[] bucket;
   private int count; // the next free place in the bucket

   /*
    * size is the maximum number of elements that can be held in this bucket.
    * You may assume that the user of the bucket never inserts more than 'size'
    * elements.
    */
   public Bucket(int size)
   {
      bucket = new int[size];
      count = 0;
   }

   /* Inserts x on the next free place in the bucket */
   public void insert(int x)
   {

      bucket[count] = x;
      count++;

   }

   /* Sorts bucket, using a simple sorting method */
   public void sort()
   {

      for (int i = (bucket.length - 1); i >= 0; i--)
      {
         for (int j = 1; j <= i; j++)
         {
            if (bucket[j - 1] > bucket[j])
            {
               int temp = bucket[j - 1];
               bucket[j - 1] = bucket[j];
               bucket[j] = temp;
            }
         }
      }
   }

   /*
    * Copies the bucket elements into A; first is the first place in A to copy
    * an element from the bucket. The method returns how many elements have been
    * copied from the bucket
    */
   public int copyBucketInto(int[] A, int first)
   {
      int count = 0;
      for (int i = 0; i < bucket.length; i++)
      {
         if (bucket[i] > 0)
         {
            A[first] = bucket[i];
            first++;
            count++;
         }
      }
      return count;
   }

  
}
