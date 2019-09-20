package domain;

import java.util.ArrayList;

import com.sun.prism.impl.Disposer.Record;

import dbdomainmiddleware.IdentityMap;
import dbdomainmiddleware.UnitOfWork;
import datasource.UserMapper;

public class Customer extends User {
	private ArrayList<Service> serviceList;
	public Customer(String name, String accountEmail, String password) {
		super(name, accountEmail, password);
		serviceList = null;
	}
	
	public Customer(int id, String name, String accountEmail, String password, String phoneNo, ArrayList<Service> serviceList){
		super(name, accountEmail, password);
		setId(id);
		setPhoneNo(phoneNo);
		if (serviceList == null) {
			serviceList = null;
		}else {
			this.serviceList = (ArrayList<Service>) serviceList.clone();
		}
	}
	
	public static boolean signUp(String name, String accountEmail, String password) {  
		boolean signupResult = false;
		UnitOfWork.newCurrent();
		//register to the UOW
		try {
			UnitOfWork.getCurrent().registerNew(new Customer(name, accountEmail, password));
			signupResult = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return signupResult; 
	}
	 
	public static Customer findWithID(int id) throws Exception {
		Customer customer = new Customer(null,null,null);
		IdentityMap<Customer> map = IdentityMap.getInstance(customer);
		customer = map.get(id);
		
		if (customer == null) {
			//read record from the database
			customer = (Customer) UserMapper.queryWithID(id);
			map.put(customer.getID(), customer);
		}
		return customer;
	}
	
	

	@Override
	boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean updateProfile(String Name, String password, int phoneNo) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public void applyIDMap() {
		// TODO Auto-generated method stub

	}

	public ArrayList<Service> getServiceList() {
		return serviceList;
	}
	
	
}