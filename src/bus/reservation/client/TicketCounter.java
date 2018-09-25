package bus.reservation.client;

/**
 * This <i>TicketCounter</i> object will be shared, and 
 * On this <b>TicketCounter</b> object, we are going to have two threads working.
 * @author ajay
 *
 */
public class TicketCounter {

	private int ticketsAvailable = 3;

	/**
	 * The most important thing to note here is about synchronized and non-synchronized bookTicket method()
	 * 
	 * 1. if method not synchronized, then both can get booked tickets successfully... which in real case scenario,
	 * should not happen.
	 * 
	 * 2. to handle such situations, we will use synchronized keyword here.
	 * @param passenger
	 * @param seatsToBook
	 */
	synchronized public void bookTicket(String passenger, int seatsToBook) {

		if (seatsToBook > 0 && seatsToBook <= ticketsAvailable) {
			System.out.println("Hi " + passenger + 
					"! You have successfully booked " + seatsToBook + " tickets.");
			
			// update tickets available
			ticketsAvailable = ticketsAvailable - seatsToBook;
		} else {
			System.out.println("Sorry "+ passenger+ " ! " + seatsToBook + " tickets are not available.");
		}

	}

}
