package nshin.spring.vo;

public class Member {

	protected int mno;
	protected String userid;
	protected String passwd;
	protected String name;
	protected String email;
	protected String joindate;
	
	// 생성자 1
	public Member( String userid, String passwd, String name, String email) {
		//this.mno = mno;
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		//this.joindate = joindate;
	}
	
	// 생성자 2
	public Member( int mno, String userid, String passwd, String name, String email, String joindate) {
		this(userid, passwd, name, email); //위 생성자에서 부른다는 뜻
		this.mno = mno;
		this.joindate = joindate;
	}
	

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	// toString 
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(mno).append(" ");
		sb.append(userid).append(" ");
		sb.append(name).append(" ");
		sb.append(email).append(" ");
		sb.append(joindate).append("\n");
		
		
		return sb.toString();
	}
	
	
	
}
