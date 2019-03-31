public class CruiseShip extends Ship {

	//instance variable 
	private double ticketprice; 
	private int numberofrooms;
	private String cruisetype; 
	private String [] servies = new String[2];
	
	//default constructor
	public CruiseShip()
	{
		
	}
	
	//constructor with arguments 
	//calling super to grab variables selected from the parent class 
	public CruiseShip(boolean floating, int capacity, double length, String name, String departturedate, double ticketprice, int numberofrooms, String cruisetype, String servies1, String servies2)
	{
		super(floating, capacity, length, name, departturedate);
		this.ticketprice = ticketprice;
		this.numberofrooms = numberofrooms;
		this.cruisetype = cruisetype;
		servies[0] = servies1;
		servies[1] = servies2;
	}
	
	//setter and getter 
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	public int getNumberofrooms() {
		return numberofrooms;
	}
	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}
	public String getCruisetype() {
		return cruisetype;
	}
	public void setCruisetype(String cruisetype) {
		this.cruisetype = cruisetype;
	}

	public String[] getServies() {
		return servies;
	}

	public void setServies(String[] servies) {
		this.servies = servies;
	}

	public void buffetmenu()
	{
		System.out.println("\nBuffet Menu for the CruiseShip");
		System.out.printf("Ticket price is: %.2f \n", getTicketprice());
		System.out.printf("Number of rooms is: %d \n", getNumberofrooms());
		System.out.printf("Cruise type is: %s \n", getCruisetype());
		System.out.printf("Ship services included: %s and %s \n" , getServies());
	}
	//overriding 
	public void print()
	{
		System.out.println("\nCruiseShip object with variable overriding from the Ship class");
		super.print();
		System.out.printf("Ticket price is: %.2f \n", getTicketprice());
		System.out.printf("Number of rooms is: %d \n", getNumberofrooms());
		System.out.printf("Cruise type is: %s \n", getCruisetype());
		System.out.printf("Ship services included: %s and %s \n" , getServies());
	}
}
