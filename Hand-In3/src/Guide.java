

public class Guide implements Runnable
{
	private AirportQueue queue1;
	private AirportQueue queue2;
	
	public Guide(AirportQueue queue1,AirportQueue queue2)
	{
		this.queue1 = queue1;
		this.queue2 = queue2;
	}
	
	
	@Override
	public void run()
	{
		
		while(true)
		{
			Passenger passenger;
			passenger=simPass();
			
			if(passenger.getNationality().equals("US"))
			{
				try
				{
					queue1.putPassengerInQueue(passenger);
					Thread.sleep(500);
					System.out.println("Passenger is put in US queue with passenger number " + passenger.getPassportNumber());
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				try
				{
					queue2.putPassengerInQueue(passenger);
					Thread.sleep(500);
					System.out.println("Passenger is put in Non-US queue with passenger number " + passenger.getPassportNumber());
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	private Passenger simPass()
	{
		Passenger p;
		int number = (int)(Math.random()*100+1);
		if(number%2 == 0)
		{
			p = new Passenger("US", number);
		}
		else
			p = new Passenger("Non US", number);
		return p;
	}
	
	
	

}
