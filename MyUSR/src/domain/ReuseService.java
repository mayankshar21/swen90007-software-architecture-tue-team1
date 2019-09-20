package domain;

import java.util.ArrayList;

public class ReuseService extends Service{
	
	private ArrayList<String> recoveryItems;

	public ReuseService(String customerAccountName, String adminAccountName, int serviceID, String address, String bookingDateTime, Status status, String serviceDescription, String progressDescription, String assignedStaff) {
		super(customerAccountName, adminAccountName, serviceID, address, bookingDateTime, status, serviceDescription, progressDescription, assignedStaff);
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
