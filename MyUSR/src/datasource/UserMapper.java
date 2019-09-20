package datasource;

import domain.Customer;
import domain.DomainObject;
import domain.Service;
import domain.User;

public class UserMapper{
	
	public static boolean insert(DomainObject obj) throws Exception {
		if(obj instanceof Customer) {
			CustomerMapper.getThisClass().insert(obj);
		} else {
			throw new Exception("insert unknow type");
		}
			
		return false;
	}

	public static boolean update(DomainObject obj) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("not implemented");
		//return false;
	}

	public static boolean delete(DomainObject obj) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("not implemented");
		//return false;
	}

	public static DomainObject queryWithID(int id) throws Exception {
		//Adding more querys if add more user types in the future
		DomainObject cusResult = CustomerMapper.getThisClass().queryWithID(id);
		
		if(cusResult != null) {
			return cusResult; 
		} else {
			throw new Exception("Can't find this user with id =" + id);
		}
		//return null;
	}

}