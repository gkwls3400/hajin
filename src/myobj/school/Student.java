package myobj.school;

public abstract class Student {
	
	final static String[] lastNameList = {"��","��","��","��","��","��"};
	
	final static String[] firstNameList = {"����","��ȯ","�¿�","����"};
	
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

	