/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */

/*
Req 1 - Create a custom exception handler class called StudentGradingException 
that can (add this functionality in a package called exception)
Centralize capture of all exceptions
Logs exceptions in a text file.
Fixes at least one exception.
Demonstrate the usage of exception handler in a driver, throwing, 
logging and fixing the exception. Put this in a separate driver called Driver1. java.  
(Put this in driver package)
 */

package driver;

import exception.*;
public class Driver1 {


	public static void main(String[] args) throws Exception {
		
		boolean problemFixed = false;
		System.out.println("Inside main");
		StudentGradingException myproblem = new StudentGradingException("filenamethatdoesnotexist.txt"); 
		do {
			try {
				problemFixed = myproblem.openFile();
			}
			catch(FixProblems e)
			{
				myproblem.setFileName(e.fixProblemReadFromConsole()); 
			}
		}while(problemFixed == false);
		

	}

}

//							Test Run #1

/*
Inside main
FixProblems [errorno=0, errormsg=null]
got here --> fixProblemReadFromConsole
Now it is done!

*/

// 							Test run #2

/*
Inside main
FixProblems [errorno=0, errormsg=null]
got here --> fixProblemReadFromConsole
Now it is done!

*/
