import java.io.*;
import java.util.*;
//FileIO class use to read data from the Salesdat.txt text file
public class FileIO 
{
	//declare string fname 
	private String fname = null;
	//declare boolean DEBUG 
	private boolean DEBUG = false;

	//constructor with fname parameter. Set parameter string to variable fname   
	public FileIO(String fname) {
		this.fname = fname;
	}

	//function readData with return type Franchise 
	public Franchise readData() 
	{
		// creating an object called Franchise
		Franchise a1 = null;
		//counter used for line number and reading 
		int counter = 0;
		//try-catch meaning if something go wrong in the try { } the data will send to the try { } for evaluation 
		try {
			//reading streams of characters 
			FileReader file = new FileReader(fname);
			//BufferReader class to cut out the words from the line
			BufferedReader buff = new BufferedReader(file);
			//record each string we want to read from the text file 
			String temp;
			//check end of file 
			boolean eof = false;
			//loop through the whole text file
			while (!eof) {
				//read the line 
				String line = buff.readLine();
				//add one to counter 
				//counter used to read line # 
				counter++;
				//end of the line
				if (line == null)
					eof = true;
				//not end of the line 
				else {
					//DEGUG technique - when DEBUG is true
					if (DEBUG)
						System.out.println("Reading line: " + line);
					if (counter == 1) {
						//set the line to a string 
						temp = line;
						//create the amount of stores read in from text file; new Franchise(6)
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("Number of stores created: " + a1.numberofstores()); //created 6 stores
					}
					//skip line #2 in the text file 
					if (counter == 2)		
						;
					//get to line with all the data 
					if (counter > 2) {
						  	int x = buildStore(a1, (counter-3), line);	//hold amount of weeks for one store 
							if (DEBUG)
							{
								//tell what store to read and number of weeks read 
								System.out.println("");
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							}
							if (DEBUG)
							{	
								//print data for the store in 2D array format [week][day] 
								System.out.println("Data read:");
								System.out.println("");
								a1.getStores(counter-3).printdata();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			//if try {} the input go wrong then the input will be sent to the catch scope to test 
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	//return an integer holding the amount of weeks
	//also setter for Store object. Set week, day, and sale from file
	public int buildStore(Franchise a1, int counter, String temp) {
		//make a new store object, put in the heap (NEW keyword)  
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		//track week and day
		int week = 0;
		int day = 0;
		//break a line into ,many strings
		StringTokenizer st = new StringTokenizer(temp);
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
	        	 //read in Token String 
		    	 s1 = st.nextToken();
		    	 //transfer string to float 
		         sale = Float.parseFloat(s1);
		         //setter for Store
	        	 tstore.setsaleforweekdayintersection(week, day, sale);
	         }
	         week++;
	    }
	    //setter for Store object 
		a1.setStores(tstore, counter);
	    return week; 
	}
}
