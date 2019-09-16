package domain;

abstract class User {
	String name;
	String accountNameEmail;
	String password;
	int phoneNo;
	
	User(String name, String accountName, String pw){
		this.name = name;
		this.accountNameEmail = accountName;
		this.password = pw;
	}
}
