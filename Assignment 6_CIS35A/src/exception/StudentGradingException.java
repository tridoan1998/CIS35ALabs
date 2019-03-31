/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */

package exception;
import java.io.*;

public class StudentGradingException {
	private String fileName;
	
	StudentGradingException() { }
	
	public StudentGradingException(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean openFile() throws FixProblems
	{
		FileInputStream a1 = null;
		boolean flag = false;
		try {
			a1 = new FileInputStream(fileName);
			System.out.println("Now it is done!");
			flag = true;
		}
		catch(FileNotFoundException f)
		{
			throw new FixProblems();
		}
		finally 
		{			
			
		}	
		return flag;	
	}	
}
