package bus.reservation.system;

import bus.reservation.client.TicketCounter;

public class TicketBookingDriver {

	public static void main(String[] args) {
		TicketCounter ticket = new TicketCounter();
		TicketsBookingThread t1 = new TicketsBookingThread(ticket, "Ajay", 2);
		TicketsBookingThread t2 = new TicketsBookingThread(ticket, "JB", 2);

		t1.start();
		t2.start();
	}
}
