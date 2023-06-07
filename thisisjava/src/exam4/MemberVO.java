package exam4;

import javax.management.loading.PrivateClassLoader;

public class MemberVO {
	private int memberid;
	private String idString;
	private String name;
	private String pwd;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//게터세터 자동생성 alt + shift + s > r > alt + a > r
	//메뉴 > source > Generate Getter Setter > select all
	


}
