package myobj.school;
import myobj.school.Student;
import myobj.school.ProggrammingStudent;

int sno;

	public C07_School() {
		sno = 10000;
	
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine+learning = new Student[30];
	
		for (int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
	}
}

	public static void main(String[] args) {
		
		new C07_School();
	}
}
