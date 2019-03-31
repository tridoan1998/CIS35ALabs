/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package model;

import java.io.*;
public class Student implements Serializable{
	 //Data of class Student
	 private int SID;
	 private int scores[] = new int[5];
	 
	 //Constructors
	 public Student() {
		 
	 }
	 
	 public Student(int SID, int scores[]) {
		 this.SID = SID;
		 this.scores = scores;
	 }
	 
	 //Method
	 public int getSID() {
		 return SID;
	 }
	 
	 public void setSID(int ID) {
		 SID = ID;
	 }
	 
	 public int[] getScores() {
		 return scores;
	 }
	 
	 public void setScores(int [] scores) {
		 this.scores = scores;
	 }
	 
	 //Print method to print Student Information and Scores
	 
	 public void displayStu() throws IOException {
		 FileOutputStream fout = new FileOutputStream("StuScores.txt");
		 ObjectOutputStream oout= new ObjectOutputStream(fout);
		 
		 oout.writeObject(this.SID + " ");
		 for(int i = 0; i < scores.length; i++) {
			 oout.writeObject (this.scores[i] + " ");
		 }
		 
		 System.out.println("Student ID: " + this.getSID());
		 System.out.println("His/Her's quiz scores: ");
		 for(int i = 0; i < 5; i++) {
			 System.out.println(this.scores[i] + " ");
		 }
	 }
}
