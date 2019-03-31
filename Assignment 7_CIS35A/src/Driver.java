/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment 7
Due Date: 03/24/2019
Date Submitted: 03/24/2019

Create and implement an interface to:
Print student statistics.
Print scores for a given student id.
implement the Debug flag globally.
use Abstract class 
 */

import java.util.*;
public class Driver {

	public static void main(String[] args) {
		
		//declare DEBUG flag globally
		boolean DEBUG = false;
		
		
		//declare an array of 40 Student objects 
		//already solved the NullPointerEXception problem
		Student StudentDataArray [] = new Student[40];
		
		for(int i = 0; i < StudentDataArray.length ;i++)	
			StudentDataArray[i] = new Student();
		
		
		//send the array to the Util Object to grab data from text file and return the Student objects with datas
		StudentDataArray = Util.readFile("C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 5_CIS35A\\src\\filename.txt", StudentDataArray);
		System.out.println("This program will print student statistics,\nprint scores for a given student id,\nand implement the Debug flag globally with the use of abstract class.");
		System.out.printf("Please enter the student SID: ");
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		try {
			
	
			studentAbstract student = new Statistics();
			
			student.findlow(StudentDataArray);
			student.findhigh(StudentDataArray);
			student.findavg(StudentDataArray);
			student.readStat();
		
		int index = 0;
		while(userinput != StudentDataArray[index].getSID())
		{
			index++;
			
		}
		StudentDataArray[index].readScores();
		
		}catch (Exception ex)
		{
			System.out.println("\nSID number provided does not match with any record!");
		}
		
	}
}
//						TEST RUN #1
/*
This program will print student statistics,
print scores for a given student id,
and implement the Debug flag globally with the use of abstract class.
Please enter the student SID: 1234

Lowest Scores: 0  7  0  32  10  
Highest Scores: 100  100  100  90  80  
Average: 46.2  42.3  70.5  75.7  49.7  
Here is the score of the student with the SID 1234 : 52   7 100  78  34 

*/

//						TEST RUN #2
/*
This program will print student statistics,
print scores for a given student id,
and implement the Debug flag globally with the use of abstract class.
Please enter the student SID: 7874

Lowest Scores: 0  7  0  32  10  
Highest Scores: 100  100  100  90  80  
Average: 46.2  42.3  70.5  75.7  49.7  
Here is the score of the student with the SID 7874 : 60 100  56  78  78 

*/