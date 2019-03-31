
public class Student extends studentAbstract implements stu{
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

	@Override
	public void readStat() {
		
	}

	@Override
	public void readScores() {
		System.out.printf("\nHere is the score of the student with the SID %d :", SID);
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("%3d ", scores[i]);
		}
		System.out.println();
	}

	@Override
	public void findlow(Student[] ArrayStudentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findhigh(Student[] ArrayStudentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findavg(Student[] ArrayStudentObject) {
		// TODO Auto-generated method stub
		
	}
}