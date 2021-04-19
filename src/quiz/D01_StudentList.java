package quiz;

import java.util.ArrayList;

import myobj.school.Student;
import myobj.school.Student2;

public class D01_StudentList {

		//학생 점수 랜덤 //과목 국영수//30명 평균// 30명 총점 높은학생 이름 성적// 이름은 학생 0000 0001 ...
	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();
		
		for ( int i = 0; i < 30; ++i) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(stu.getTranscript()); 
			
		}
		for(Student2 stu : students) {
			
			System.out.println("------최고 점수 학생---------");
			if (student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
		}
		
	}

}
