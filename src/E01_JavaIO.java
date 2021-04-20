import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {

	private static Object fout;

	/*
	 * 
	 * JAVA I/O (Input / Output)
	 * 
	 * 자바는 스트림이라는 개념을 이용해 입출력을 다룬다 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다 (intput) 프로그램이
	 * 연산해서 내보내는 모든 데이터들을 출력이라 부른다 (output)
	 * 
	 * Stream
	 * 
	 * 데이터들이 오고가는 통로 입력 받을 때 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다 출력 할 떄 데이터들이
	 * 나가는 통로를 outputStream이라고 부른다 데이터가 Stream으로 이동할 때는 byte타입으로 변환되어야 한다
	 */

	public static void main(String[] args) {

		FileOutputStream fout = null;
		
		try {
			/*
			 절대 경로와 상대 경로
			 
			 원하는 자원까지의 경로를 뿌리(root)부터  모두 적는 것을 절대경로라고 한다
			 C:/, D:/,http://,https://, ftp://,file://, /
			 
			 절대 경로 C:/download.jpg
			 
			 원하는 자원까지의 경로를 현재 위치부터 찾아가는 것을 상대경로 라고 한다
			 상대경로는 반드시 ./ 또는 ../로 시작한다 
			 
			 ./ 현재 위치부터 시작
			 ../ 상위 폴더 
			 
			 	상대 경로 예
			 	- ./ ../ ../download.jpg
			 */
		}
		try {
			fout = new FileOutputStream("./a.txt",true);

			for (int i = 0; i < 10; ++i)
				fout.write(String.format("오늘은 날씨가 참 좋네요 \n", i).getBytes());

			// I/O 수동으로 close()를 호출해줘야 한다 (메모리 회수)

			// fout.close();
			System.out.println("파일 쓰기완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음");
		} catch (IOException e) {
			System.out.println("데이터를 쓰다가 문제가 생겼음");
		} finally {
			try {
				if (fout != null) fout.close();
			} catch (IOException e) {
			}
		}
	}
}
