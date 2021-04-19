package quiz;

import java.util.Arrays;

public class B18_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
				{1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1, 1}
	};
	// 1.numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ㺸����
	for(int i = 0; i < numArr.length; ++i) {
		for(int j = 0; j < numArr[i].length; ++j) {
			numArr[i][j] = (int)(Math.random() * 101);
			System.out.printf("%5s, ",+ numArr[i][j]);
		}
		System.out.println();
	}
	
   
   // 2.numArr�� ���հ� ����� ���ؼ� ����غ�����
	int sum = 0;
	int count = 0;
	
	for(int i = 0; i < numArr.length; ++i) {
		for(int j = 0; j < numArr[i].length; ++j) {
			numArr[i][j] = (int)(Math.random() * 101);
			sum += numArr[i][j];
		}
	}
   System.out.printf("����: %d ���: %.2f\n", sum, sum / (double)count);
   // 3.numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
   
   int[] rowSum = new int[numArr.length];
   
   for(int i = 0; i < rowSum.length; ++i) {
	   
	   for (int j = 0; j < numArr[i].length; ++j) {
		   
		   rowSum[i] += numArr[i][j];
	   }
   }
   
   //�迭 ���ϰ� ����ϱ�
   //��������.�������̤�();
   System.out.println(Arrays.toString(rowSum));

   // 4.numArr�� �� ���� ���� ���ؼ� ����غ�����
   
   // row �� column ��
   
   int[] colSum = new int[7];
   
   for (int i = 0; i <colSum.length; ++i) {
	   
	   for (int j = 0; j < numArr.length; ++j) {
		   
		   if(numArr[j].length > i) {
		   colSum[i] +=numArr[j][i];
	   }
   }
}
	System.out.println("���� �� : " + Arrays.toString(colSum));
}
}
	
	

