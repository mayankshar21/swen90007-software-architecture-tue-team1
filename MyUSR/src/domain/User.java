package domain;

abstract class User extends DomainObject{
	String name;
	String accountNameEmail;
	String password;
	int phoneNo;
	
	User(String name, String accountName, String pw){
		this.name = name;
		this.accountNameEmail = accountName;
		this.password = pw;
	}
	
	abstract void updateProfile(String name, String password, int phoneNo);
	abstract void updateService(Service service);
}
