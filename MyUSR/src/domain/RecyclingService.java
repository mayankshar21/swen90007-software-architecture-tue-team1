package domain;

import datasource.RecyclingServiceMapper;
import dbdomainmiddleware.UnitOfWork;

public class RecyclingService extends Service {

	public RecyclingService(String customerAccountName, String adminAccountName, int serviceID, String address, String bookingDateTime, Status status, String serviceDescription, String progressDescription, String assignedStaff) {
		super(customerAccountName, adminAccountName, serviceID, address, bookingDateTime, status, serviceDescription, progressDescription, assignedStaff);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean createRecyclingService(String customerAccountName, String adminAccountName, int serviceID, String address, String bookingDateTime, Status status, String serviceDescription, String progressDescription, String assignedStaff) {
		boolean result = false;
		UnitOfWork.newCurrent();
		try {
			UnitOfWork.getCurrent().registerNew(new RecyclingService(customerAccountName, adminAccountName, serviceID, address, bookingDateTime, status, serviceDescription, progressDescription, assignedStaff));
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public int applyRecyclingPolicy() {
		return 0;
	}

}
