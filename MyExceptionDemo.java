class TicketNotFoundException extends Exception{

public TicketNotFoundException() {
super("Out of Stock");
}
}

class BookmyShow
{
	static int availabletickets=10;
	
	
void bookTicket(int NoOfTickets)throws TicketNotFoundException
{
	
if(NoOfTickets >  availabletickets )
{
throw new TicketNotFoundException();
}

else
{
	availabletickets= availabletickets-NoOfTickets;
	//System.out.println(availabletickets);
System.out.println(NoOfTickets +" tickets Booked enjoy the show available tickets " + availabletickets);
}
}

}


public class MyExceptionDemo {

public static void main(String[] args) {
BookmyShow b=new BookmyShow();
BookmyShow b1=new BookmyShow();




try{
	
	
b.bookTicket(6);
b.bookTicket(2);
b1.bookTicket(1);
b.bookTicket(2);

}
catch (Exception e) {

System.out.println(e);
}

System.out.println("end of main");
}

}
