/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package adapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.*;
import util.FileIO;

public class StudentAPIImpl implements StudentAPI {
	
	private Student[] studentList = new Student[40];
	private StudentGrade stuGrade;
	//create some instance variables as needed.
	
	public StudentAPIImpl(String file) {
		
	}
	
	public StudentAPIImpl (Student[] s1, StudentGrade stuGrade) { // no default constructor
		this.studentList = s1;
		this.stuGrade = stuGrade;
		
		//read text file; create an array of students
		FileIO file = new FileIO();
		
		String fileName = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 6_CIS35A\\src\\filename.txt";
	
		s1 = file.readFile(fileName, s1);
		
		//build StudentGrade array.
		for(int i = 0; i < 15; i++) {
			stuGrade.getStudent()[i] = new Student();
			stuGrade.getStudent()[i] = s1[i];
		}
		
	}
	
	//serialize each index value of StudentGrade as a seperate .ser file 
			//— using studentid.ser as filename
			
	//call print() method in statistics class
	public void printstats(StudentGrade s) {
		//Deserialize StudentGrade
		String fileName;
		
		for(int i = 0; i < 15; i++) {
			
			int sID = s.getStudent()[i].getSID();
			
			fileName = Integer.toString(sID) + ".ser";
			
			try {
				FileInputStream file = new FileInputStream(fileName);
				ObjectInputStream  input = new ObjectInputStream(file);
				s = (StudentGrade) input.readObject();
				System.out.println(s.getStats());
			}
			catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
			
		}
	}
	
	public void printscore(int sid) { 
		//Deserialize StudentGrade
			String fileName;
			StudentGrade s = new StudentGrade();
			for(int i = 0; i < 15; i++) {			
				int sID = s.getStudent()[i].getSID();
					
				if(sID == sid) {
					fileName = Integer.toString(sID) + ".ser";
					
					try {
						FileInputStream file = new FileInputStream(fileName);
						ObjectInputStream  input = new ObjectInputStream(file);
						s = (StudentGrade) input.readObject();
					
						for(int j = 0; j < 5; j++) {
							System.out.println(s.getStudent()[sid].getScores());
						}
					}
					catch(IOException ex) 
					{ 
						System.out.println("IOException is caught"); 
					} 
			         
					catch(ClassNotFoundException ex) 
					{ 
						System.out.println("ClassNotFoundException is caught"); 
					} 
				}
			}
				
	}
}