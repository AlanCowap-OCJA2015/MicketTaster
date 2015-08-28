import java.util.ArrayList;

public class Database {
	private ArrayList<ArrayList<Customer>> concertList = new ArrayList<ArrayList<Customer>>();
	
	{
		concertList.add(new ArrayList<Customer>());
		concertList.add(new ArrayList<Customer>());
		concertList.add(new ArrayList<Customer>());
		concertList.add(new ArrayList<Customer>());
		concertList.add(new ArrayList<Customer>());
	}
	
	
	
	public void addCustomer(int concert, Customer customer){
		concertList.get(concert).add(customer);
	}
	
	public void addCustomer(int concert, String name, long creditCard, String email, byte ticketPrice){
		concertList.get(concert).add(new Customer(name, creditCard, email, ticketPrice, concertList.get(concert)));
	}
}
