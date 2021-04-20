
public class B14_InnerLoop {

	public static void main(String[] args) {
		//반복문 내부에 반복문 사용하기 
		for (int i = 0; i< 10; i++) {
			System.out.printf("==========================바깥쪽 반복문 %d\n",i); 
			
			for ( int j = 0; j < 8; ++j) {
				System.out.printf("--------------------안족 반복문 %d-%d\n",i, j);
				
				for (int k = 0; k < 3; ++k) {
					System.out.printf("++++++제일 안쪽 반복문 %d - %d - %d)\n",i,j,k);
				}
			}
		}
	}
}
		
		   
			
		