package myobj.school;

public abstract class Student {
	
	final static String[] lastNameList = {"강","고","구","권","김","나"};
	
	final static String[] firstNameList = {"태현","태환","태영","태희"};
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomScore();
	}
	
	public abstract void printGradeCard();
	
	int getRandomScore() {
		return (int)(Math.random()) * 101);
	}
	
	String getRandomName() {
		
	}

	