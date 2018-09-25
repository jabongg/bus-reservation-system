package bus.reservation.system;

import bus.reservation.client.TicketCounter;

/**
 * TicketsBookingThread class will extend thread..
 * 
 * @author jang
 *
 */
public class TicketsBookingThread extends Thread {

	
	private TicketCounter ticketCounter;
	private String passenger;
	private int noOfSeatsToBook;
	
	public TicketsBookingThread(TicketCounter ticketCounter, String passenger, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passenger = passenger;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}

	//override run method
	public void run() {
		ticketCounter.bookTicket(passenger, noOfSeatsToBook);
	}
	
}
