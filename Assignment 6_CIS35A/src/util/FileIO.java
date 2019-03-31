/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package util;


import java.util.*;
import java.io.*;
import model.*;
import model.*;

public class FileIO implements Serializable {
	public Student [] readFile(String filename, Student [] stu) {
		int count = 0;
		try {
			//Open the file name using FileReader
			FileReader file = new FileReader(filename);
			
			//BufferedReader is used when working with multiple threads. It's faster compared to Scanner because scanner does parsing
			//of input data and BufferedReader simply reads sequence of characters.
			BufferedReader buff = new BufferedReader(file);
			
			boolean eof = false;
			
			while (!eof) {
				String line = buff.readLine();
				count++; 
				if(line == null) {
					eof = true;
				}
				else {
					if(count == 1); // do nothing for the first line (Stud Qu1 Qu2 Qu3 Qu4 Qu5)
					if(count > 1) {
						stu[count-2] = buildStu(line);
					}
				}
				
			}
			buff.close();
		} catch(IOException e) {
			System.out.println("Error " + e.toString());
		}
	return stu;
	}

	public Student buildStu(String line) {
		
		//Create a temporary student 
		Student tempStu = new Student();
		int tempScores[] = new int[5];
		
		//Create String Tokenizer
		StringTokenizer st = new StringTokenizer(line);
		
		//convert String into an integer
		int SID = Integer.parseInt(st.nextToken());
		
		//set student's ID
		tempStu.setSID(SID);
		
		//set student's scores
		for(int i = 0; i < 5; i++) {
			tempScores[i] = Integer.parseInt(st.nextToken());
		}
		
		tempStu.setScores(tempScores);
		
		return tempStu;
	}

	//Serialize StudentGrade
	public void deliverGrade(StudentGrade s) {
		ObjectOutputStream output = null;
		String fileName;
			for(int i = 0; i < 15; i++) {
				
				int sID = s.getStudent()[i].getSID();
				
				fileName = Integer.toString(sID) + ".txt";
				
				try {
					output = new ObjectOutputStream(new FileOutputStream(fileName));
					output.writeObject(s.getStudent()[i]);
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
		
				try { 
					output.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
	
	//Deserialize StudentGrade
	public void readGrade(StudentGrade s) {
		ObjectInputStream input = null;
		String fileName;
		for(int i = 0; i < 15; i++) {
			int sID = s.getStudent()[i].getSID();
			
			fileName = Integer.toString(sID) + ".txt";
			
			try {
				input = new ObjectInputStream(new FileInputStream(fileName));
				Student stu = (Student) input.readObject();
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
		
}
