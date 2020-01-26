
public class Clerk implements Runnable
{
	private NumberDispenser number;
	
	public Clerk(NumberDispenser number)
	{
		this.number = number;
		
	}
	@Override
	public void run() 
	{
		while(true)
		
		{
				
				try 
				{
					number.nextCustomer();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	


}
