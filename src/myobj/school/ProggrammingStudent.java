package myobj.school;

int math;
int pl;

	public ProgrammingStudent() {
		math = getRandomScore();
		pl = getRandomScore();
	}
	
	public void printGradeCard() {
		System.out.printf("«–π¯\t¿Ã∏ß\t%s\t%s\t%s\t%s\t√—¡°\t∆Ú±’\n",
                subject_name[0], subject_name[1], subject_name[2], subject_name[3]);

System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
                sno, 
                name, 
                kor, 
                eng, 
                math, 
                pl, 
                kor + eng + math + pl, 
                (kor + eng + math + pl) / 4.0);        

System.out.println("---------------------------------------------------------------");
	}
}