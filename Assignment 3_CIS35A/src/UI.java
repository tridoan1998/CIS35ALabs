//User Interface class which display the welcome console and prompt the user to enter options to perform tasks
import java.util.*;
public class UI 
{
	//Welcome user and display options to calculate 
	public void DisplayConsole()
	{
		System.out.printf("\t\tWelcome to the Franchise Application!\nThis program contains the sale amount for 6 Starbuck stores for 5 weeks.\n");
		System.out.printf("Please enter 1 to 6 the option you wish to calculate!\n\n");
		System.out.printf("1. The total sales for each week\n");
		System.out.printf("2. The average daily sales for each week\n");
		System.out.printf("3. The total sales for all the weeks\n");
		System.out.printf("4. The average weekly sales\n");
		System.out.printf("5. The week with the highest amount in sales\n");
		System.out.printf("6. The week with the lowest amount in sales\n");
	}
	
	//prompt user to return an option from 1 to 6 to select the option to calculate 
	public int userInput()
	{
		//Scanner class for user input
		System.out.printf("\nEnter your option (1 to 6): ");
		Scanner input = new Scanner(System.in);	
		int userInput = input.nextInt();
		//edge cases
		while(userInput < 1 || userInput > 6)
		{
			System.out.printf("Please enter one of the option given (1 to 6): ");
			userInput = input.nextInt();
		}
		input.close();
		return userInput; 
	}
}