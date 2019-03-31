
public class Student {
	 private int SID;

	 private int scores[] = new int[5];

	 Student()
	 {
		 
	 }

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public int[] getScores() {
		int temp [] = new int[scores.length];
		for(int i = 0; i < temp.length; i++)
			temp[i] = scores[i];
		return temp;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//add methods to print values of instance variables.
	public void printScoresAndSID()
	{
		System.out.printf("%d ", SID);
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("%3d ", scores[i]);
		}
		System.out.println();
	}
}