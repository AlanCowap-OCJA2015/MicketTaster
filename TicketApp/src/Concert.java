import java.util.ArrayList;

public class Concert {
	String description;
	ArrayList<Ticket> tier1Tickets;
	ArrayList<Ticket> tier2Tickets;
	Tier tier1;
	Tier tier2;

	public Concert(String d, double tier1Price, double tier2Price) {

		tier1 = new Tier("Tier 1", tier1Price);
		tier2 = new Tier("Tier 2", tier2Price);
		
		int ticketID = 0;
		
		tier1Tickets = new ArrayList<Ticket>();
		for (int i = 0; i < 60000; ++i) {
			tier1Tickets.add(new Ticket(ticketID++, tier1));
			
		}

		tier2Tickets = new ArrayList<Ticket>();
		for (int i = 0; i < 20000; ++i) {
			tier2Tickets.add(new Ticket(ticketID++, tier2));
			
		}
	}
	
	public boolean bookTicket (Customer c, int tier) {
		switch (tier) {
		
		case 1:
				for (Ticket t : tier1Tickets) {
					if (t.isUnbooked()) t.allocate(c, tier1);
					return true;
				}
			
		case 2:
			for (Ticket t : tier2Tickets) {
				if (t.isUnbooked()) t.allocate(c, tier2);
				return true;
			}

		}
		return false;
	}

}

