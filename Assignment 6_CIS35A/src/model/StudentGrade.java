/**
 * Name          : Tri Doan
 * Class         : CIS35A in class
 * Assignment # 6
 * Due Date      : 03/23/2019 
 * Date Submitted: 03/23/2019
 */
package model;

import java.io.*;

import util.*;

public class StudentGrade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Student[] studentList = new Student[40];
	private Statistics stats;
	public StudentGrade ()  {
		
	}
	
	public StudentGrade(Student[] s, Statistics stats) {
		this.studentList = s;
		this.stats = stats;
		
		stats.findavg(s);
		stats.findlow(s);
		stats.findhigh(s);
	}

	public Student[] getStudent() {
		return studentList;
	}

	public void setStudent(Student[] stu) {
		this.studentList = stu;
	}

	public Statistics getStats() {
		return stats;
	}

	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	
	
}
