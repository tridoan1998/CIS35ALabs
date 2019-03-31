public class Ship {
	
	//instance variables 
	protected boolean floating;
	protected int capacity; 
	protected double length; 
	protected String name;
	protected String departturedate;
	
	//default constructor
	public Ship()
	{
		
	}
	
	//constructor with arguments
	public Ship(boolean floating, int capacity, double length, String name, String departturedate)
	{
		
		//System.out.println("Ship created!");
		//super();  //calling the super class object 
		this.floating = floating;
		this.capacity = capacity;
		this.length = length; 
		this.name = name;
		this.departturedate = departturedate;
	}
	
	//setter and getter 
	//all these are publics since we will implement it in the Driver class 
	public boolean isFloating() {
		return floating;
	}
	public void setFloating(boolean floating) {
		this.floating = floating;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartturedate() {
		return departturedate;
	}
	public void setDepartturedate(String departturedate) {
		this.departturedate = departturedate;
	}
	
	public void print()
	{
		System.out.printf("Ship is floating: %b \n" ,isFloating());
		System.out.printf("Ship capacity: %d \n", getCapacity());
		System.out.printf("Ship length: %.2f \n", getLength());
		System.out.printf("Ship name: %s \n" , getName());
		System.out.printf("Ship departure date: %s \n", getDepartturedate());
	}
}
