/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package exception;

public class FixProblems extends Exception {
	private int errorno;
	private String errormsg;
	
	public FixProblems() {
		super();
		printmyproblem();
	}
	
	public FixProblems(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public FixProblems(int errorno) {
		super();
		this.errorno = errorno;
		printmyproblem();
	}
	
	public FixProblems(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public int getErrorno() {
		return errorno;
	}
	
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public void printmyproblem() {
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg + "]"); 
	}

	public String fixProblemReadFromConsole()
	{
		String a = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 6_CIS35A\\src\\filename.txt";
		System.out.println("got here --> fixProblemReadFromConsole");
		return a;
	}
}
