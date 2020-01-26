
public class TestNumberDispenser 
{
	public static void main(String[] args)
	{
		NumberDispenser counter = new NumberDispenser();
		Customer cust1 = new Customer(counter);
		Customer cust2 = new Customer(counter);
		Customer cust3 = new Customer(counter);
		Customer cust4 = new Customer(counter);
		Customer cust5 = new Customer(counter);
		Customer cust6 = new Customer(counter);
		Customer cust7 = new Customer(counter);
		Customer cust8 = new Customer(counter);
		Customer cust9 = new Customer(counter);
		Customer cust10 = new Customer(counter);
		Clerk clerk1 = new Clerk(counter);
		Clerk clerk2 = new Clerk(counter);
		
		Thread cust1T = new Thread(cust1, "customer 1");
		Thread cust2T = new Thread(cust2, "customer 2");
		Thread cust3T = new Thread(cust3, "customer 3");
		Thread cust4T = new Thread(cust4, "customer 4");
		Thread cust5T = new Thread(cust5, "customer 5");
		Thread cust6T = new Thread(cust6, "customer 6");
		Thread cust7T = new Thread(cust7, "customer 7");
		Thread cust8T = new Thread(cust8, "customer 8");
		Thread cust9T = new Thread(cust9, "customer 9");
		Thread cust10T = new Thread(cust10, "customer 10");
		Thread clerk1T = new Thread(clerk1, "Clerk1");
		Thread clerk2T = new Thread(clerk2, "Clerk2");
		
		cust1T.start();
		cust2T.start();
		cust3T.start();
		cust4T.start();
		cust5T.start();
		cust6T.start();
		cust7T.start();
		cust8T.start();
		cust9T.start();
		cust10T.start();
		clerk1T.start();
		clerk2T.start();

	}

}
