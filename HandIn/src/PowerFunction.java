
public class PowerFunction 
{
	private static long z;
	
	//recursive
		public static long power(long x, int n)
		{
			
			if (n == 0) {
		        return 1;
		    } else {
		        return x * power(x, n - 1);
		    }
			
		}
	//Iterative
	public static long power1(long x, int n)
	{
		long y = x;
		if(n == 0)
		{
			 y=1;
		}
		else if(n>0)
		{
			for(int i=1; i<n; i++)
			{
				y = y*x;
			}
		}
			return y;
	}
	public static void main(String[] args)
	{
		System.out.println(power(2, 0));
	}
	public static long power2(long x, int n)

	{
		
		if(n%2!=0)
		{
			z=power(x,n);
		}
		if(n%2==0)
		{
			z=sqr(x);
			for(int i=1; i<(n/2);i++)
			{
				z=z*sqr(x);
			}
		}
		return z;
	}
	private static long sqr(long x)
	{
		return x*x;
	}
	

}
