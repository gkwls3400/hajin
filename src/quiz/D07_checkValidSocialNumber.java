package quiz;

public class D07_checkValidSocialNumber {

	public boolean inValidSocialNumber(String sn) {
		
	static {
		private static HashSet<Integer> month31;
		private static HashSet<Integer> month30;
		
		Collections.addAll(month31, );
	}
		
		class InvalidMonthException extends RuntimeException{
			public InvalidMonthException() {
				super("�ֹε�Ϲ�ȣ 3,4�� �ùٸ��� ���� �� �Էµ�");
			}
		}

		try {
			int year = Integer.parseInt(sn.substring(0, 2));
			int month = Integer.parseInt(sn.substring(2, 4));
			int day = Integer.parseInt(sn.substring(4, 6));

			if (month > 12) {
				throw new InvalidMonthException();
//		} catch {NumberFormatException e) {
//				System.out.println("invalid ���ڰ� �ƴѰ��� ����");
//				return false;
//			
//		}
//		catch (NumberFormatException e) {
//			System.out.println("[invalid]" + e.getMessage());
//			return false;
//		}
//		return false;

	}

	public static void main(String[] args) {

		new D07_checkValidSocialNumber().inValidSocialNumber("ab1234-123456");

	}

}
