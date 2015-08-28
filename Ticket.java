public class Ticket {

		private int ticketPrice;
		private int numTickets65;
		private int numTickets100;
		private EventName event;
		
		public int getNumTickets65() {
			return numTickets65;
		}

		public int getNumTickets100() {
			return numTickets100;
		}
		
	public Ticket(int ticketPrice, EventName event){
		
		this.ticketPrice = ticketPrice;
		this.event = event;
		
		if(ticketPrice == 65){
			ticketPrice++;
		
		}else if(ticketPrice == 100){
			ticketPrice++;
		}
		
		
		
	}
		
		
}
