package domain;

public abstract class User implements DomainObject {
	private String name, accountEmail, password, phoneNo;
	private int id;
	
	User(String name, String accountEmail, String password){
		this.name = name;
		this.accountEmail = accountEmail;
		this.password = password;
		//TODO: cast dummy initial data
		id = -11;
		phoneNo = null;
	}
	

	abstract boolean login();
	abstract boolean updateProfile(String Name, String password, int phoneNo);

	@Override
	abstract public void applyIDMap();

	public String getName() {
		return name;
	}

	public String getAccountEmail() {
		return accountEmail;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	@Override
	public int getID() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}
	
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}