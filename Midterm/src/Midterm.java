
public class Midterm {
	private String firstName;
	private String province;
	private int courseCounter;
	private String[] course;
	private double[] score;
	
	public Midterm(String firstName, String province) {
		this.firstName = firstName;
		this.province = province;
		this.course = new String[6];
		this.score = new double[6];
		courseCounter = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getProvince() {
		return province;
	}

	@Override
	public String toString() {
		return firstName+" From "+province;
	}
	
	public void addCourseScore(String course, double score) {
		if(courseCounter>= this.course.length) {
			System.out.println("You could enroll only 6 course!!!");
		}else {
			this.course[courseCounter] = course;
			this.score[courseCounter] = score;
			courseCounter++;
		}
	}
	public void printGrade() {
		for(int i = 0; i<courseCounter; i++) {
			System.out.println("-"+course[i]+":"+score[i]);
		}
	}
	
	public double getAverageScore() {
		double sum = 0;
		for(int i = 0; i < courseCounter; i++) {
			sum += score[i];
		}
		
		double average = sum/courseCounter;
		return average;
	}
}
