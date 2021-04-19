package quiz;

public class D07_PhoneBook {
/*
    # HashMap을 이용해 전화번호부를 구현해보세요
    
    1. 그룹 / 전화번호 / 이름을 저장해야 한다
    2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
    3. 전화번호 목록에 전화번호를 키값으로 넣으면 이름이 나온다
    
    # 구현해야 할 메서드
    
    1. 새로운 그룹을 추가하는 메서드 
    2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드 (그룹이 없다면 미분류 그룹에 저장) 
    3. 등록된 모든 전화번호부 정보를 이름기준 내림차순으로 보여주는 메서드
    4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드 
    5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드  
    */
	
	public boolean addGroup(String groupName) {
		if(phonebook.containKey(grupName)) {
			System.out.println("이미 존재하는 그룹입니다. : " + groupName);
			return false;
		} else {
			System.out.println("성공적으로 추가되었습니다 : " + groupName);
			return true;
		}
	}
	
	public void printGroupList() {
		for( String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook book = new D07_PhoneBook();
		
		book.addGroup("가족");
		book.addGroup("동호회");
		book.addGroup("초등학교 동창");

	}
}
