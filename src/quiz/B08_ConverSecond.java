package quiz;
import java.util.Scanner;
public class B08_ConverSecond {

   public static void main(String[] args) {
      //�ʸ� �Է¹����� ��/ ��/ �ð�/�� �ʷ� ��ȯ�Ͽ� ����غ�����
      //�ʿ���� ������ ������� ����
      //ex : 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
      System.out.print("�� > ");
      int second = new Scanner(System.in).nextInt();
      
      //900000000��
      //1�� 60 * 60 * 24 * 365 
      //1�� 60 * 60 * 24��
      //1�ð� 60*60��
      //1�� 60��
      //final int YEAR_POR_SECOND = 31536000;
      //final int DAY_POR_SECOND = 86400;
      //final int HOUR_POR_SECOND = 3600;
      //final int MINUTE_PER_SECOND = 60;
      //int original = second;
      int y = 0, d = 0, h = 0, m = 0, s = 0;
      //31,536,000
      y = second /  (60 * 60 * 24 * 365);
      second %= (60 * 60 * 24 * 365);
      
      d = second / ( 60 * 60 * 24);
      second %= (60 * 60 * 24);
      h = second / (60 * 60);
      second %=(60 * 60);
      m = second / (60 * 60);
      second %= 60;
      
      s = second;
      
      //System.out.pritnf("%d �ʴ� ��ȯ�ϸ� %d�� %d�� %d�ð� %d�� %d�� �Դϴ�",y,d,h,m,s);
      
   //   System.out.printf("%d�ʴ� ��ȯ�ϸ� ",  original);
      
      boolean exist = false;// ���� ��Ÿ���� ���� ����Ÿ��
      
      if (y != 0) {
         System.out.print(y + "��");
         exist = true;
      }
      if (exist || d !=0) {
         System.out.print(d + "��");
         exist = true;
         
      }
      if (exist || h !=0) {
         System.out.print(h + "�ð�");
         exist = true;
      }
      if(exist || m!= 0) {
         System.out.print(m + "��");
         exist = true;
      }
      System.out.print(s + "��");
   }

   
   }

