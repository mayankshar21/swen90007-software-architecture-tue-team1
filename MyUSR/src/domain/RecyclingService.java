package domain;

public class RecyclingService extends Service{

	public RecyclingService(String customerAccountName, String address, String bookingDateAndTime,
			String serviceDescription) {
		super(customerAccountName, address, bookingDateAndTime, serviceDescription);
		// TODO Auto-generated constructor stub
	}
	
	public int applyRecyclingPolicy() {
		return 0;
	}

}
