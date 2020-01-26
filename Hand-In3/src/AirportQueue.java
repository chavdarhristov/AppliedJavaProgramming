import utility.collection.*;

public class AirportQueue<T> implements PassengerQueue {
	private ArrayQueue<Passenger> list;

	public AirportQueue() {
		this.list = new ArrayQueue<>(100);

	}

	@Override
	public synchronized void putPassengerInQueue(Passenger p) 
	{
		list.enqueue(p);
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " Arrived passenger with number " + p.getPassportNumber());
	}

	@Override
	public synchronized Passenger getNextPassenger()  
	{
		while(list.isEmpty())
		{
			try
			{
				wait();
				System.out.println(Thread.currentThread().getName() + " is waiting");
			}
			catch(InterruptedException e)
			{
				//
			}
		}
		
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " next passenger in queue " + list.first());
		return list.dequeue();
	}

}
