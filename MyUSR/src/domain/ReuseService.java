package domain;

import java.util.ArrayList;

public class ReuseService extends Service{
	
	private ArrayList<String> recoveryItems;

	public ReuseService(String customerAccountName, String address, String bookingDateAndTime,
			String serviceDescription) {
		super(customerAccountName, address, bookingDateAndTime, serviceDescription);
		// TODO Auto-generated constructor stub
	}
	
	
	public void resourceRecovery(String recoveryItems) {
		
	}
	
	public int applyRecoveryPolicy() {
		return 0;
	}
	
	public void addItem(String recoveryItem) {
		
	}
	
	public void removeItem(String recoveryItem) {
		
	}

}
