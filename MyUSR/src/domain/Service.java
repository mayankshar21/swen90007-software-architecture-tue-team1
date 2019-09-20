package domain;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Service implements DomainObject{
	private String customerAccountName;
	private String adminAccountName;
	private ArrayList<User> userList;
	private int serviceID;
	private String address;
	private String bookingDateTime;
	private Status status;
	private String serviceDescription;
	private String progressDescription;
	private String assignedStaff;
	private HashMap<String, Integer> priceList;
	
	
	public Service(String customerAccountName, String adminAccountName, int serviceID, String address, String bookingDateTime, Status status, String serviceDescription, String progressDescription, String assignedStaff) {
		super();
		this.adminAccountName = adminAccountName;
		this.customerAccountName = customerAccountName;
		this.serviceID = serviceID;
		this.address = address;
		this.bookingDateTime = bookingDateTime;
		this.status = status;
		this.serviceDescription = serviceDescription;
		this.progressDescription = progressDescription;
		this.assignedStaff = assignedStaff;
	}
	
	public void updateProgress(String assignedStaff) {
		
	}
	
	public void approve() {
		
	}
	
	public void reject() {
	
	}
	
	public void cancel() {
		
	}
	
	public void complete() {
		
	}
	
	public void bill() {
		
	}
	
	public void notifyUser() {
		
	}
	
	public void registerUser() {
		
	}
	
	public void unregisterUser() {
		
	}
	
	public String getCustomerAccountName() {
		return customerAccountName;
	}
	public void setCustomerAccountName(String customerAccountName) {
		this.customerAccountName = customerAccountName;
	}
	public String getAdminAccountName() {
		return adminAccountName;
	}
	public void setAdminAccountName(String adminAccountName) {
		this.adminAccountName = adminAccountName;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	public int getServiceID() {
		return serviceID;
	}
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(String bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public String getProgressDescription() {
		return progressDescription;
	}
	public void setProgressDescription(String progressDescription) {
		this.progressDescription = progressDescription;
	}
	public String getAssignedStaff() {
		return assignedStaff;
	}
	public void setAssignedStaff(String assignedStaff) {
		this.assignedStaff = assignedStaff;
	}
	public HashMap<String, Integer> getPriceList() {
		return priceList;
	}
	public void setPriceList(HashMap<String, Integer> priceList) {
		this.priceList = priceList;
	}
	
	@Override
	public void applyIDMap() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}
}
