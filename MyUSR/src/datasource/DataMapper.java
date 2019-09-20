package datasource;

import domain.DomainObject;

public interface DataMapper {
	
	public boolean insert(DomainObject object);
	public boolean update(DomainObject object);
	public boolean delete(DomainObject object);
	public DomainObject queryWithID(int id);
	
}
