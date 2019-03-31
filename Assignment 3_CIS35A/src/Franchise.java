//Franchise class has Store object and contains methods from the Store object  
//FRANCHISE CONTAIN(HAS) Store ARRAY
//EACH STORES HAS A TWO DIMENSIONAL ARRAY
public class Franchise {
	//FRANCHISE HAS AN ARRAY OF CLASS STORES 
	private Store stores[];
		
	//constructor that accept integer parameter to create store array with that given integer as size 
	//initialize Store inside Franchise 
	//
	public Franchise(int num) 
	{
			stores = new Store[num];    //containment: when an object (an instance variable is created with outer object creation.
	}

	public Store getStores(int i) 
	{
		return stores[i];
	}

	public void setStores(Store stores, int i) 
	{
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
	// call compute method in the Store class 
	public void ComputeStoreDataOfFranchise(int userInputOption)
	{		

		//stores[0].compute();
		for(int i =0; i < stores.length; i++)
		{
			System.out.printf("\n\t\t\t\t\t\t   STORE " + (i+1)+ "\n");
			//System.out.println();
			stores[i].PerformCalculationForEachStore(userInputOption);
			System.out.printf("\n------------------------------------------------------------------------------------------------------------------");
		}
	}

	//test all methods
	public void AnalyzeResults() 
	{
		for(int i =0; i < stores.length;i++)
		{	
			System.out.printf("\t\t\t\t\t\tStore " + (i+1));
			stores[i].AnalyzeResults();
		}
	}
}