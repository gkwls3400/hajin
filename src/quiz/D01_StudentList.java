package quiz;

import java.util.ArrayList;

import myobj.school.Student;
import myobj.school.Student2;

public class D01_StudentList {

		//�л� ���� ���� //���� ������//30�� ���// 30�� ���� �����л� �̸� ����// �̸��� �л� 0000 0001 ...
	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();
		
		for ( int i = 0; i < 30; ++i) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(stu.getTranscript()); 
			
		}
		for(Student2 stu : students) {
			
			System.out.println("------�ְ� ���� �л�---------");
			if (student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
		}
		
	}

}
