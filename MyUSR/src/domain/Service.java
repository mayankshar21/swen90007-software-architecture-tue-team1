package domain;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Service {
	private String customerAccountName;
	private String adminAccountName;
	private ArrayList<User> userList;
	private int serviceID;
	private String address;
	private String bookingDateAndTime;
	private Status ;
	private String serviceDescription;
	private String progressDescription;
	private String assignedStaff;
	private HashMap<String, Integer> priceList;
	
	
	public Service(String customerAccountName,
			String address, String bookingDateAndTime, String serviceDescription) {
		super();
		this.customerAccountName = customerAccountName;
		this.address = address;
		this.bookingDateAndTime = bookingDateAndTime;
		this.serviceDescription = serviceDescription;
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
	public String getBookingDateAndTime() {
		return bookingDateAndTime;
	}
	public void setBookingDateAndTime(String bookingDateAndTime) {
		this.bookingDateAndTime = bookingDateAndTime;
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
	
}
