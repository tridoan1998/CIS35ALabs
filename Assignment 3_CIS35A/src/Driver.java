/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment 3
Due Date: 02/15/2019
Date Submitted: 02/15/2019

NOTE: All test runs were commented out at the end of the program, class diagram included.

This program opens the salesdat.txt file and processes it contents. The program should display the following per store:
*The total sales for each week. (Should print 5 values - one for each week).
*The average daily sales for each week. (Should print 5 values - one for each week).
*The total sales for all the weeks. (Should print 1 value)
*The average weekly sales. (Should print 1 value)
*The week with the highest amount in sales. (Should print 1 week #)
*The week with the lowest amount in sales. (Should print 1 week #)
The file contains the dollars amount of sales that a retail store made each day for a number of weeks. 
Each line in the file contains thirty five numbers, which are sales numbers for five weeks.
The number are separated by space.  Each line in the file represents a separate store.
 */

//main class that create instances of other classes 
public class Driver {
	public static void main(String[] args) {
		//input data from the text file
		FileIO InputFile1 = new FileIO("C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 3_CIS35A\\src\\Salesdat.txt");
		//after this line, a Franchise class will be created and named it Franchise f
		Franchise Starbuck = InputFile1.readData();
		
		UI userInterface = new UI();								//create an object of UI class
		userInterface.DisplayConsole();								//display the welcome
		int userInputOptionNumber = userInterface.userInput();		//get user input option
		
		//perform calculation for all stores based on user selectimm 
		Starbuck.ComputeStoreDataOfFranchise(userInputOptionNumber);
		
		//Starbuck.AnalyzeResults();     //This method use to test all 6 calculations at once for all stores 
	}
}

/*
=================================================================================================================
										TEST RUN #1
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 1

						   STORE 1
Total sale for each week: 
Week 1: $16419.52	Week 2: $20615.00	Week 3: $24878.00	Week 4: $29141.00	Week 5: $33404.00	

------------------------------------------------------------------------------------------------------------------
						   STORE 2
Total sale for each week: 
Week 1: $12919.52	Week 2: $17115.00	Week 3: $21378.00	Week 4: $25641.00	Week 5: $29904.00	

------------------------------------------------------------------------------------------------------------------
						   STORE 3
Total sale for each week: 
Week 1: $19919.52	Week 2: $24115.00	Week 3: $28378.00	Week 4: $32641.00	Week 5: $36904.00	

------------------------------------------------------------------------------------------------------------------
						   STORE 4
Total sale for each week: 
Week 1: $23573.38	Week 2: $27768.86	Week 3: $32031.86	Week 4: $36294.86	Week 5: $40557.86	

------------------------------------------------------------------------------------------------------------------
						   STORE 5
Total sale for each week: 
Week 1: $16459.07	Week 2: $20654.55	Week 3: $24917.55	Week 4: $29180.55	Week 5: $33443.55	

------------------------------------------------------------------------------------------------------------------
						   STORE 6
Total sale for each week: 
Week 1: $26912.45	Week 2: $31107.93	Week 3: $35370.93	Week 4: $39633.93	Week 5: $43896.93	

------------------------------------------------------------------------------------------------------------------

==================================================================================================================
										TEST RUN #2
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 2

						   STORE 1
Average daily sales for each week: 
Week 1: $2345.65	Week 2: $2945.00	Week 3: $3554.00	Week 4: $4163.00	Week 5: $4772.00	
------------------------------------------------------------------------------------------------------------------
						   STORE 2
Average daily sales for each week: 
Week 1: $1845.65	Week 2: $2445.00	Week 3: $3054.00	Week 4: $3663.00	Week 5: $4272.00	
------------------------------------------------------------------------------------------------------------------
						   STORE 3
Average daily sales for each week: 
Week 1: $2845.65	Week 2: $3445.00	Week 3: $4054.00	Week 4: $4663.00	Week 5: $5272.00	
------------------------------------------------------------------------------------------------------------------
						   STORE 4
Average daily sales for each week: 
Week 1: $3367.63	Week 2: $3966.98	Week 3: $4575.98	Week 4: $5184.98	Week 5: $5793.98	
------------------------------------------------------------------------------------------------------------------
						   STORE 5
Average daily sales for each week: 
Week 1: $2351.30	Week 2: $2950.65	Week 3: $3559.65	Week 4: $4168.65	Week 5: $4777.65	
------------------------------------------------------------------------------------------------------------------
						   STORE 6
Average daily sales for each week: 
Week 1: $3844.64	Week 2: $4443.99	Week 3: $5052.99	Week 4: $5661.99	Week 5: $6270.99	
------------------------------------------------------------------------------------------------------------------

==================================================================================================================
										TEST RUN #3
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 3

						   STORE 1
The total sales for all the weeks: $124457.52
------------------------------------------------------------------------------------------------------------------
						   STORE 2
The total sales for all the weeks: $106957.52
------------------------------------------------------------------------------------------------------------------
						   STORE 3
The total sales for all the weeks: $141957.52
------------------------------------------------------------------------------------------------------------------
						   STORE 4
The total sales for all the weeks: $160226.80
------------------------------------------------------------------------------------------------------------------
						   STORE 5
The total sales for all the weeks: $124655.24
------------------------------------------------------------------------------------------------------------------
						   STORE 6
The total sales for all the weeks: $176922.17
------------------------------------------------------------------------------------------------------------------

==================================================================================================================
										TEST RUN #4
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 4

						   STORE 1
The average weekly sales: $24891.50
------------------------------------------------------------------------------------------------------------------
						   STORE 2
The average weekly sales: $21391.50
------------------------------------------------------------------------------------------------------------------
						   STORE 3
The average weekly sales: $28391.50
------------------------------------------------------------------------------------------------------------------
						   STORE 4
The average weekly sales: $32045.37
------------------------------------------------------------------------------------------------------------------
						   STORE 5
The average weekly sales: $24931.05
------------------------------------------------------------------------------------------------------------------
						   STORE 6
The average weekly sales: $35384.44
------------------------------------------------------------------------------------------------------------------										

==================================================================================================================
										TEST RUN #5
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 5

						   STORE 1
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------
						   STORE 2
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------
						   STORE 3
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------
						   STORE 4
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------
						   STORE 5
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------
						   STORE 6
The week with the highest amount in sales: 5
------------------------------------------------------------------------------------------------------------------										

==================================================================================================================
										TEST RUN #6
		Welcome to the Franchise Application!
This program contains the sale amount for 6 Starbuck stores for 5 weeks.
Please enter 1 to 6 the option you wish to calculate!

1. The total sales for each week
2. The average daily sales for each week
3. The total sales for all the weeks
4. The average weekly sales
5. The week with the highest amount in sales
6. The week with the lowest amount in sales

Enter your option (1 to 6): 6

						   STORE 1
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------
						   STORE 2
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------
						   STORE 3
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------
						   STORE 4
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------
						   STORE 5
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------
						   STORE 6
The week with the lowest amount in sales: 1
------------------------------------------------------------------------------------------------------------------										

==================================================================================================================
*/

