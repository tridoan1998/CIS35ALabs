/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */

/*
Req 3 - Implement abstract class and Interface (add this functionality in a package called adapter)
Create an API (A programming interface) to 
Print student statistics
Print score for a given student id
You should create an Interface called StudentAPI in which two methods are declared for functionality (Req 3 - 1 and 2) stated above.
You should create a class StudentAPIImpl that would implement StudentAPI. Using methods from other classes, (Student.java,
Statistics.java, StudentGrade.java, FileIO.java) 
implement the two methods in StudentAPI.
Create a driver demonstrating the usage of the API. Put this in a separate driver called Driver3. java. 
(Put this in driver package)
 */
package driver;


import adapter.*;
import model.*;
import util.FileIO;
public class Driver3 {
	public static void main(String[] args) {
		StudentGrade sg = new StudentGrade();
		Student lab2 [] = new Student[40];
		
		StudentAPIImpl a1 = new StudentAPIImpl(lab2,sg);
		
		a1.printscore(1234);
		a1.printstats(sg);
		
	}
}


//						Test Run 
//The result is included in the assignment folders. Those are the .txt file with four digits integers.