package bus.reservation.system;

import bus.reservation.client.TicketCounter;

/**
 * Tickets class will extend thread..
 * and on this ticket object, we are going to have two threads.
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
