package prac3;

import java.util.ArrayList;
import java.util.List;

public class UserTable {

	List<User> userList;
	int no; // 자동증가할 번호

	// 생성자(필드 초기화)
	UserTable() {
		no = 0;
		userList = new ArrayList<User>();

	}

	/*
	 * 번호, 아이디, 비밀번호, 이름 입력받아 User객체에 담아 리턴
	 */
	public User getUser(int no, String id, String pwd, String name) {
		return new User();
	}

	/*
	 * 아이디, 비밀번호, 이름 입력받아 현재 list에서 아이디가 존재하는지 여부 체크 getUser 메서드를 호출 객체 리턴받아 변수에 저장
	 * 존재하면 false 리턴 존재하지 않으면 리스트에 추가하고 true 리턴
	 *
	 * 수정 : findUser 메서드 활용 수정 : no를 1씩 증가되서 저장되도록
	 */
	public boolean insert(String id, String pwd, String name) {
		// findUser 사용해서 id 일치하는 것 찾기
		// 일치하지 않으면 false리턴 일치하면 입력받은것 userList에 입력
		User user = findUser(id); // findUser 함수로 id일치하는 것 찾아서
		if (user != null) { // user가 존재하면 false리턴
			return false;
		} // 아무것도 없으면 새로 user 생성하기
		return userList.add(getUser(++no, id, pwd, name));
	}

	/*
	 * 아이디를 입력받아 리스트에 해당 아이디의 객체 리턴 존재하지 않으면 null 리턴
	 */
	public User findUser(String id) {
		if (no > 0) {
			for (User user : userList) {
				if (user.getId().equals(id)) {
					return user;
				}
			}
		}
		return null;
		/*
		 * id를 입력받음
		 * User객체에서 for문을 돌려서 일치하는 id가 있는지 찾음
		 * 일치하는 id가 없으면 return하고 있으면 user객체
		 * 리턴
		 */
	}

	/*
	 * id로 이름,비밀번호 변경
	 */
	public boolean update(String id, String name, String pwd) {
		User user= findUser(id);
		if(user!=null) {
			user.setName(name);
			user.setPwd(pwd);
			return true;
		}
	return false;

	}

}
