public class CargoShip extends Ship {
	
	//instance variable 
	private String cargotype;
	private int numberofcranes;
	private String contraband;
	private double cargovalue;
	private String loadingmethod;
	
	//default constructor
	public CargoShip()
	{	
	}
	
	//constructor with arguments 
	//calling super to grab variables selected from the parent class 
	public CargoShip(boolean floating, int capacity, double length, String name, String departturedate, String cargotype, int numberofcranes, String contraband, double cargovalue, String loadingmethod)
	{
		super(floating, capacity, length, name, departturedate);
		
		this. cargotype = cargotype;
		this.numberofcranes = numberofcranes; 
		this.contraband = contraband;
		this.cargovalue = cargovalue;
		this.loadingmethod = loadingmethod;
		//System.out.println("Ship created!");
	}
	
	//setter and getter 
	public String getCargotype() {
		return cargotype;
	}
	public void setCargotype(String cargotype) {
		this.cargotype = cargotype;
	}
	public int getNumberofcranes() {
		return numberofcranes;
	}
	public void setNumberofcranes(int numberofcranes) {
		this.numberofcranes = numberofcranes;
	}
	public String getContraband() {
		return contraband;
	}
	public void setContraband(String contraband) {
		this.contraband = contraband;
	}
	public double getCargovalue() {
		return cargovalue;
	}
	public void setCargovalue(double cargovalue) {
		this.cargovalue = cargovalue;
	}
	public String getLoadingmethod() {
		return loadingmethod;
	}
	public void setLoadingmethod(String loadingmethod) {
		this.loadingmethod = loadingmethod;
	}

	//overriding 
	public void print()
	{
		System.out.println("\nCargoShip object with variable overriding from the Ship class");
		super.print();
		System.out.printf("Ship type: %s \n" , getCargotype());
		System.out.printf("Ship number of cranes: %d \n", getNumberofcranes());
		System.out.printf("Ship contraband: %s \n", getContraband());
		System.out.printf("Ship cargo value: $%.2f \n" , getCargovalue());
		System.out.printf("Ship loading method: %s \n",  getLoadingmethod());
	}
}