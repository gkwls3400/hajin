import java.io.File;

public class E02_FileIO {

	/*
	 
	 java.util.File
	 
	 파일 시스템의 파일 정보를 담을 수 있는 클래스
	 */
	public static void main(String[] args) {
		
		//생성자로 경로 전달
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("C:/files/");
		File dir2 = new File("C:/files/");
		
		System.out.println("읽을수있는가" +a.canRead());
		System.out.println("실행가능한가" +a.canExecute());
		System.out.println("쓰기 권한이 있는가?"+ a.canWrite());
		
		
		//절대 경로 알아오기
		System.out.println(a.getAbsolutePath());
		
		
		//  a에 담긴 경로가 절대경로인가?
		System.out.println(a.isAbsolute());
		
		//a에 담긴 파일 인스턴스는 디렉토리인가?
		System.out.println("Is a directory?" + a.isDirectory());
		System.out.println("Is dir directory?" + dir.isDirectory());
		System.out.println("dir" + dir.exists());
		System.out.println("dir" + dir2.exists());
		
		System.out.println(a.exists());
		
		if (!dir2.exists()) {
			dir2.mkdir(); //mkdir(): 디렉토리 생성 메서드 
		} else {
			System.out.println("이미 존재하는 디렉토리입니다");
		}
	}
}
