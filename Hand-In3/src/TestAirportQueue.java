
public class TestAirportQueue 
{
	public static void main(String[] args)
	{
		AirportQueue<Object> queue1 = new AirportQueue<>();
		AirportQueue<Object> queue2 = new AirportQueue<>();
		PassportController contr1 = new PassportController(queue1);
		PassportController contr2 = new PassportController(queue2);
		Guide guide = new Guide(queue1, queue2);
		
		Thread contr1T = new Thread(contr1, "US control:");
		Thread contr2T = new Thread(contr2, "Non-US control:");
		Thread guideT = new Thread(guide, "Guide:");
		
		contr1T.start();
		contr2T.start();
		guideT.start();
		
	}

}
