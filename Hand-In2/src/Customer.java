
public class Customer implements Runnable
{
	private NumberDispenser number;
	
	public Customer(NumberDispenser number)
	{
		this.number = number;
	}

	@Override
	public void run() 
	{
		while(true)
		{

				try {
					number.takeNextNumber();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	

}
