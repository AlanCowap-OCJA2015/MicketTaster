
public class Ticket {
	int ticketID;
	Tier tier;
	Customer customer;
	boolean booked;
	String cardNumber;
	String name;
	String email;
	int customerID;
	
	public Ticket(int id, Tier t) {
		this.ticketID = id;
		this.tier = t;
	}
	
	public boolean isUnbooked() {
		return !this.booked;
	}
	public boolean isBooked() {
		return this.booked;
	}
	
	public void allocate (Customer c, Tier t) {
		this.customer = c;
		this.tier = t;
		this.cardNumber = c.cardNumber.toString();
		this.name = c.name.toString();
		this.email = c.email.toString();
		this.customerID = c.id;
		this.booked = true;
	}
}
