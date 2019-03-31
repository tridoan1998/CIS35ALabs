/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package adapter;

import model.*;

public interface StudentAPI {
	public void printstats(StudentGrade s);
	public void printscore(int sid);
}