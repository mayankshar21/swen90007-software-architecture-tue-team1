package datasource;

import domain.DomainObject;
import domain.RecyclingService;

public class ServiceMapper {
	
	public static boolean insert(DomainObject obj) throws Exception {
		
		if(obj instanceof RecyclingService) {
			RecyclingServiceMapper.getThisClass().insert(obj);
		} else {
			throw new Exception("insert unknow type");
		}
		return false;
		
	}

	public static boolean update(DomainObject obj) {
		return false;
		
	}

	public static boolean delete(DomainObject obj) {
		return false;
	}

	public static DomainObject query(DomainObject obj) {
		return obj;
		
	}
}
