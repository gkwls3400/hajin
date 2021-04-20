package quiz;
import java.util.Scanner;
public class B08_ConverSecond {

   public static void main(String[] args) {
      //초를 입력받으면 년/ 일/ 시간/분 초로 변환하여 출력해보세요
      //필요없는 단위는 출력하지 말것
      //ex : 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
      System.out.print("초 > ");
      int second = new Scanner(System.in).nextInt();
      
      //900000000초
      //1년 60 * 60 * 24 * 365 
      //1일 60 * 60 * 24초
      //1시간 60*60초
      //1분 60초
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
      
      //System.out.pritnf("%d 초는 변환하면 %d년 %d일 %d시간 %d분 %d초 입니다",y,d,h,m,s);
      
   //   System.out.printf("%d초는 변환하면 ",  original);
      
      boolean exist = false;// 분을 나타내기 위한 블리언타입
      
      if (y != 0) {
         System.out.print(y + "년");
         exist = true;
      }
      if (exist || d !=0) {
         System.out.print(d + "일");
         exist = true;
         
      }
      if (exist || h !=0) {
         System.out.print(h + "시간");
         exist = true;
      }
      if(exist || m!= 0) {
         System.out.print(m + "분");
         exist = true;
      }
      System.out.print(s + "초");
   }

   
   }

