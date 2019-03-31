/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package model;

public class Statistics {
	
	private int [] lowscores = new int [5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];

	
	/* This method will find the lowest score and store it in an array names lowscores. */
	public void findlow(Student [] a) {
		//Check if length of array > 0
		if(a.length > 0) {
			for(int quizIndex = 0; quizIndex < 5; quizIndex++) {
				//Set lowest score to first student.
				int lowest = a[0].getScores()[quizIndex];
			
				//Calculate lowest score of all students
				for (int stuIndex = 1; stuIndex < a.length; stuIndex++) {
					 if (a[stuIndex] != null){
						if(lowest > a[stuIndex].getScores()[quizIndex]) {
							lowest = a[stuIndex].getScores()[quizIndex];
						}
					}
				
				}
			//Set lowest score for each quiz index
			lowscores[quizIndex] = lowest;
			}
		}

	}

	/* This method will find the highest score and store it in an array names highscores. */
	public void findhigh(Student [] a) {
		//Check if length of array > 0
		if(a.length > 0) { 
			for(int quizIndex = 0; quizIndex < 5; quizIndex++) {
				//Set highest score to first student.
				int highest = a[0].getScores()[quizIndex];
			
				//Calculate highest score of all students
				for (int stuIndex = 0; stuIndex < a.length; stuIndex++) {
					if(a[stuIndex] != null){
						if(highest < a[stuIndex].getScores()[quizIndex]) {
							highest = a[stuIndex].getScores()[quizIndex];
						}
					}
				
				}
			//Set highest score for each quiz index
			highscores[quizIndex] = highest;
			}
		}
	}

	
	/* This method will find avg score for each quiz and store it in an array names avgscores. */
	public void findavg(Student [] a) {
		//Check if length of array > 0
		if(a.length > 0) {
			for(int quizIndex = 0; quizIndex < 5; quizIndex++) {
				float totalScoreForEachQuiz = 0f;
			
				//Calculating total students' score for each quiz index
				for(int stuIndex = 0; stuIndex < a.length; stuIndex++) {
					if(a[stuIndex] != null) {
						totalScoreForEachQuiz += a[stuIndex].getScores()[quizIndex];
					}	
				}
			
				//Calculate and assign value for the average of each quiz 
				avgscores[quizIndex] = totalScoreForEachQuiz / a.length;
			}
		}
	}

	//add methods to print values of instance variables.
	public void displayScores() { 
		System.out.println("\n\n*******************************************************");
		System.out.println("*********    CIS35A Quiz Scores Statistics    *********\n");
		
		System.out.println("Lowest Score For Each Quiz:");
		for(int i = 0; i < lowscores.length; i++) {
			System.out.print(lowscores[i] + "\t");
		}
		
		System.out.println("\n\nHighest Score for Each Quiz:");
		for(int i = 0; i < highscores.length; i++) {
			System.out.print(highscores[i] + "\t");
		}
		
		System.out.println("\n\nAverage Score for Each Quiz:");		
		for(int i = 0; i < avgscores.length; i++) {
			System.out.printf("%3.1f \t", avgscores[i]);
		}
		System.out.println("\n\n");
	}

}
