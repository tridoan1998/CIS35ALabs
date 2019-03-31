/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment 5
Due Date: 03/04/2019
Date Submitted: 03/04/2019

Write a program to perform statistical analysis of scores for a class of students.
The program should print the lowest and highest scores for each quiz.
Read Student data from a text file.
Compute High, Low and Average for each quiz.
Print the Student data and display statistical information.
 */
public class Driver {

	public static void main(String[] args) {
		//declare an array of 40 Student objects 
		//already solved the NullPointerEXception problem
		Student StudentDataArray [] = new Student[40];
		
		for(int i = 0; i < StudentDataArray.length ;i++)	
			StudentDataArray[i] = new Student();
		
		
		//send the array to the Util Object to grab data from text file and return the Student objects with datas
		StudentDataArray = Util.readFile("C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 5_CIS35A\\src\\filename.txt", StudentDataArray);
		Statistics StatStudentDataArray = new Statistics();
		
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		//print out data from the Student array object 
		for(int i = 0; i < StudentDataArray.length; i++)
		{
			StudentDataArray[i].printScoresAndSID();
		}
		//methods to find low, high, average scores of Student Array Objects
		//Print statistics
		StatStudentDataArray.findlow(StudentDataArray);
		StatStudentDataArray.findhigh(StudentDataArray);
		StatStudentDataArray.findavg(StudentDataArray);
		//System.out.println(StudentDataArray[0].getScores()[0]);
		StatStudentDataArray.printdata();
	}
}
//						TEST RUN #1
/*
Stud Qu1 Qu2 Qu3 Qu4 Qu5
1234  52   7 100  78  34 
2134  90  36  90  77  30 
3124 100  45  20  90  70 
4532  11  17  81  32  77 
5678  20  12  45  78  34 
6134  34  80  55  78  45 
7874  60 100  56  78  78 
8026  70  10  66  78  56 
9893  34   9  77  78  20 
1947  45  40  88  78  55 
2877  55  50  99  78  80 
3189  22  70 100  78  77 
4602  89  50  91  78  60 
5405  11  11   0  78  10 
6999   0  98  89  78  20 

Low Score: 0  7  0  32  10  
High Score: 100  100  100  90  80  
Average: 46.2  42.3  70.5  75.7  49.7  
*/

//						TEST RUN #2
/*
Stud Qu1 Qu2 Qu3 Qu4 Qu5
1234  52   7 100  78  34 
2134  90  36  90  77  30 
3124 100  45  20  90  70 
4532  11  17  81  32  77 
5678  20  12  45  78  34 
6134  34  80  55  78  45 
7874  60 100  56  78  78 
8026  70  10  66  78  56 
9893  34   9  77  78  20 
1947  45  40  88  78  55 
2877  55  50  99  78  80 
3189  22  70 100  78  77 
4602  89  50  91  78  60 
5405  11  11   0  78  10 
6999   0  98  89  78  20 

Low Score: 0  7  0  32  10  
High Score: 100  100  100  90  80  
Average: 46.2  42.3  70.5  75.7  49.7  
*/