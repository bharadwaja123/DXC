class TicketNotFoundException extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TicketNotFoundException() {
super("Out of Stock");
}
}

class BookMyShow
{
void bookTicket(int NoOfTickets)throws TicketNotFoundException
{
if(NoOfTickets > 5)
throw new TicketNotFoundException();

else
System.out.println(NoOfTickets +" tickets Booked enjoy the show");
}
}
		public class TicketNotFound {

		public static void main(String[] args) {
		BookMyShow b=new BookMyShow();

		try{
		b.bookTicket(6);
		}
		catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e);
		}

		System.out.println("end of main");
		}

		}

