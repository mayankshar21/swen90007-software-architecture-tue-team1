package domain;

public class Customer extends User{

	Customer(String name, String accountName, String pw) {
		super(name, accountName, pw);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void updateProfile(String name, String password, int phoneNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void updateService(Service service) {
		// TODO Auto-generated method stub
		
	}
	
}
