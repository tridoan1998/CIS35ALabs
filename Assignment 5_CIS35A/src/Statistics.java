import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Statistics {
	int [] lowscores = new int [5];

	int [] highscores = new int [5];

	float [] avgscores = new float [5];

	
	/* This method will find the lowest score and store it in an   array names lowscores. */
	void findlow(Student [] ArrayStudentObject) {	
	
		//initialize the array with 0 
	for(int i = 0; i < lowscores.length; i++)
	{
		lowscores[i] = ArrayStudentObject[0].getScores()[0];
	}
	//run through all Student object for quiz 1, 2, 3, 4, 5
	for(int i = 0; i < lowscores.length; i++)
	{
		for(int j = 0; j < ArrayStudentObject.length; j++)
		{	
			if(lowscores[i] > ArrayStudentObject[j].getScores()[i])
			{
				lowscores[i] = ArrayStudentObject[j].getScores()[i];
			}
		}
	}
	}	
	
	/* This method will find the highest score and store it in an     array names highscores. */
	void findhigh(Student [] ArrayStudentObject) {
		//initialize the array with 0 
		for(int i = 0; i < highscores.length; i++)
		{
			highscores[i] = ArrayStudentObject[0].getScores()[0];
		}
		//run through all Student object for quiz 1, 2, 3, 4, 5
		for(int i = 0; i < highscores.length; i++)
		{
			for(int j = 0; j < ArrayStudentObject.length; j++)
			{
				if(highscores[i] < ArrayStudentObject[j].getScores()[i])
				{
					highscores[i] = ArrayStudentObject[j].getScores()[i];
				}
			}
		}
	}

	/* This method will find avg score for each quiz and store it in an array names avgscores. */
	void findavg(Student [] ArrayStudentObject) {
		//initialize the array with 0 
		for(int i = 0; i < avgscores.length;i++)
			{
				avgscores [i]= 0; 
			}
		
		//run through all Student object for quiz 1, 2, 3, 4, 5
		for(int i = 0; i < avgscores.length; i++)
		{
			for(int j = 0; j < ArrayStudentObject.length;j++)
			{
				avgscores[i] += ArrayStudentObject[j].getScores()[i];
			}
			avgscores[i] /= ArrayStudentObject.length;
		}
	}

	//method to print values of instance variables.
	public void printdata()
	{
		
		System.out.println();
		System.out.printf("Lowest Scores: ");
		for(int i = 0; i < lowscores.length; i++)
			System.out.printf("%d  " , lowscores[i] );
		
		System.out.println();
		System.out.printf("Highest Scores: ");
		for(int i = 0; i < highscores.length; i++)
			System.out.printf("%d  " , highscores[i] );
		
		System.out.println();
		System.out.printf("Average: ");
		for(int i = 0; i < avgscores.length; i++)
			System.out.printf("%.1f  " , avgscores[i] );
	}
}
