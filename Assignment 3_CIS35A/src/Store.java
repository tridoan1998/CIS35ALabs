//Store class where each Store object created will has two dimensional array and methods to manipulate data from the 2D array
public class Store {
	//2D array week = row ; day = column 
	private float salesbyweek[][];

	//constructor 
	Store() 
	{
		salesbyweek = new float[5][7];
	}

	//setters
	public void setsaleforweekdayintersection(int week, int day, float sale) 
	{
		//read from right to left, so sale go to salebyweek[week][day]
		salesbyweek[week][day] = sale;		
	}

	//getter 
	public float getsaleforweekdayintersection(int week, int day)
	{
		return salesbyweek[week][day];
	}
	
	//this method used to print out all data in the text file 
	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//call the six calculation functions
	public void PerformCalculationForEachStore(int UserInput)
	{
		switch(UserInput)
		{
		case 1:
			System.out.printf("Total sale for each week: \n");
			ArrayTotalSalesForWeek();
			break;
		case 2:
			System.out.printf("Average daily sales for each week: \n");
			ArrayAverageSaleForWeek();
			break;
		case 3:
			System.out.printf("The total sales for all the weeks: ");
			TotalSalesForAllTheWeeks();
			break;
		case 4:
			System.out.printf("The average weekly sales: ");
			AverageWeeklySales();
			break;
		case 5:
			System.out.printf("The week with the highest amount in sales: ");
			System.out.printf( "%d",WeekWithHighestAmountInSales());
			break;
		case 6:	
			System.out.printf("The week with the lowest amount in sales: ");
			System.out.printf( "%d",WeekWithTheLowestAmountInSales());
			break;
        default: 
        	System.out.printf("Invalid input!");
        	break;
		}
	}

	//return an array holding the total sales for each week. (Should print 5 values - one for each week).    //option 1
	public float [] ArrayTotalSalesForWeek()
	{
		//create array of size 5 to hold total sale of all 5 stores for each week
		float [] arraytotalsalesforweek = new float[5];
		//nested loop loop through all 7 days in a week and repeat for 5 weeks   
		for(int week = 0; week < 5;week++)
		{			
			for(int day = 0; day < 7; day++ )
			{
				arraytotalsalesforweek[week] += salesbyweek[week][day];		
				//arraytotalsalesforweek[week] += getsaleforweekdayintersection(week,day);	//calculate total sale for week
			}
		//Display result
		System.out.printf("Week " + (week+1) + ": $");
		System.out.printf("%.2f",arraytotalsalesforweek[week]);
		System.out.printf("\t");
		}
		System.out.println();
		return arraytotalsalesforweek;
	}
	
	//return array holding the average daily sales for each week. (Should print 5 values - one for each week).  //option 2
	public float [] ArrayAverageSaleForWeek() 
	{
		//create array of size 5 to hold average total sale of all 5 stores for each week
		float [] ArrayAverageSaleForWeek = new float[5];
		
		float TotalSaleFor7DayInAWeek = 0.0f;
		//nested loop loop through all 7 days in a week and repeat for 5 weeks   
		//find total and divide it by 7 days 
		for(int week = 0; week < 5;week++)
		{		
			TotalSaleFor7DayInAWeek = 0;
			for(int day = 0; day < 7; day++ )
			{
				//ArrayAverageSaleForWeek[week] += salesbyweek[week][day]/7;		
				TotalSaleFor7DayInAWeek +=  salesbyweek[week][day];
			}
			ArrayAverageSaleForWeek[week] = TotalSaleFor7DayInAWeek/7;
		//Display result
		System.out.printf("Week " + (week+1) + ": $");
		System.out.printf("%.2f",ArrayAverageSaleForWeek[week]);
		System.out.printf("\t");
		}
		return ArrayAverageSaleForWeek;
	}
	
	//return the total sales for all the weeks. (Should print 1 value)  //option 3
	public float TotalSalesForAllTheWeeks()
	{
		//variable hold total sale 
		float TotalSalesForAllTheWeeks = 0.0f;
		for(int week = 0; week < 5;week++)
		{			
			for(int day = 0; day < 7; day++ )
			{
				//TotalSalesForAllTheWeeks += getsaleforweekdayintersection(week, day);
				TotalSalesForAllTheWeeks += salesbyweek[week][day];

			}
		}
		System.out.printf("$");
		System.out.printf("%.2f", TotalSalesForAllTheWeeks);
	return TotalSalesForAllTheWeeks;
	}

	//return the average weekly sales. (Should print 1 value)   //option 4
	public float AverageWeeklySales()
	{
		float AverageWeeklySales = 0.0f;
		//float total = 0.0f;
		//find total and divide it by 5 weeks 
		for(int week = 0; week < 5;week++)
		{			
			//total = 0;
			for(int day = 0; day < 7; day++ )
			{
				AverageWeeklySales += salesbyweek[week][day]/5;  //$35384.44
				//total += salesbyweek[week][day];
			}
			//AverageWeeklySales = total /5;   //$1306.40
		}
		System.out.printf("$");
		System.out.printf("%.2f", AverageWeeklySales);
		return AverageWeeklySales;
	}
	
	//return the week with the highest amount in sales. (Should print 1 week #)
	public int WeekWithHighestAmountInSales()
	{
		float highest = 0.0f;
		float TotalSalePerWeek = 0.0f;
		int KeepWeek = 0;
		
		//loop through all five weeks 
		for(int week = 0; week < 5; week++)
		{
			TotalSalePerWeek = 0;
			//loop through all 7 days in a week to calculate total sale
			for(int day = 0; day <7; day++)
			{
				TotalSalePerWeek += salesbyweek[week][day];
			}
		//find highest total sale
		if(TotalSalePerWeek > highest)
		{
			highest = TotalSalePerWeek;
			KeepWeek = week;
		}
		}
		return KeepWeek+1;
	}
	
	//return the week with the lowest amount in sales. (Should print 1 week #)
	public int WeekWithTheLowestAmountInSales()
	{
		//declare variables
		float lowest = 0.0f;
		float [] TotalSalePerWeek = new float [5];
		int KeepWeek = 0;
		
		//create an array holding all 5 weeks of sales 
		for(int week = 0; week < 5; week++)
		{
			for(int day = 0; day <7; day++)
			{
				TotalSalePerWeek[week] += salesbyweek[week][day];
			}
		}
		//set lowest equal to the first element in the array 
		lowest = TotalSalePerWeek[0];
		//loop through the array and assign the lowest element to the lowest variable 
		for(int week = 0; week < 5; week++)
		{ 
			if(TotalSalePerWeek[week] < lowest)
			{
				lowest = TotalSalePerWeek[week];
				KeepWeek= week;
			}
		}
		return KeepWeek+1;
	}
	
	//call all the calculation methods 
	public void AnalyzeResults()
	{
		System.out.printf("\nTotal sale for each week: \n");
		ArrayTotalSalesForWeek();
		System.out.println("\nAverage daily sales for each week: ");
		ArrayAverageSaleForWeek();
		System.out.printf("\n\nThe total sales for all the weeks: ");
		TotalSalesForAllTheWeeks();
		System.out.printf("\n\nThe average weekly sales: ");
		AverageWeeklySales();
		System.out.printf("\n\nThe week with the highest amount in sales: ");
		System.out.printf( "%d",WeekWithHighestAmountInSales());
		System.out.printf("\n\nThe week with the lowest amount in sales: ");
		System.out.printf( "%d",WeekWithTheLowestAmountInSales());
	}
}