import java.io.*;
import java.util.*;

public class Util {
	static Student [] readFile(String filename, Student [] stu) {
		//these codes will readLine through the entire file and count how many
		//lines the files has so we can declare the size of Student objects
		int counter = 0;
		try {
		FileReader file0 = new FileReader(filename);
        BufferedReader buff0 = new BufferedReader(file0);
		String line = buff0.readLine();
		while(line != null)
		{
			counter++;
			line = buff0.readLine();
		}
        buff0.close();
		}
		catch(IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}
		counter--;
	
		Student Stu[] = new Student[counter];
		
		try {
			//FileReader used to read in data from file
			FileReader file = new FileReader(filename);

			//BufferedReader class is used to read the text from a character-based input stream. 
			//It can be used to read data line by line by readLine() method. 
			//It makes the performance fast. It inherits Reader class.
	        BufferedReader buff = new BufferedReader(file);
	        //set up the loop to read in data from file 
			String line = buff.readLine();
			boolean eof = false;
			int arrayStudentcount = 0;		
			while (!eof) 
			{
				line = buff.readLine();
				if (line == null)
					eof = true;
				else	
				{				
					//these two variables to hold tokens 
					String HoldStringToken = "";
					int HoldIntererToken = 0;

					//declare tokens 
					StringTokenizer pieces = new StringTokenizer(line);
					while(pieces.hasMoreTokens())
					{
						
						HoldStringToken = pieces.nextToken();
						HoldIntererToken = Integer.parseInt(HoldStringToken);
						Stu[arrayStudentcount] = new Student(); 
						Stu[arrayStudentcount].setSID(HoldIntererToken);
						int [] arrtemp = new int[5];
						for(int i = 0; i < 5 ; i++)
						{	
							HoldStringToken = pieces.nextToken();
							arrtemp[i] = Integer.parseInt(HoldStringToken);
						}	
						Stu[arrayStudentcount].setScores(arrtemp);
					}
				}
				arrayStudentcount++;
			}
			buff.close();
			} 
			catch (IOException e) 
				{
					System.out.println("Error -- " + e.toString());
				}

		//Integer.parseInt(temp)

		//Reads the file and builds student array.
		
		//Open the file using FileReader Object.

		//In a loop read a line using readLine method.

		//Tokenize each line using StringTokenizer Object

		//Each token is converted from String to Integer using parseInt method

		//Value is then saved in the right property of Student Object.
		return Stu;
		}	
	}
