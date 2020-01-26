
public class PassportController implements Runnable
{
	private AirportQueue queue;

	
	public PassportController(AirportQueue queue) 
	{
		this.queue = queue;
	}

	@Override
	public void run() 
	{
		Passenger passenger = null;
		while(true)
		{
			
			try
			{
				passenger = queue.getNextPassenger();
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				//
			}
			System.out.println("Passenger checked with number " + passenger.getPassportNumber());
		}
	}
	
	

}
