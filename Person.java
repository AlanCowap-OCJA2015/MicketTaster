import java.util.ArrayList;

public class Person {
	
	private StringBuilder name;
	private static StringBuilder creditCardNum;
	private StringBuilder email;
	private ArrayList<Ticket> tickets;
	
	Person(StringBuilder name){
		this(name, new StringBuilder("0000_0000_0000_0000"));
	}
	Person(StringBuilder name, StringBuilder creditCardNum){
		this(name, creditCardNum, new StringBuilder("joe@bloggs.com"));
	}
	Person(StringBuilder name, StringBuilder creditCardNum, StringBuilder email){
		this(name, creditCardNum, new StringBuilder("joe@bloggs.com"), new ArrayList<Ticket>() );
	}
	Person(StringBuilder name, StringBuilder creditCardNum, 
			StringBuilder email, ArrayList<Ticket> tickets){
		this.name = name;
		this.creditCardNum = creditCardNum;
		this.email = email;
		this.tickets = tickets;
	}

}
