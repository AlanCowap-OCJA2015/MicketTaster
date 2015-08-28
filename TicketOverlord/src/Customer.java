import java.util.ArrayList;

public class Customer {

	private String name;
	private long credtiCardNum;
	private String eMail;
	private byte ticketPrice;
	private ArrayList<Customer> concert;
	
	public Customer(){
//		this("unknown", 0L, "unknown", (byte)0);
	}
	
	public Customer(String newName, long newCreditCardNum, String newEmail, byte newTicketPrice, ArrayList<Customer> concert) {
		this.name = newName;
		this.credtiCardNum = newCreditCardNum;
		this.eMail = newEmail;
		this.ticketPrice = newTicketPrice;
		this.setConcert(concert);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public long getCredtiCardNum() {
		return credtiCardNum;
	}
	public void setCredtiCardNum(long credtiCardNum) {
		this.credtiCardNum = credtiCardNum;
	}
	public byte getTickedPrice() {
		return ticketPrice;
	}
	public void setTickedPrice(byte tickedPrice) {
		this.ticketPrice = tickedPrice;
	}

	public ArrayList<Customer> getConcert() {
		return concert;
	}

	public void setConcert(ArrayList<Customer> concert) {
		this.concert = concert;
	}
}
