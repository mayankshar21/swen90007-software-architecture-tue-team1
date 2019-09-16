package datasource;

import java.util.ArrayList;
import java.util.List;

import domain.DomainObject;

public class UnitOfWork {
	private static ThreadLocal current = new ThreadLocal();
	
	private List<Object> newObjects = new ArrayList<Object>();
	private List<Object> dirtyObjects = new ArrayList<Object>();
	private List<Object> deletedObjects = new ArrayList<Object>();
	
	public static void newCurrent() {
		setCurrent(new UnitOfWork());
	}
	
	public static void setCurrent(UnitOfWork uow) {
		current.set(uow);
	}
	
	public static UnitOfWork getCurrent() {
		return (UnitOfWork) current.get();
	}
	
	public void registerNew(Object obj) {
		if ( obj. == null) {
			
		}
		Assert.isTrue(!dirtyObjects.contains(obj), "object is dirty");
		Assert.isTrue(!deletedObjects.contains(obj), "object is deleted");
		Assert.isTrue(!newObjects.contains(obj), "object is new");
		newObjects.add(obj);
	}
	
	public void registerDirty(DomainObject obj) {
		Assert.notNull(obj.getId(), "id is null");
		Assert.isTrue(!deletedObjects.contains(obj), "object is deleted");
		if (!dirtyObjects.contains(obj) && !newObjects.contains(obj)) {
			dirtyObjects.add(obj);
		}
	}
	
	public void registerDeleted(DomainObject obj) {
		Assert.notNull(obj.getId(), "id is null");
		if (newObjects.remove(obj)) return;
		dirtyObjects.remove(obj);
		if (!deletedObjects.contains(obj)) {
			deletedObjects.add(obj);
		}
	}
	
	public void registerClean(DomainObject obj) {
		Assert.notNull(obj.getId(), "id is null");
	}
	
	public void commit() {
		for (DomainObject obj : newObjects) {
			DataMapper.getMapper(obj.getClass()).insert(obj);
		}
		
		for (DomainObject obj : dirtyObjects) {
			DataMapper.getMapper(obj.getClass()).update(obj);
		}
		
		for (DomainObject obj : deletedObjects) {
			DataMapper.getMapper(obj.getClass()).delete(obj);
		}
	}
}
