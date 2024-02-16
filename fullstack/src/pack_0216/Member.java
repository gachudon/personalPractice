package pack_0216;

public class Member extends Person {

	public Member(String name, String phoneNo) {
		super(name, phoneNo);
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String phoneNo, String address) {
		super(name, phoneNo, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "이름 "+super.getName()+" 연락처 "+super.getPhoneNo();
	}
	
	
}
