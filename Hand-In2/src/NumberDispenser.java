
public class NumberDispenser implements TakeANumber
{
	
	private int nextNumberToTake;
	private int nextNumberToServe;
	
	public NumberDispenser()  {
		this.nextNumberToTake=1;
		this.nextNumberToServe=1;	
	}

	@Override
	public synchronized void takeNextNumber()
	{
		int myNumber = nextNumberToTake;
		nextNumberToTake++;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+ "took next number "+ myNumber);
		while(myNumber > nextNumberToServe)
		{
			try
			{
				wait();
				System.out.println(Thread.currentThread().getName() + " waiting");
			}
			catch(InterruptedException e)
			{
				//
			}
		}
	}

	@Override
	public synchronized int nextCustomer() 
	{
		
		nextNumberToServe++;
		notifyAll();
		return nextNumberToServe-1;
	}

	

}
