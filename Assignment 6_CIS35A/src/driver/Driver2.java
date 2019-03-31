/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
/*
Req 2 - Deliver the grade for each student in a serialized file. ((add this functionality 
in a package called util and place the FileIO class in util package)
Imagine you are getting your grade report in a serialized file. This will contain your
id, lab scores and high, low and avg for each quiz. 
You should create a new class called StudentGrade (that contains Student and Statistics), 
then write a method to serialize StudentGrade in FileIO class.
Demonstrate serializing StudentGrade object in a separate driver called Driver2. java.  (Put this in driver package)
 */

package driver;

import java.util.Scanner;

import model.*;
import util.*;

public class Driver2 {
	
	public static void main(String[] args) {
		Student lab2 [] = new Student[40];
		StudentGrade sg = new StudentGrade();
		FileIO file = new FileIO();
		
		
		String fileName = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 6_CIS35A\\src\\filename.txt";
	
		lab2 = file.readFile(fileName, lab2);
		
		for(int i = 0; i < 15; i++) {
			sg.getStudent()[i] = new Student();
			sg.getStudent()[i] = lab2[i];
		}
		
		for(int i = 0; i < 15; i++) {
			sg.getStudent()[i] = lab2[i];
			
			//Serialize StudentGrade
			file.deliverGrade(sg);
			
			//Deserialize StudentGrade
			file.readGrade(sg);
		}
		
	}
}

// 							Test Run 
//the result is included in the assignment folders. Those are the .txt file with four digits integers.