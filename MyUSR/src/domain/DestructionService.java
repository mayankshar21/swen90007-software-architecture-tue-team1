package domain;

import java.util.ArrayList;

public class DestructionService extends Service {
	
	private ArrayList<String> itemToDestroy;
	private ArrayList<String> itemDestroyed; 

	public DestructionService(String customerAccountName, String adminAccountName, int serviceID, String address, String bookingDateTime, Status status, String serviceDescription, String progressDescription, String assignedStaff) {
		super(customerAccountName, adminAccountName, serviceID, address, bookingDateTime, status, serviceDescription, progressDescription, assignedStaff);
		// TODO Auto-generated constructor stub
	}
	
	public void dataDestruction(ArrayList<String> itemToDestroy, ArrayList<String> itemDestroyed) {
		
	}
	
	public int applyDestructionPolicy() {
		return 0;
	}
	
	public void addItemToDestroy(String items) {
		
	}
	
	public void removeItemToDestroy(String items) {
		
	}
	
	public void addItemDestroyed(String items) {
		
	}
	
	public void removeItemDestroyed(String items) {
		
	}
	
}
