package domain;

import java.util.ArrayList;

public class DestructionService extends Service{
	
	private ArrayList<String> recoveryItems;
	

	public DestructionService(String customerAccountName, String address, String bookingDateAndTime,
			String serviceDescription, ArrayList<String> recoveryItems) {
		super(customerAccountName, address, bookingDateAndTime, serviceDescription);
		
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
