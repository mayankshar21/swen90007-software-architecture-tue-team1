package dbdomainmiddleware;

import java.util.ArrayList;
import java.util.List;

import datasource.ServiceMapper;
import datasource.UserMapper;

import domain.DomainObject;
import domain.Service;
import domain.User;

public class UnitOfWork {
	private static ThreadLocal<UnitOfWork> current = new ThreadLocal<UnitOfWork>();
	
	private List<DomainObject> newObjects = new ArrayList<DomainObject>();
	private List<DomainObject> dirtyObjects = new ArrayList<DomainObject>();
	private List<DomainObject> deletedObjects = new ArrayList<DomainObject>();
	
	public static void newCurrent() {
		setCurrent(new UnitOfWork());
	}
	
	public static void setCurrent(UnitOfWork uow) {
		current.set(uow);
	}
	
	public static UnitOfWork getCurrent() {
		return (UnitOfWork) current.get();
	}
	
	public void registerNew(User user) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (user.getID() == -1) 	throw new Exception("user unassigned id");
		if (dirtyObjects.contains(user))	throw new Exception("user object is dirty");
		if (deletedObjects.contains(user))	throw new Exception("user object is deleted");
		if (newObjects.contains(user))	throw new Exception("user object is new");
		newObjects.add(user);
	}
	
	public void registerNew(Service service) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (service.getID() == -1) 	throw new Exception("service unassigned id");
		if (dirtyObjects.contains(service))	throw new Exception("service object is dirty");
		if (deletedObjects.contains(service))	throw new Exception("service object is deleted");
		if (newObjects.contains(service))	throw new Exception("service object is new");
		newObjects.add(service);
	}
	
	public void registerDirty(User user) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (user.getID() == -1) 	throw new Exception("user unassigned id");
		if (deletedObjects.contains(user))	throw new Exception("user object is deleted");
		if (newObjects.contains(user))	throw new Exception("user object is new");
		if (dirtyObjects.contains(user)) throw new Exception("user object object is already dirty");
		dirtyObjects.add(user);
	}
	
	public void registerDirty(Service service) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (service.getID() == -1) 	throw new Exception("service unassigned id");
		if (deletedObjects.contains(service))	throw new Exception("service object is deleted");
		if (newObjects.contains(service))	throw new Exception("service object is new");
		if (dirtyObjects.contains(service)) throw new Exception("service object object is already dirty");
		dirtyObjects.add(service);
	}
	
	public void registerDeleted(User user) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (user.getID() == -1) 	throw new Exception("user unassigned id");
		if (deletedObjects.contains(user))	throw new Exception("user object is already deleted");
		if (newObjects.contains(user))	throw new Exception("user object is new");
		if (dirtyObjects.contains(user)) throw new Exception("user object object is dirty");
		deletedObjects.add(user);		
	}
	
	public void registerDeleted(Service service) throws Exception{
		//id=-1, is the default value when initial a user mean null
		if (service.getID() == -1) 	throw new Exception("service unassigned id");
		if (deletedObjects.contains(service))	throw new Exception("service object is already deleted");
		if (newObjects.contains(service))	throw new Exception("service object is new");
		if (dirtyObjects.contains(service)) throw new Exception("service object object is dirty");
		deletedObjects.add(service);		
	}
	
	public void commit() throws Exception {
		for (DomainObject obj : newObjects) {
			if (obj instanceof User) {
				UserMapper.insert(obj);
			} else if (obj instanceof Service) {
				ServiceMapper.insert(obj);
			}
		}
		
		for (DomainObject obj : dirtyObjects) {
			if (obj instanceof User) {
				UserMapper.update(obj);
			} else if (obj instanceof Service) {
				ServiceMapper.update(obj);
			}
		}
		
		for (DomainObject obj : deletedObjects) {
			if (obj instanceof User) {
				UserMapper.delete(obj);
			} else if (obj instanceof Service) {
				ServiceMapper.delete(obj);
			}
		}

	}
}